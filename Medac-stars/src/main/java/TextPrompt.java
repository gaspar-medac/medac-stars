import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

/**
 * The TextPrompt class will display a prompt over top of a text component when
 * the Document of the text field is empty. The Show property is used to
 * determine the visibility of the prompt.
 *
 * The Font and foreground Color of the prompt will default to those properties
 * of the parent text component. You are free to change the properties after
 * class construction.
 */
public class TextPrompt extends JLabel implements FocusListener, DocumentListener {
	private static final long serialVersionUID = 1L;

	public enum Show {
		ALWAYS, FOCUS_GAINED, FOCUS_LOST;
	}

	private JTextComponent component;
	private Document document;
	private Show show;
	private boolean showPromptOnce;
	private int focusLost;

	/**
	 * Constructor with default show setting.
	 *
	 * @param text      the text to display as a prompt
	 * @param component the JTextComponent to hold the prompt
	 */
	public TextPrompt(String text, JTextComponent component) {
		this(text, component, Show.ALWAYS);
	}

	/**
	 * Constructor with custom show setting.
	 *
	 * @param text      the text to display as a prompt
	 * @param component the JTextComponent to hold the prompt
	 * @param show      when to show the prompt
	 */
	public TextPrompt(String text, JTextComponent component, Show show) {
		this.component = component;
		this.show = show;
		document = component.getDocument();

		setText(text);
		setFont(component.getFont());
		setForeground(Color.gray);
		setHorizontalAlignment(JLabel.LEADING);

		// Add this label as a listener to the component and document.
		addListeners();
		// Configure the component to hold the prompt label.
		configureComponent();
		// Initial check to determine the prompt visibility.
		checkForPrompt();
	}

	/**
	 * Adds this object as both FocusListener and DocumentListener to the
	 * component and its document.
	 */
	private void addListeners() {
		component.addFocusListener(this);
		document.addDocumentListener(this);
	}

	/**
	 * Configures the layout and adds the prompt label to the component.
	 */
	private void configureComponent() {
		component.setLayout(new BorderLayout());
		component.add(this);
	}

	/**
	 * Change the style of the current Font.
	 * 
	 * @param style value representing the new style of the Font.
	 */
	public void changeStyle(int style) {
		setFont(getFont().deriveFont(style));
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public boolean getShowPromptOnce() {
		return showPromptOnce;
	}

	public void setShowPromptOnce(boolean showPromptOnce) {
		this.showPromptOnce = showPromptOnce;
	}

	/**
	 * Check whether the prompt should be visible or not. The visibility will
	 * change on updates to the Document and on focus changes.
	 */
	private void checkForPrompt() {
		boolean hasText = document.getLength() > 0;
		boolean shouldShow = show == Show.ALWAYS ||
				(show == Show.FOCUS_GAINED && component.hasFocus()) ||
				(show == Show.FOCUS_LOST && !component.hasFocus());

		setVisible(!hasText && (!showPromptOnce || focusLost == 0) && shouldShow);
	}

	// Implement FocusListener
	public void focusGained(FocusEvent e) {
		checkForPrompt();
	}

	public void focusLost(FocusEvent e) {
		focusLost++;
		checkForPrompt();
	}

	// Implement DocumentListener
	public void insertUpdate(DocumentEvent e) {
		checkForPrompt();
	}

	public void removeUpdate(DocumentEvent e) {
		checkForPrompt();
	}

	public void changedUpdate(DocumentEvent e) {
		// Update not needed on attribute change
	}
}

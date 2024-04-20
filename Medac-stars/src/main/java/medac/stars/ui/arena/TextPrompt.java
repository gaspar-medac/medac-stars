package medac.stars.ui.arena;

/**
 *
 * @author Monkeyelgrande
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;


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
         * Constructor Vacio
         * @param text
         * @param component 
         */
	public TextPrompt(String text, JTextComponent component) {
		this(text, component, Show.ALWAYS);
	}
        /**
         * Constructor Sobrecargado
         * @param text
         * @param component
         * @param show 
         */
	public TextPrompt(String text, JTextComponent component, Show show) {
		this.component = component;
		setShow(show);
		document = component.getDocument();

		setText(text);
		setFont(component.getFont());
                

		setForeground(Color.gray);

		setHorizontalAlignment(JLabel.LEADING);

		component.addFocusListener(this);
		document.addDocumentListener(this);

		component.setLayout(new BorderLayout());
		component.add(this);
		checkForPrompt();
	}

        /**
         * establece el estilo de la fuente
         * @param style 
         */
	public void cambiarEstilo(int style) {
		setFont(getFont().deriveFont(style));
	}

	/**
	 * Obtencion de la propiedad Show
	 * @return
	 */
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
         * Comprueba si hay un texto en el campo y desactiva la visibilidad del "placeholder", si no detecta texto activa la visibilidad del "placeholder"
         */
	private void checkForPrompt() {

		if (document.getLength() > 0) {
			setVisible(false);
			return;
		}

		if (showPromptOnce && focusLost > 0) {
			setVisible(false);
			return;
		}

		if (component.hasFocus()) {
			if (show == Show.ALWAYS || show == Show.FOCUS_GAINED)
				setVisible(true);
			else
				setVisible(false);
		} else {
			if (show == Show.ALWAYS || show == Show.FOCUS_LOST)
				setVisible(true);
			else
				setVisible(false);
		}
	}

	// Implementacion de los FocusListeners

	public void focusGained(FocusEvent e) {
		checkForPrompt();
	}

	public void focusLost(FocusEvent e) {
		focusLost++;
		checkForPrompt();
	}

	// Implementacion de los DocumentListeners

	public void insertUpdate(DocumentEvent e) {
		checkForPrompt();
	}

	public void removeUpdate(DocumentEvent e) {
		checkForPrompt();
	}

	public void changedUpdate(DocumentEvent e) {
	}
}

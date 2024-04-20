package medac.stars.ui.usuarios.PanelPrincipalGestor;

import medac.stars.model.User;
import medac.stars.ui.usuarios.Usuario;
import medac.stars.ui.usuarios.tablaGestionUsuarios.TablaGestionUsuarios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Cristian
 */
public class PanelPrincipalGestor extends JFrame{
    private JButton bAnyadirUsuario;
    private JButton bEditarUsuarios;
    private JPanel panelPrincipal;

    private User usuario;

    /**
     * Constructor por defecto del panel principal
     */
    public PanelPrincipalGestor(){
        add(panelPrincipal);// Lanza la ventana
        setTitle("TestUI"); //Título de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Establece como se van a cerrar las ventanas
        setSize(700, 500);//Establece el tamaño de la ventana
        setLocationRelativeTo(null);
        setVisible(true);

        /**
         * Hace aparecer la creación de usuarios al dar al botón de añadir
         */
        bAnyadirUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Usuario(null).setVisible(true);
               dispose();
            }
        });

        /**
         * Hace que se lance la tabla de edición de usuarios al pulsar el botón
         */
        bEditarUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TablaGestionUsuarios().setVisible(true);
                dispose();
            }
        });
    }

    /**
     * Main del panel principal
     * @param Args
     */
    public static void main(String[] Args){
        new PanelPrincipalGestor();
    }
}

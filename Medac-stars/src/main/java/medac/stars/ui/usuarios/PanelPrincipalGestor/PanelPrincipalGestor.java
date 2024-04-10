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

    public PanelPrincipalGestor(){
        add(panelPrincipal);
        setTitle("TestUI"); //Título de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Establece como se van a cerrar las ventanas
        setSize(700, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        bAnyadirUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Usuario(null).setVisible(true);
               dispose();
            }
        });
        bEditarUsuarios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TablaGestionUsuarios().setVisible(true);
                dispose();
            }
        });
    }


    public static void main(String[] Args){
        new PanelPrincipalGestor();
    }
}

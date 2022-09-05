package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import static java.awt.Font.BOLD;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
        //---------------
    // Atributos
    // --------------
    public JButton btDatos;
    public JButton btQuestionario;
    public JButton btSalir;
    private Color acolor= new Color(132, 171, 185);
    private Font fuente1= new Font("Didot", java.awt.Font.BOLD, 14);
    private Color pcolor= new Color(132, 171, 185);
    private Font fuente= new Font("Tahoma", java.awt.Font.BOLD, 20);
    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelOperaciones()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        // crear y agregar boton 
        btDatos = new JButton("Datos");
        btDatos.setBounds(40,40,215,60);
        btDatos.setBackground(acolor);
        btDatos.setForeground(Color.white);
        btDatos.setFont(fuente1);
        this.add(btDatos);
        btDatos.setActionCommand("Datos");

        //crear y agregar boton hallar
        btQuestionario = new JButton("Questionario");
        btQuestionario.setFont(fuente1);
        btQuestionario.setForeground(Color.white);
        btQuestionario.setBounds(280,40,215,60);
        btQuestionario.setBackground(acolor);
        this.add(btQuestionario);
        btQuestionario.setActionCommand("Questionario");

        // crear y agregar boton salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(530,40,215,60);
        btSalir.setBackground(acolor);
        btSalir.setFont(fuente1);
        btSalir.setForeground(Color.white);
        this.add(btSalir);
        btSalir.setActionCommand("Salir");

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Operacion Datos");
        borde.setTitleColor(pcolor);
        borde.setTitleFont(fuente);
        this.setBorder(borde);
    }


    public void agregarOyentesBotones(ActionListener pAL)
    {
        btDatos.addActionListener(pAL);
        btQuestionario.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }

}

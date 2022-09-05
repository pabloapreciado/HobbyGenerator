package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import modelo.Menu;

public class PanelResultados extends JPanel
{
        //---------------
    // Atributos
    // --------------
    private JTextArea taResultado;
    private JScrollPane spResultado;
    private JTextArea taResultado2;
    private JScrollPane spResultado2;
    private Color bcolor= new Color(235, 248, 163 );
    private Font fuente3= new Font("Comic Sans MS", 12,12);
    private Color pcolor= new Color(132, 171, 185);
    private Font fuente= new Font("Tahoma", java.awt.Font.BOLD, 20);
    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelResultados()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar area de texto 
        taResultado= new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20,380,200);
        spResultado.setForeground(bcolor);
        spResultado.setFont(fuente3);
        this.add(spResultado);

        //Crear y agregar area de texto 
        taResultado2= new JTextArea();
        spResultado2 = new JScrollPane(taResultado2);
        spResultado2.setBounds(390,20,380,200);
        spResultado2.setBackground(bcolor);
        this.add(spResultado2);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(pcolor);
        borde.setTitleFont(fuente);
        this.setBorder(borde);

    }
    // metodo de acceso a la informacion
    public void mostrarResultado(String nombre,String edad,String profesion,String email,String ser)
    {
        taResultado.setText("Nombre :" + nombre + "\nEdad :" + edad + "\nProfesion: " + profesion  + "\nCorreo : " + email +"@gmail.com"+ "\nForma de ser :" +  ser +"\n\n*HAZ CLICK EN EL BOTON QUESTIONARIO* \n(DIGITA A,B Ó C EN MAYUSCULA)");
        taResultado.setFont(fuente3);
    }

    public void mostrarResPreguntas(String respuesta)
    {
        taResultado2.setText(respuesta);
        taResultado2.setFont(fuente3);
    }

    // borrar resultados
    public void borrar()
    {
        taResultado.setText("");
    }  
}
package vista;

import javax.swing.JFrame;
import java.awt.Color;

public class VentanaPrincipal   extends JFrame
{
    //----------
    // Atributos
    //----------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    private Color wcolor= new Color(220, 255, 209);

    //----------
    // Metodos
    //----------

    /*Método constructor*/
    
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        // Crear y agregar el PanelEntrada
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,780,250);
        miPanelEntradaDatos.setBackground(wcolor);
        this.add(miPanelEntradaDatos);

        // Crear y agregar el PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,270,780,150);
        this.add(miPanelOperaciones);

        // Crear y agregar el PanelEntrada
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,430,780,310);
        this.add(miPanelResultados);
        

        // Caracteristicas de la ventana
        this.setTitle("HOBBYGENERATOR");
        this.setSize(800,700);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

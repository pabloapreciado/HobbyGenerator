package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;

public class PanelEntradaDatos extends JPanel
{  
    private JLabel lbNombre;
    private JLabel lbEdad;
    private JLabel lbProf;
    private JLabel lbEmail;
    private JLabel lbSer;
    private JTextField tfNombre;
    private JTextField tfEdad;
    private JTextField tfProf;
    private JTextField tfEmail;
    private JComboBox tfSer;
    private Font fuente= new Font("Tahoma", java.awt.Font.BOLD, 20);
    private Font fuente4= new Font("Georgia", java.awt.Font.BOLD, 12);
    private Color pcolor= new Color(132, 171, 185);
    private JLabel lImagen;
    private ImageIcon iImagen;
    
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(("Deporte.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(530,27,238,212);
        this.add(lImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNombre = new JLabel("Nombre y Apellido = ");
        lbNombre.setBounds(40,40,200,20);
        lbNombre.setFont(fuente4);
        add(lbNombre);
        
        lbEdad = new JLabel("Edad = ");
        lbEdad.setBounds(40,70,60,20);
        lbEdad.setFont(fuente4);
        add(lbEdad);
        
        lbProf = new JLabel("Ocupacion = ");
        lbProf.setBounds(40,100,100,20);
        lbProf.setFont(fuente4);
        add(lbProf);

        lbEmail = new JLabel("Email = ");
        lbEmail.setBounds(40,130,100,20);
        lbEmail.setFont(fuente4);
        add(lbEmail);

        lbSer = new JLabel("Que caracterisa tu forma de ser = ");
        lbSer.setBounds(40,170,400,20);
        lbSer.setFont(fuente4);
        add(lbSer);
        
        
        //Creación y adición de campos de texto
        tfNombre = new JTextField("Name");
        tfNombre.setBounds(200, 40, 140, 20);
        add(tfNombre);
        
        tfEdad = new JTextField("Age");
        tfEdad.setBounds(200, 70, 100, 20);
        add(tfEdad);
        
        tfProf = new JTextField("occupation");
        tfProf.setBounds(200, 100, 100, 20);
        add(tfProf);

        tfEmail = new JTextField("Email");
        tfEmail.setBounds(200, 130, 100, 20);
        add(tfEmail);


        //Creación e inserción del combo
        tfSer = new JComboBox();
        String[] lista = {"Emotivo","Introvertido","Extrovertido","Sentimental"};
        
        for(int i=0; i<lista.length;i++)
        {
            tfSer.addItem(lista[i]);
        }
        tfSer.setBounds(275, 170, 100, 20);
        add(tfSer);

        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Personales");
        borde.setTitleColor(pcolor);
        borde.setTitleFont(fuente);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getTfNombre()
    {
        return tfNombre.getText();
    }
    
    public String getTfEdad()
    {
        return tfEdad.getText();
    }
    
    public String getTfProf()
    {
        return tfProf.getText();
    }
    public String getTfEmail()
    {
        return tfEmail.getText();
    }
    public String getTfSer()
    {
        return (String) tfSer.getSelectedItem();
    }
    
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNombre.setText("");
        tfEdad.setText("");
        tfProf.setText("");
        tfEmail.setText("");
        
    }
}

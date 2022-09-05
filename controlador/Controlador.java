package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;
import modelo.Menu;

public class Controlador implements ActionListener
{
    
        //------------
        // Atributos
        //------------
    
        private VentanaPrincipal vista;
        private Menu modelo;
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public Controlador(VentanaPrincipal pVista, Menu pModelo)
        {
            this.vista = pVista;
            this.modelo= pModelo;
            this.vista.miPanelOperaciones.btDatos.addActionListener(this);
            this.vista.miPanelOperaciones.btQuestionario.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);   
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            //Identificar el comendo generado (calcular, borrar, salir)
            String comando = ae.getActionCommand();
            
            if(comando.equals("Datos"))
            {
                modelo.setNombre(vista.miPanelEntradaDatos.getTfNombre());
                modelo.setEdad((vista.miPanelEntradaDatos.getTfEdad()));
                modelo.setProfesion((vista.miPanelEntradaDatos.getTfProf()));
                modelo.setEmail((vista.miPanelEntradaDatos.getTfEmail()));
                modelo.setSer((vista.miPanelEntradaDatos.getTfSer()));
                vista.miPanelResultados.mostrarResultado(modelo.getNombre(),modelo.getEdad(),modelo.getProfesion(),modelo.getEmail(),modelo.getSer());
                
                
            }
          
        

            if(comando.equals("Questionario"))
        {   
            vista.miPanelResultados.mostrarResPreguntas(modelo.Preguntas());
        }

            if(comando.equals("Salir"))
            {
                System.exit(0);
            }
        }
    }
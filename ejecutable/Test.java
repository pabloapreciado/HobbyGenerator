package ejecutable;

import controlador.Controlador;
import modelo.Menu;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Menu miMenu = new Menu();
        Controlador miControlador = new Controlador(miVentana, miMenu); 
    }
    
}

package modelo;

import javax.swing.JOptionPane;


/**
 *
 * @author JUAN,jpico,cala jose
 */
public class Menu 
{
    private String nombre;
    private String edad;
    private String profesion;
    private String email;
    private String ser;
    private String r;
    public String[] pregunta = new String[7];      
    int a=0;
    int b=0;
    int c=0;
    String res = ""; 
   
   
    public Menu()
    {
        pregunta[0] = " 1. Te consideras una persona: \n A. Activa y llena de vitalidad \n B. Observadora y tranquila \n C. Extrovertida y amiguera";
        pregunta[1] = " 2. ¿Qué prefieres hacer en una tarde libre?: \n A. Ir a caminar/correr al parque más cercano \n B. Descansar en la casa \n C. Salir a comer con amigos.  ";
        pregunta[2] = " 3. Siempre has sido bueno para: \n A. Los deportes y aquello que implique un movimiento \n B. Tener consciencia sobre mis acciones y pensamientos \n C. Organizar y liderar a grupos ";
        pregunta[3] = " 4. En algún momento de tu vida llegaste a: \n A. Ir a paseos en bicicleta \n B. Leer más de (o casi) 10 libros al año \n C. Ser el representante de un grupo";
        pregunta[4] = " 5. Tu vida se define por: \n A. Tener un cuerpo saludable y llevar una alimentación sana \n B. Mi trabajo, mi familia y el tiempo para mí \n C. Mis amigos y el networking que hago diariamente";
        pregunta[5] = " 6. ¿Cómo te ves en 5 años?: \n A. Disfrutando de mi juventud y fortaleza \n B. En un entorno feliz lleno de paz mental y espiritual \n C. Recibiendo algún reconocimiento o mérito ante la sociedad";
        pregunta[6] = " 7. Qué sería lo que hasta el momento te falta por hacer: \n A. Ganar alguna competencia deportiva \n B.Explotar mi lado artístico y sensible \n C. Realizar un acto de ayuda al otro";
        
    }
    
    public String Preguntas()
    {
        for(int i = 0;i<pregunta.length;i++)
        {
            r= "";
            r = JOptionPane.showInputDialog(pregunta[i]);
            
            if(!r.equals("A") && !r.equals("B") && !r.equals("C"))
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                r = JOptionPane.showInputDialog(pregunta[i]);
            }

            if(r.equals("A"))
            {
                a += 1; 
            }
            if(r.equals("B"))
            {
                b += 1; 
            }
            if(r.equals("C"))
            {
                c += 1; 
            }
        }
        if(a>b)
        {
            if(a>c)
            {
                res = "PERSONALIDAD EXTROVERTIDA: \nSabes que para estar en armonía contigo y tu bienestar \nintegral necesitas estar activo siempre, cuestión por la cual \nseguramente te gustan los retos que implican un esfuerzo \nfísico extra.Sí, requerirás de mucha \ndisciplina, y es claro que\n la tienes, pero la satisfacción de terminar \nuna carrera tan larga y cumplir\n un objetivo con base a una ardua preparación previa\n se compensará al cruzar la línea de meta." + "\n\n LISTA DE HOBBYS :" + "\nDEPORTE CONSTANTE Y AL AIRE LIBRE. \nATLETISMO. \nNATACION. \nFUTBOL. \nACTIVIDADES DE AVENTURA. \nCAMPISMO. \nRAPEL. \nCANOTAJE \nBAILAR. \nBALONCESTO \nCALISTENIA \nKARATE";
                
                return res;
            }
            else
            {
                res = "PERSONALIDAD DE LIDERAZGO:\nLos lazos que creas con las personas que te rodean \nson de vital importancia para ti. Recuerda que pequeñas acciones \ngeneran cambios extraordinarios.Ten en mente que sea cual\n sea el hobby que estés por comenzar, lo fundamental \nes la pasión con la que lo realices para que se sume \na tu estilo de vida. Siéntete seguro de que el \ninterés que dediques a tu nuevo pasatiempo \nse verá reflejado inmediatamente en cómo estás \ncontigo mismo, es decir, tu propia felicidad." + "\n\nLISTA DE HOBBYS :" + "PERTENENCER A GRUPOS \nSOCIALES DE TIPO \nARTISTICO,DEPORTIVO,FESTIVO,ETC]).\nCREADOR DE CONTENIDO \nVOLUNTARIADO AMBIENTAL.\nVOLUNTARIADO ANIMAL.\nVOLUNTARIADO SOCIAL\nFUTBOL AMERICANO. \nBILLAR. \nPESCA RECREATIVA"; 
                return res;
            }
        }
        else
        {
            if(b>c)
            {
                res = "PERSONALIDAD ESPIRITUAL:\nTe inclinas más por una vida relajada \ny sin estrés porque eres muy consciente del poder de tus \nemociones y sentimientos. Si eres fanático de la lectura, \n¿qué tal te parecería empezar un blog\n de crítica de libros? Es muy sencillo \ny te llevará a agudizar aún más tu\n lado analítico y sentido de organización.\n Puedes empezar con artículos escritos compartidos en la\n web, conforme vayas ganando confianza puedes abrir \ntus cuentas en redes sociales para trabajar \ntus críticas en otros formatos, como videos o \nfotografías, con los cuales explorarás \notras habilidades creativas escondidas en tu mente."+ "\n\nLISTA DE HOBBYS :" + "\nCAMPISMO.\nMEDITACION. \nPASEAR. \nVIAJAR. \nVIAJES DE AVENTURA. \nCICLISMO. \nCICLOMONTAÑISMO. \nCATA DE VINO. \nCOLECCIONISMO (SELLOS,MONEDAS,ANTIGÜEDADES,ETC). \nFOTOGRAFIA. \nPROGRAMACION INFORMATICA. \nVISITAR MONUMENTOS Y YACIMIENTOS ARQUEOLÓGICOS. ";                                          ;
                return res;
            }
            else
            {
                res =  "PERSONALIDAD DE LIDERAZGO:\nLos lazos que creas con las personas que te rodean son \nde vital importancia para ti. Recuerda que pequeñas acciones \ngeneran cambios extraordinarios.Ten en mente que sea cual\n sea el hobby que estés por comenzar, lo fundamental \nes la pasión con la que lo realices para que se sume \na tu estilo de vida. Siéntete seguro de que el \ninterés que dediques a tu nuevo pasatiempo \nse verá reflejado inmediatamente en cómo estás \ncontigo mismo, es decir, tu propia felicidad." + "\n\nLISTA DE HOBBYS:" + "\nPERTENECER A GRUPOS SOCIALES DE TIPO \nARTISTICO,DEPORTIVO,FESTIVO,ETC]).\nCREADOR DE CONTENIDO.\nVOLUNTARIADO AMBIENTAL.\nVOLUNTARIADO ANIMAL.\nVOLUNTARIADO SOCIAL. \nFUTBOL AMERICANO. \nBILLAR. \nPESCA RECREATIVA";
                return res;
            }
        }
        

    }

    //Métodos
    public Menu(String nombre, String edad, String prof, String email,String ser)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.profesion = prof;
        this.email= email;
        this.ser = ser;
    }
    public Menu(Menu me)
    {
        this.nombre = me.getNombre();
        this.profesion = me.getProfesion();
        this.edad = me.getEdad();
        this.ser = me.getSer();
    }

 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
     public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }


}

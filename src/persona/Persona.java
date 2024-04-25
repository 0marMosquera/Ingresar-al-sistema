/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;
// Libreria de interfaz grafica de usuarioclase JoptionPane
import javax.swing.JOptionPane;
/**
 *
 * @author Omar Reinaldo
 */
public class Persona {

    /**
     * Atributos
     */
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;
    
    /**
     * Constructor
     * @param args 
     */
    
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        usuario = "mundocol";
        clave = "012345";
      }

    
    

    public String getNombre() {
        return nombre;
        // TODO code application logic here
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    /**
     * Metodos
     * @param args 
     */
    public String getClave() {
        return clave;
    }
    //Metodo para validar datos del usuario y contraseña
    public void ingresarSistema(String usu, String cont) {
        // 2 condiciones en una sola(Responder dos preguntas)
        if(usuario.equals(usu) && clave.equals(cont))
            //Crear el mensaje para datos correctos
             JOptionPane.showMessageDialog(null, "bienvenido al sistema");
        else    
             JOptionPane.showMessageDialog(null,"Datos invalidos");
                   
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String nom=JOptionPane.showInputDialog("Escriba su nombre");
        String ape=JOptionPane.showInputDialog("Escriba su apellido");
        String usu=JOptionPane.showInputDialog("Escriba el usuario");
        String cont=JOptionPane.showInputDialog("escriba la contrasena");
        Persona usuario =new Persona(nom, ape);
        usuario.ingresarSistema(usu, cont);
           
    }
    
}

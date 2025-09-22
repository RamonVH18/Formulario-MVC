package Controlador;

import Entidades.Usuario;
import Modelo.UsuarioModelo;

/**
 *
 * @author 52644
 */
public class Controlador {
    private UsuarioModelo modelo;
    private static Controlador controlador;
    
    public Controlador() {
        modelo = UsuarioModelo.getModelo();
    }
    
    public static Controlador getControlador(){
        if (controlador == null)
                controlador = new Controlador();
        return controlador;
    }
    
    public void registrarUsuario(String nombre, String apellido, String email){
     Usuario user = new Usuario(nombre, apellido, email);
     modelo.registrarUsuario(user);
    }

    public UsuarioModelo getModelo() {
        return modelo;
    }
}

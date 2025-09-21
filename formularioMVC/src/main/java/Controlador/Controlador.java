/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Entidades.Usuario;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author 52644
 */
public class Controlador {
    
    private List<Usuario> usuarios;
    private static Controlador controlador;
    
    private Controlador() {
        usuarios = new LinkedList<>();
    }
    
    public static Controlador getControlador(){
        if (controlador == null)
                controlador = new Controlador();
        return controlador;
    }
    
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    
    
}

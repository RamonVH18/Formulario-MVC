/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Entidades.Usuario;
import Modelo.Modelo;
import java.util.LinkedList;

/**
 *
 * @author 52644
 */
public class Controlador {
    private Modelo modelo;
    private static Controlador controlador;
    
    public Controlador() {
        modelo = Modelo.getModelo();
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
    
    
    
}

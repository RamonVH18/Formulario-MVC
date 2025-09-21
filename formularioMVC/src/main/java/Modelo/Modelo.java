/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Controlador;
import Entidades.Usuario;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 52644
 */
public class Modelo {
     private List<Usuario> usuarios;
     private static Modelo modelo;
     
      private Modelo() {
        usuarios = new LinkedList<>();
    }
    
    public static Modelo getModelo(){
        if (modelo == null)
                modelo = new Modelo();
        return modelo;
    }
    
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}

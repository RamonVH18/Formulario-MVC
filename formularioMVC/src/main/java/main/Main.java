package main;

import Entidades.Usuario;
import vistaFormulario.Vista;

/**
 *
 * @author janot
 */
public class Main {
    public static void main(String[] args) {
        Vista v = new Vista();
        v.setVisible(true);
        Usuario usuario = new Usuario("prueba1", "prueba1", "prueba@gmail.com");
        v.controlador.getModelo().registrarUsuario(usuario);
    }
}

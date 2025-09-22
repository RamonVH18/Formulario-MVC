package Modelo;

import Entidades.Usuario;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import observer.ISubscriber;

/**
 *
 * @author 52644
 */
public class UsuarioModelo {
    private List<Usuario> usuarios;
    private static UsuarioModelo modelo;
    
    //Atributo de observer
    private List<ISubscriber> subscribers = new ArrayList<>();
     
    private UsuarioModelo() {
        usuarios = new LinkedList<>();
    }
    
    public static UsuarioModelo getModelo(){
        if (modelo == null)
                modelo = new UsuarioModelo();
        return modelo;
    }
    
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
        notificarSeAgregoUsuario(usuario);
    }
        
    //Metodos observer
    public void subscribirse(ISubscriber subscriber){
        subscribers.add(subscriber);
    }
    
    private void notificarSeAgregoUsuario(Usuario usuario){
        for (ISubscriber subscriber : subscribers) {
            subscriber.update(usuario);
        }
    }
}

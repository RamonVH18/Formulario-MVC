package observer;

import Entidades.Usuario;

/**
 *
 * @author janot
 */
public interface ISubscriber {
    public void update(Usuario usuario);
}

package com.francodavyd.persistence;
import com.francodavyd.logica.Usuario;
import com.francodavyd.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPersistence {
    UsuarioJpaController usuario = new UsuarioJpaController();
    
    public void crearUsuario(Usuario usu){
        usuario.create(usu);
    }
    public void eliminarUsuario(int id){
        try {
            usuario.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void editarUsuario(Usuario usu){
        try {
            usuario.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Usuario> obtenerUsuarios(){
        return usuario.findUsuarioEntities();
    }
    public Usuario obtenerUsuario(int id){
        return usuario.findUsuario(id);
    }
    
    
    
    
}

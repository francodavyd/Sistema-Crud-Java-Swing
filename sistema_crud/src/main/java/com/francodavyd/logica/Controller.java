package com.francodavyd.logica;

import com.francodavyd.persistence.ControllerPersistence;
import java.util.List;

public class Controller {
    ControllerPersistence persistence = new ControllerPersistence();
    
    public void crearUsuario(Usuario usuario){
        persistence.crearUsuario(usuario);
    }
    public void eliminarUsuario(int id){
        persistence.eliminarUsuario(id);
    }
    public void editarUsuario(Usuario usuario){
        persistence.editarUsuario(usuario);
    }
    public List<Usuario> obtenerUsuarios(){
        return persistence.obtenerUsuarios();
    }
    public Usuario obtenerUsuario(int id){
        return persistence.obtenerUsuario(id);
    }
    
}

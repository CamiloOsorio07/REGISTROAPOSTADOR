
package UsuarioBlog;

import java.util.ArrayList;
import java.util.List;
import UsuarioBase.Usuario;


public class UsuarioRG {
    private List<Usuario> usuarios;
    
    public UsuarioRG(){
        usuarios = new ArrayList<>();
    
    }
    public int buscar(String usuario){ 
        int n=-1;
        for(int i= 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getNombre().equals(usuario)){
                n=i;
                break;
            }
        }
        return n;
    }
    public boolean insertar(Usuario usuario){
        if (buscar(usuario.getNombre())==-1){
            usuarios.add(usuario);
            return true;
        }else {
            return false;
        }
    }
    public boolean modificar(Usuario usuario){
        if (buscar(usuario.getNombre())!=-1){
            Usuario usuarioaux=obtener(usuario.getNombre());
            usuarioaux.setContrasenia(usuario.getContrasenia());
            usuarioaux.setCorreoElectronico(usuario.getCorreoElectronico());
            usuarioaux.setFechaNacimiento(usuario.getFechaNacimiento());
            usuarioaux.setNumeroIdentificacion(usuario.getNumeroIdentificacion());
            usuarioaux.setGenero(usuario.getGenero());
            return true;
        }else {
            return false;
        }
    }
    public boolean eliminar(String usuario){
        if (buscar(usuario)!=-1){
            usuarios.remove(buscar(usuario));
            return true;
        }else {
            return false;
        }
    }
    public Usuario obtener(String usuario){
        if (buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
        }else{
        return null;
        }
    }
    
}

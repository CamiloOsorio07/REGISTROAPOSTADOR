
package UsuarioLogico;

import UsuarioBase.Usuario;
import UsuarioBlog.UsuarioRG;

public class UsuarioLog {
    
    private static UsuarioRG usuariorg = new UsuarioRG();
    
    public static boolean autentificar(String usuario, String Contrasenia){
        if (obtener(usuario)!=null){
            Usuario UsuarioConsulta= obtener(usuario);
            if (UsuarioConsulta.getNombre().equals(usuario) && UsuarioConsulta.getContrasenia().equals(Contrasenia)){
                return true;
            }
            else{
                return false;
            }
        }else {
                    return false;
            }   
    }
    public static boolean insertar(Usuario usuario){
        return usuariorg.insertar(usuario);
       
    }
    public static boolean modificar(Usuario usuario){
        return usuariorg.modificar(usuario);
   
    }
    public static boolean eliminar(String usuario){
        return usuariorg.eliminar(usuario);
        
    }
    public static Usuario obtener(String usuario){
        return usuariorg.obtener(usuario);
        
    }
    
}

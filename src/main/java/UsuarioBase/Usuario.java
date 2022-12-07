
package UsuarioBase;


import java.util.Date;
import javax.swing.JTextField;

public class Usuario {

	private String NumeroIdentificacion;
	private String Nombre;
	private Date FechaNacimiento;
	private String CorreoElectronico;
	private String Genero;
	private String Contrasenia;

    public Usuario(String NumeroIdentificacion, String Nombre, Date FechaNacimiento, String CorreoElectronico, String Genero, String Contrasenia) {
        this.NumeroIdentificacion = NumeroIdentificacion;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.CorreoElectronico = CorreoElectronico;
        this.Genero = Genero;
        this.Contrasenia = Contrasenia;
    }

    public String getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(String NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    
    }

    
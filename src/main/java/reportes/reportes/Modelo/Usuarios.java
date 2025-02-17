package reportes.reportes.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", nullable = false)
    private Integer idusuario;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "identificacion", nullable = false)
    private String identificacion;

    @Column(name = "telefono", nullable = false, unique = true)
    private String telefono;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "contrasenia", nullable = false)
    private String contrasenia;

    @Column(name = "idrol", nullable = false)
    private Integer idrol;

    @Column(name = "idestado", nullable = false)
    private Integer idestado;

    // Getters y Setters
    //IdUsuario
    public Integer getIdUsuario() {
        return idusuario;
    }

    public void setIdUsuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Identificacion
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    //Telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Correo
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Contrasena
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //IdRol
    public Integer getIdRol() {
        return idrol;
    }

    public void setIdRol(Integer idrol) {
        this.idrol = idrol;
    }

    //IdEstado
    public Integer getIdEstado() {
        return idestado;
    }

    public void setIdEstado(Integer idestado) {
        this.idestado = idestado;
    }
}

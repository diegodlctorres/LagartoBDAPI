package Model;

public abstract class Usuario extends Entidad{

    private String apellido;
    private String correo;
    private Integer dni;
    private String sexo;
    private Integer telefono;

    public Usuario(Integer id, String nombre, String apellido, String correo, Integer dni, String sexo, Integer telefono) {
        super(id, nombre);
        this.apellido = apellido;
        this.correo = correo;
        this.dni = dni;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}

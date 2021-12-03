package Model;

public class Cliente extends Usuario {

    private Integer tarjeta;

    public Cliente(Integer id, String nombre, String apellido, String correo, Integer dni, String sexo, Integer telefono, Integer tarjeta) {
        super(id, nombre, apellido, correo, dni, sexo, telefono);
        this.tarjeta = tarjeta;
    }

    public Integer getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Integer tarjeta) {
        this.tarjeta = tarjeta;
    }
}

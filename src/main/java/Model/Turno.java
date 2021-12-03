package Model;

public class Turno extends Entidad {

    private String horaInicio;
    private String horaFin;

    public Turno(Integer id, String nombre, String horaInicio, String horaFin) {
        super(id, nombre);
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}

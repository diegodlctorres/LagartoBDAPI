package Model;

public class Colaborador extends Usuario{

    private Turno turno;
    private Cargo cargo;

    public Colaborador(Integer id, String nombre, String apellido, String correo, Integer dni, String sexo, Integer telefono, Turno turno, Cargo cargo) {
        super(id, nombre, apellido, correo, dni, sexo, telefono);
        this.turno = turno;
        this.cargo = cargo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}

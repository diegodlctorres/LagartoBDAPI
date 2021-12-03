package Model;

public class Cargo extends Entidad{

    private Double salario;

    public Cargo(Integer id, String nombre, Double salario) {
        super(id, nombre);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

package Model;

import java.util.Date;

public class Compra{

    private final Integer id;
    private Cliente cliente;
    private Colaborador colaborador;
    private Date fecha;

    public Compra(Integer id, Cliente cliente, Colaborador colaborador) {
        this.id = id;
        this.cliente = cliente;
        this.colaborador = colaborador;
    }

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

package Model;

public class Producto extends Entidad{

    private Double precio;
    private Categoria categoria;

    public Producto(Integer id, String nombre, Double precio, Categoria categoria) {
        super(id, nombre);
        this.precio = precio;
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

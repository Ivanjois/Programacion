package U7.Entregables;

public class Producto implements Comparable<Producto>{

    private String id, nombre;
    private int stock;
    private double precio;

    public Producto(String id, String nombre, int stock, double precio) {
        this.setId(id);
        this.setNombre(nombre);
        this.setStock(stock);
        this.setPrecio(precio);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public int compareTo(Producto otroProducto) {
        return Integer.compare(this.stock, otroProducto.stock);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", stock=" + stock;
    }
}

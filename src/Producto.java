public class Producto {
    Utils utils = new Utils();
    // Inicialización de las variables
    private static int idCounter = 0; // Contador para los IDs
    private final int id;
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.id = ++idCounter;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Métodos para obtener valores
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public String getCategoria() {
        return categoria;
    }

    // Métodos para asignar valores
    public void setNombre(String nombre) {
        if(utils.validarDato(nombre, "Nombre")){
            this.nombre = nombre;
        }
    }
    public void setPrecio(double precio) {
        if(utils.validarDato(precio, "Precio")) {
            this.precio = precio;
        }
    }
    public void setCategoria(String categoria) {
        if(utils.validarDato(categoria, "Categoria")) {
            this.categoria = categoria;
        }
    }
}

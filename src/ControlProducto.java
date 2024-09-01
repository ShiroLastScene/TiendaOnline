import java.util.ArrayList;
import java.util.List;

public class ControlProducto {

    private final List<Producto> productos;

    public ControlProducto() {
        productos = new ArrayList<>();
    }

    // Nuevo Producto
    public void agregarProducto(String nombre, double precio, String categoria) {
        Producto nuevoProducto = new Producto(nombre,precio,categoria);
        productos.add(nuevoProducto);
    }

    // Nuevo Producto digital
    public void agregarProducto(String nombre, double precio, String categoria,String tamanoArchivo, String formato) {
        Producto nuevoProducto = new ProductoDigital(nombre,precio, categoria, tamanoArchivo, formato);
        productos.add(nuevoProducto);
    }

    // Buscar producto por nombre
    public void buscarProductoPorNombre(String nombre) {
        try
        {
            boolean encontrado;
            encontrado=false;

            System.out.println("Buscando producto " + nombre + "...");

            for (Producto producto : productos) {
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    encontrado=true;
                    System.out.println("Producto encontrado: ");
                    System.out.println("id: " + producto.getId());
                    System.out.println("nombre: " + nombre);
                    System.out.println("precio: " + producto.getPrecio());
                    System.out.println("categoria: " + producto.getCategoria());
                }
            }
            if (!encontrado) {
                System.out.println("No existe el producto encontrado.");
            }
        } catch (Exception e) {
            //Lanza la excepción
            ControlErrores.InformarError(e);
        }
    }
    public double calcularConDescuento(double precio){
        double porcentaje;
        porcentaje = 0.10; //10% de descuento

        return precio * porcentaje;
    }
    public double calcularConDescuento(double precio, double porcentaje){

        return precio * (porcentaje/100);
    }
}
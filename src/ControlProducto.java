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

    // Método para cambiar el precio de un producto
    public void cambiarPrecio(int id, double valor) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setPrecio(valor);
                System.out.println("Precio del producto actualizado.");
                return;
            }
        }
        System.out.println("Producto no encontrado, no es posible cambiar el precio.");
    }

    // Método para cambiar la categoria de un producto
    public void cambiarCategoria(int id, String categoria) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setCategoria(categoria);
                System.out.println("Categoria del producto actualizada.");
                return;
            }
        }
        System.out.println("Producto no encontrado, no es posible cambiar la categoria.");
    }

    // Método para cambiar el formato de un ProductoDigital
    public void cambiarFormato(int id, String formato) {
        try
        {
            for (Producto producto : productos) {
                if (producto.getId() == id) {
                    if (producto instanceof ProductoDigital) {
                        ProductoDigital productoDigital = (ProductoDigital) producto;
                        productoDigital.setFormato(formato);
                        System.out.println("Formato del producto digital actualizado.");
                        return;
                    } else {
                        System.out.println("El producto no es un producto digital.");
                        return;
                    }
                }
            }
            System.out.println("Producto no encontrado, no es posible cambiar el formato.");
        } catch (Exception e) {
            //Lanza la excepción
            ControlErrores.InformarError(e);
        }
    }

    // Método para cambiar el tamaño de un ProductoDigital
    public void cambiarTamano(int id, String tamano) {
        try
        {
            for (Producto producto : productos) {
                if (producto.getId() == id) {
                    if (producto instanceof ProductoDigital) {
                        ProductoDigital productoDigital = (ProductoDigital) producto;
                        productoDigital.setTamanoArchivo(tamano);
                        System.out.println("Tamaño del producto digital actualizado.");
                        return;
                    } else {
                        System.out.println("El producto no es un producto digital.");
                        return;
                    }
                }
            }
            System.out.println("Producto no encontrado, no es posible cambiar el tamaño.");
        } catch (Exception e) {
            //Lanza la excepción
            ControlErrores.InformarError(e);
        }
    }

    // Buscar producto por nombre
    public void buscarProductoPorNombre(String nombre) {
        try
        {
            boolean encontrado;
            encontrado=false;

            System.out.println("Buscando el producto " + nombre + "...");

            for (Producto producto : productos) {
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    encontrado=true;
                    System.out.println("=============================================");
                    System.out.println("Producto encontrado: ");
                    System.out.println("id: " + producto.getId());
                    System.out.println("nombre: " + nombre);
                    System.out.println("precio: " + producto.getPrecio());
                    System.out.println("categoria: " + producto.getCategoria());

                    // Verifica si el producto es un producto digital
                    if (producto instanceof ProductoDigital productoDigital) {
                        System.out.println("tamaño: " + productoDigital.getTamanoArchivo());
                        System.out.println("formato: " + productoDigital.getFormato());
                    }
                    System.out.println("=============================================");
                }
            }
            if (!encontrado) {
                System.out.println("No existe el producto.");
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

        return precio * ((100-porcentaje)/100);
    }
}
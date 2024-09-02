public class Main {
    public static void main(String[] args) {

        ControlProducto controlProducto = new ControlProducto();
        System.out.println("Usuario agrega el producto");

        controlProducto.agregarProducto("PlayStation 5",499999, "Consolas");
        controlProducto.agregarProducto("PlayStation 6",799999, "Consolas");
        controlProducto.agregarProducto("BaldursGate 4",49999, "Juego virtual","140GB","ISI");
        controlProducto.buscarProductoPorNombre("PlayStation 6");
        controlProducto.cambiarFormato(1,"ISO");
        controlProducto.cambiarFormato(2,"ISO");
        controlProducto.buscarProductoPorID(3);
        System.out.println("Cambiamos precio aplicando un 7% de descuento");
        controlProducto.cambiarPrecio(1,controlProducto.calcularConDescuento(799999,7));
        controlProducto.buscarProductoPorNombre("PlayStation");
        controlProducto.listarProductos();

    }
}
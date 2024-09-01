public class Main {
    public static void main(String[] args) {

        ControlProducto controlProducto = new ControlProducto();
        System.out.println("Usuario agrega el producto");

        controlProducto.agregarProducto("PlayStation 6",799999, "Consolas");
        controlProducto.agregarProducto("BaldursGate 4",49999, "Juego virtual","140GB","ISO");
        controlProducto.buscarProductoPorNombre("PlayStation 6");


    }
}
public class ProductoDigital extends Producto {

    private String tamanoArchivo;
    private String formato;

    public ProductoDigital(String nombre, double precio, String categoria, String tamanoArchivo, String formato) {
        super(nombre, precio, categoria);  // Llamada al constructor de la clase base
        this.tamanoArchivo = tamanoArchivo;
        this.formato = formato;
    }

    public String getTamanoArchivo() {
        return tamanoArchivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setTamanoArchivo(String tamanoArchivo) {
        if(utils.validarDato(tamanoArchivo, "Tamaño")) {
            this.tamanoArchivo = tamanoArchivo;
        }
    }

    public void setFormato(String formato) {
        if(utils.validarDato(formato, "Formato")) {
            this.formato = formato;
        }
    }
}

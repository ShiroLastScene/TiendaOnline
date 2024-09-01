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

    public void setTamanoArchivo(String tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
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

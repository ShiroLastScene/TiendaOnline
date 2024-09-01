public class Utils {

    // Valida que el dato no sea nulo o vacio
    public boolean validarDato(String valor, String nombreDato){
        if (valor == null || valor.trim().isEmpty()){
            System.out.println("Debe ingresar un " + nombreDato);
            return false;
        }
        return true;
    }

    // Valida que el dato no sea nulo o cero
    public boolean validarDato(double valor, String nombreDato){
        if (valor == 0){
            System.out.println("Debe ingresar un " + nombreDato);
            return false;
        }
        return true;
    }
}

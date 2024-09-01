public class ControlErrores {

    // Método para registrar errores con una excepción
    public static void InformarError(Exception e) {
        System.out.println();
        System.out.println("¡ Error no controlado, favor informe a su administrador de sistemas !");
        System.out.println("  Excepción: " + e.getMessage());
        for (StackTraceElement element : e.getStackTrace()) {
            System.out.println("\t" + element);
        }
        System.out.println();
    }
}
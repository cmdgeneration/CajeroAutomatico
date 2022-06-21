import java.util.Scanner;

public class interfaz {
    public static void main(String[] args) {
        System.out.println("Elija una de las cuatro opciones: ");
        System.out.println("  Escriba 1 para consultar su saldo");
        System.out.println("  Escriba 2 para ingresar dinero");
        System.out.println("  Escriba 3 para sacar dinero");
        System.out.println("  Escriba 4 para consultar sus últimos movimientos");

        Scanner scanner = new Scanner(System.in);

        int opcionSeleccionada = scanner.nextInt();
        System.out.println("Usted ha elegido la opcion: " + opcionSeleccionada);
    }
}

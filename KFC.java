import java.util.Scanner;
public class KFC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido a KFC");
            System.out.println("Por favor, elige una opción del menú:");
            mostrarMenu();

            System.out.print("Introduce el número del producto que quieres pedir: ");
            int opcion = scanner.nextInt();
            String itemSeleccionado = obtenerItemMenu(opcion);

            if (itemSeleccionado == null) {
                System.out.println("Opción no válida. Intenta de nuevo.");
            } else {
                System.out.println("Has seleccionado: " + itemSeleccionado);

                System.out.print("¿Quieres confirmar la compra? (si/no): ");
                String confirmacion = scanner.next();

                if (confirmacion.equalsIgnoreCase("si")) {
                    System.out.print("Introduce el monto a pagar: ");
                    double montoPagado = scanner.nextDouble();

                    double precio = obtenerPrecioItem(opcion);
                    if (montoPagado >= precio) {
                        procesarPago(itemSeleccionado, montoPagado, precio);
                    } else {
                        System.out.println("Pago insuficiente. La compra ha sido cancelada.");
                    }
                } else {
                    System.out.println("Pedido cancelado.");
                }
            }

            System.out.print("¿Deseas hacer otra compra? (si/no): ");
            String continuarCompra = scanner.next();
            if (continuarCompra.equalsIgnoreCase("no")) {
                continuar = false;
                System.out.println("Gracias por visitar KFC. ¡Vuelve pronto!");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("1.BBQ FAMILIAR ---- s/ 3.90");
        System.out.println("2.ENSALADA FAMILIAR ---- s/ 11.00");
        System.out.println("3.PAQUETE 6 HOT WINGS ---- s/ 16.90");
        System.out.println("4.PAPA SUPER FAMILIAR ---- s/ 15.90");
        System.out.println("5.PAPA PERSONAL ---- s/ 5.90");
        System.out.println("6.PURE REGULAR ---- s/ 5.90");
        System.out.println("7.PAPA FAMILIAR ----- s/ 11.90");
        System.out.println("8.ENSALADA REGULAR ---- s/ 5.90");
        System.out.println("9.PURE REGULAR ---- s/ 11.00");
        System.out.println("10.PAQUETE 6 NUGGETS ---- s/ 15.90");
        System.out.println("11.POPCORN CHICKEN ---- s/ 15.90");
        System.out.println("12.OCOPA FAMILIAR ---- s/ 3.90");
        System.out.println("13.ROCOTO FAMILIAR ---- s/ 3.90");
    }

    public static String obtenerItemMenu(int opcion) {
        switch (opcion) {
            case 1: return "BBQ FAMILIAR";
            case 2: return "ENSALADA FAMILIAR";
            case 3: return "PAQUETE 6 HOT WINGS";
            case 4: return "PAPA SUPER FAMILIAR";
            case 5: return "PAPA PERSONAL";
            case 6: return "PURE REGULAR";
            case 7: return "PAPA FAMILIAR";
            case 8: return "ENSALADA REGULAR";
            case 9: return "PURE REGULAR";
            case 10: return "PAQUETE 6 NUGGETS";
            case 11: return "POPCORN CHICKEN";
            case 12: return "OCOPA FAMILIAR";
            case 13: return "ROCOTO FAMILIAR";
            default: return null;
        }
    }

    public static double obtenerPrecioItem(int opcion) {
        switch (opcion) {
            case 1: return 3.90;
            case 2: return 11.00;
            case 3: return 16.90;
            case 4: return 15.90;
            case 5: return 5.90;
            case 6: return 5.90;
            case 7: return 11.90;
            case 8: return 5.90;
            case 9: return 11.00;
            case 10: return 15.90;
            case 11: return 15.90;
            case 12: return 3.90;
            case 13: return 3.90;
            default: return 0.0;
        }
    }

    public static void procesarPago(String itemSeleccionado, double montoPagado, double precio) {
        System.out.println("Procesando el pago...");
        double cambio = montoPagado - precio;

        System.out.println("---- Detalle del Pago ----");
        System.out.println("Producto: " + itemSeleccionado);
        System.out.println("Precio: s/ " + precio);
        System.out.println("Monto pagado: s/ " + montoPagado);
        System.out.println("Cambio: s/ " + cambio);
        System.out.println("--------------------------");
        System.out.println("Gracias por tu compra.");
    }
}
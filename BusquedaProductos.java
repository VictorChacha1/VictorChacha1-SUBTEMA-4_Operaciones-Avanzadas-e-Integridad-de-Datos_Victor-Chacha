import java.util.Scanner;

public class BusquedaProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String[] nombres = {"Teclado", "Mouse", "Monitor", "Auriculares", "Microfono"};
        double[] precios = {15.50, 8.75, 120.00, 25.00, 45.20};
        boolean encontrado = false;

        System.out.print("Ingrese el nombre del producto a buscar: ");
        String productoBuscar = scanner.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(productoBuscar)) {
                System.out.println("\nProducto encontrado: " + nombres[i]);
                System.out.println("Precio correspondiente: $" + precios[i]);
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("\nEl producto no existe en el inventario.");
        }

        scanner.close();
    }
}

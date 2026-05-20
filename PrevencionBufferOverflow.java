public class PrevencionBufferOverflow {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60};

        System.out.println("=== MOSTRANDO ELEMENTOS DEL ARREGLO ===");

        for (int i = 0; i < 6; i++) {
            System.out.println("Posicion [" + i + "] -> Valor: " + numeros[i]);
        }

    }
}

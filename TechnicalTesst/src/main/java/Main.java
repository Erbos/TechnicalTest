/**
 * Created by HP on 15/8/2017.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un número y cuando acabe presione la tecla enter");
        int numero = scanner.nextInt();

        sigienteMasGrande(numero);

    }

    static void cambiar(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void sigienteMasGrande(int number) {
        char[] digitos = String.valueOf(number).toCharArray();
        int n = digitos.length;
        int i;

        for (i = n - 1; i > 0; i--) {
            if (digitos[i] > digitos[i - 1]) {
                break;
            }
        }


        if (i == 0) {
            System.out.println("-1");
        } else {
            int x = digitos[i - 1];
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (digitos[j] > x && digitos[j] < digitos[min]) {
                    min = j;
                }
            }

            cambiar(digitos, i - 1, min);

            Arrays.sort(digitos, i, n);
            System.out.print("El próximo numero más grande es ");
            for (i = 0; i < n; i++)
                System.out.print(digitos[i]);
        }
    }
}

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.println("Los primeros " + n + " números de la serie de Fibonacci son:");
        for (int i = 1; i <= nn; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;

        }
        scanner.close();
    }
}


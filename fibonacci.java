import java.util.Scanner;

class Fibonacci {
    public int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public void serie(int nn) {
        System.out.println("Serie de Fibonacci (primeros " + nn + " términos):");
        for (int i = 0; i < nn; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public void normal(int nn)
    {
        int a = 0, b = 1;
        System.out.println("Los primeros " + nn + " números de la serie de Fibonacci son:");
        for (int i = 1; i <= nn; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();
        Fibonacci fibo=new Fibonacci();
        fibo.serie(n);
        fibo.normal(n);
        scanner.close();
    }
}


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe naturalna n: ");

        int n = scanner.nextInt();


        double[] a = new double[n];

        System.out.println("Podaj liczby rzeczywiste a[]: ");

        for (int i = 0; i < n; i++) {

            a[i] = scanner.nextDouble();

        }


        System.out.println("Wynik obliczenia wyrazenia ( a ) : " + calculate_expression_a(n, a));
        System.out.println("Wynik obliczenia wyrazenia ( b ) : " + calculate_expression_b(n, a));
        System.out.println("Wynik obliczenia wyrazenia ( c ) : " + calculate_expression_c(n, a));
        System.out.println("Wynik obliczenia wyrazenia ( d ) : " + calculate_expression_d(n, a));
        System.out.println("Wynik obliczenia wyrazenia ( e ) : " + calculate_expression_e(n, a));
        System.out.println("Wynik obliczenia wyrazenia ( f ) : " + calculate_expression_f(n, a));
        System.out.println("Wynik obliczenia wyrazenia ( g ) : " + calculate_expression_g(n, a));
        System.out.println("Wynik obliczenia wyrazenia ( h ) : " + calculate_expression_h(n, a));
        System.out.println("Wynik obliczenia wyrazenia ( i ) : " + calculate_expression_i(n, a));


    }


    private static double calculate_expression_a(int n, double[] a) {

        double sum = 0;

        for (int i = 0; i < n; i++) {

            sum += a[i];

        }

        return sum;

    }


    private static double calculate_expression_b(int n, double[] a) {

        double sum = 0;

        for (int i = 0; i < n; i++) {

            sum += Math.pow(a[i], 2);

        }

        return sum;

    }


    private static double calculate_expression_c(int n, double[] a) {

        double sum = 0;

        for (int i = 0; i < n; i++) {

            sum += Math.abs(a[i]);

        }

        return sum;

    }


    private static double calculate_expression_d(int n, double[] a) {

        double product = 1;

        for (int i = 0; i < n; i++) {

            product *= a[i];

        }

        return product;

    }
    
    private static double calculate_expression_e(int n, double[] a) {

        double sum = 0;
    
        for (int i = 0; i < n; i++) {
    
            sum += Math.abs(a[i]);
    
        }
    
        return sum;
    }
    
    private static double calculate_expression_f(int n, double[] a) {
    
        double sum = 0;
    
        for (int i = 0; i < n; i++) {
    
            sum += Math.pow(a[i], 2) / (i + 1);
    
        }
    
        return sum;
    }
    
    private static double calculate_expression_g(int n, double[] a) {
    
        double sum = 0;
        double product = 1;
    
        for (int i = 0; i < n; i++) {
    
            sum += a[i];
            product *= a[i];
        }
    
        System.out.println("Suma liczb: " + sum);
        System.out.println("Iloczyn liczb: " + product);
    
        return sum;
    }
    
    private static double calculate_expression_h(int n, double[] a) {
    
        double result = 0;
    
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += a[i];
            } else {
                result -= a[i];
            }
        }
    
        return result;
    }

    private static double calculate_expression_i(int n, double[] a) {

        double result = 0;
    
        for (int i = 0; i < n; i++) {
            double term = Math.pow(-1, i) * (a[i] / factorial(i));
            result += term;
        }
    
        return result;
    }
    
    private static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
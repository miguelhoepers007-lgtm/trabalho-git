import java.util.Scanner;

public class Multiplicador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite o primeiro numero");
        int a = entrada.nextInt();

        System.out.print("digite o segundo numero");
        int b = entrada.nextInt();

        System.out.print("digite o terceiro numero");
        int c = entrada.nextInt();

        System.out.println("resultado:" + (a + b + c) / 3);
    }

}

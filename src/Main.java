import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //final double PI= 3.1456;

        System.out.println("Informe o valor do raio");
        double raio = input.nextDouble();
        double area = raio * raio * Math.PI;
        double circunferencia = 2 * Math.PI * raio;

        System.out.println("O valor da Area " + area);
        System.out.println("O valor da Circunferencia " + circunferencia);
    }
}
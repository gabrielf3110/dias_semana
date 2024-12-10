import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println(DiasSemana.verificaDia(num));
        /*
            String diaSemana = DiasSemana.verificaDia(num);
            System.out.println(diaSemana);
         */
    }
}

package q4;
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		int dia1, mes1, ano1;
        int dia2, mes2, ano2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira data:");

        dia1 = entrada.nextInt();
        mes1 = entrada.nextInt();
        ano1 = entrada.nextInt();

        System.out.println("Digite a segunda data:");

        dia2 = entrada.nextInt();
        mes2 = entrada.nextInt();
        ano2 = entrada.nextInt();

        if (ano2 > ano1) {
            System.out.println("Data 2 maior");
        } else if (ano1 > ano2) {
            System.out.println("Data 1 maior");
        } else if (ano1 == ano2 && mes2 > mes1) {
            System.out.println("Data 2 maior");
        } else if (ano1 == ano2 && mes1 > mes2) {
            System.out.println("Data 1 maior");
        } else if (ano1 == ano2 && mes1 == mes2 && dia2 > dia1) {
            System.out.println("Data 2 maior");
        } else if (ano1 == ano2 && mes1 == mes2 && dia1 > dia2) {
            System.out.println("Data 1 maior");
        } else if (ano1 == ano2 && mes1 == mes2 && dia1 == dia2) {
            System.out.println("É a mesma data");
        }
    }
}
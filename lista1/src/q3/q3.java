package q3;
import java.util.Scanner;

public class q3 {
	
	public static void main(String[] args) {
		double a, b ,c; 
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite o valor do A:"); 
		a = entrada.nextDouble(); 
		
		System.out.println("Digite o valor do B:"); 
		b = entrada.nextDouble(); 
		
		System.out.println("Digite o valor do C:"); 
		c = entrada.nextDouble(); 
		
		entrada.close();
		
		double delta = (b*b)-(4*a*c); 
		double raiz_delta = Math.sqrt(delta); 
		double resultado1 = (-b+ (raiz_delta))/ 2*a;
		double resultado2 = (-b- (raiz_delta))/ 2*a;
		
		if(delta<0) { 
			System.out.println("A equação não possui valores reais");
		}
		else {
			System.out.println("o valor das raizes é " + resultado1 + " e " + resultado2); 
		}
		
	}

}

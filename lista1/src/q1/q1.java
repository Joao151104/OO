package q1;

import java.util.Scanner;

public class q1 {
	
	public static void main( String [] arg) { 
		double velocidade_veiculo, velocidade_permitida, multa;
		multa = 0; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite a velocidade do veiculo:");
		velocidade_veiculo= entrada.nextDouble(); 
		
		System.out.println("Digite a velocidade permitida na via:");
		velocidade_permitida = entrada.nextDouble();
		
		if(velocidade_veiculo - velocidade_permitida<=10 && velocidade_veiculo - velocidade_permitida>0) { 
			multa = 50; 
		}
		else { 
			if(velocidade_veiculo - velocidade_permitida>10 && velocidade_veiculo - velocidade_permitida <=30){ 
				multa = 100; 
			} else { 
				if(velocidade_veiculo - velocidade_permitida >30) { 
					multa = 200;
				}
				else { 
					if( velocidade_veiculo<= velocidade_permitida) { 
						multa = 0; 
					}
				}
			}
		}
		
		
		
		
		System.out.println("a multa sera de "+multa + " reais");
		
	
		
		
	}

}

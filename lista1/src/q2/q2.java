package q2;
import java.util.Scanner; 

public class q2 {
	
	public static boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
	
	public static void main(String[] args) {
		char entradaA;
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite um caracter: ");
		
		entradaA= entrada.next().charAt(0); 
		
		if(Character.isDigit(entradaA)) { 
			System.out.println("Numero"); 
		} 
		
		else if( isVogal(entradaA)) { 
			System.out.println("Vogal"); 
		}
		else if( Character.isLetter(entradaA)) { 
			System.out.println("Consoante"); 
		}
		else { 
			System.out.println( "Caracter Especial");
			
		}
	}

}

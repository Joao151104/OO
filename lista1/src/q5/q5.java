package q5;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		
		int usuario = 1234; 
		int tentativa_usuario; 
		int senha = 4321; 
		int tentativa_senha; 
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite seu usuario: ");
		
		tentativa_usuario = entrada.nextInt(); 
		
		if(tentativa_usuario == usuario) { 
			System.out.println("Digite a senha: ");
			tentativa_senha = entrada.nextInt(); 
			
			if( senha == tentativa_senha) { 
				System.out.println("Acesso Permitido"); 
			}
			else { 
				System.out.println("Senha Incorreta"); 
			}
		}
		else { 
			System.out.println("Usuario Incorreto"); 
		}
		
	}

}

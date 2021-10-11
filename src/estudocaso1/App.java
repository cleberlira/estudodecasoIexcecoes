package estudocaso1;
import java.util.Scanner;

import excecao.Excecao;


public class App {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		for (int i=0; i< 3; i++) {
			

			Aluno aluno = new Aluno();
			System.out.println("Informe o nome");
			String nome = teclado.next();
			
			System.out.println("Informe matrícula");
			String matricula = teclado.next();
			
			System.out.println("Informe o endereço");
			String endereco = teclado.next();
			
			
			aluno.setAluno(nome);
			aluno.setEndereco(endereco);
			aluno.setMatricula(matricula);
			
			try {
			aluno.incluir(aluno);
			
			}catch (Excecao ex) {
				System.out.println(ex.getMessage());
			}
			
		    
		}
		
		Aluno discente = new Aluno();
		discente.listarAlunos();
		
		
		teclado.close();
		
		// TODO Auto-generated method stub

	}

}

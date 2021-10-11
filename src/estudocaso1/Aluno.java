package estudocaso1;

import excecao.Excecao;

public class Aluno {

	private String aluno;
	private String endereco;
	private String matricula;
	
	
	static Aluno[] alunos = new Aluno[3];
	
	
	static int cad =0;
	
	public boolean verificaAluno(Aluno aluno) {
		boolean resposta = false;
		for (int i = 0; i < alunos.length; i++) {
	
			if (alunos[i]!=null) {
				if (alunos[i].matricula.equals(aluno.getMatricula())) 
					resposta = true;
		
		} 
			
			
	}
		return resposta;
		
	}
	
	
	public void incluir(Aluno aluno) throws Excecao {
		 
		if (verificaAluno(aluno)) {
			throw new Excecao("Matrícula já existente");

		}else {
		alunos[cad] = aluno;
		System.out.println("Aluno " + aluno.getAluno() + " cadastrado com sucesso" );
		cad++;
		
		}
	  
	}
	
	 public void listarAlunos() {
	    for (Aluno aluno: alunos) {
	    	if (aluno!=null)
	           System.out.println("Os alunos cadastrados são: " + aluno.aluno + " matrícula: " + aluno.matricula);  	
	     }
	    	
		  
		  
		  
	  }
	
	
	
	
	
	
	
	
	
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
	
}

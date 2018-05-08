package Exercicio2_1_FactoryMethod;

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Lincoln";
		String sobrenome = "Freitas";
		
		fn.getNome(nome, sobrenome);

	}

}
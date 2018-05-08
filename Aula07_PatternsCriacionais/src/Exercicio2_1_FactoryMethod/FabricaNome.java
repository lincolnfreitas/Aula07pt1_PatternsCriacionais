package Exercicio2_1_FactoryMethod;
/**
 * 
 * @author Lincoln de freitas almeida 816119071  SI3ANMCA
 * 			
 *
 */
public class FabricaNome {
	
	public Nome getNome(String nome, String sobrenome){
		return new Informacao(nome, sobrenome);
	}
}

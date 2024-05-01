// Tipos Booleanos
package defaultpackage;

public class Data_Type04 {

	public static void main(String[] args) {
		// Tipos primitivos
		boolean verdadeiro = true; // -> true = 1;
		boolean falso = false; // -> false = 0;
		
		boolean ativo = true;
		
		// Tipos não primitvos
		Boolean v = true;
		Boolean f = false;
		
		// Saídas
		System.out.println("Verdadeiro: " + verdadeiro);
		System.out.println("Falso: " + falso);
		System.out.println("V: " + v);
		System.out.println("F: " + f);
		
		// Verificações
		if (verdadeiro) {
			System.out.println("É Verdadeiro");
		} else {
			System.out.println("É Falso");
		}
		
		if (ativo) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
		
		/*
		 * if sempre retorna verdadeiro ou falso, se for verdadeiro ele executa o if,
		 * senão ele executa o else, por isso que nesse caso não foi colocado uma condição,
		 * porque a variável é boolean, e essa só retorna true ou false.
		 */
	}

}

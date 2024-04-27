// Tipos Alfanuméricos

package defaultpackage;

public class Data_Type03 {

	public static void main(String[] args) {
		// Tipos primitivos
		char letra = 'a';
		char letra1 = 97; // 97 == a -> Tabela ASCII
		// char letra2 = "b"; -> char é aspas simples para texto
		
		// Tipos não primitivos
		String nome = "Matheus"; // String é apenas não primitivo
		// string nome = "Matheus"; -> Errado
		
		System.out.println("Letra " + letra);
		System.out.println("Letra1 " + letra1);
		
		System.out.println("Nome: " + nome);
		
		letra1 = (char) (letra1 + 1); // cast
		
		System.out.println("Letra1 " + letra1);
		
		System.out.println("char/Character " + Character.SIZE + "bits");
		
		System.out.println("Valor Min. char/Character " + Character.MIN_VALUE);
		System.out.println("Valor Máx. char/Character " + Character.MAX_VALUE);
		
		System.out.println("Nome " + nome);
		
		System.out.println("Tamanho da String " + nome.length());
		
		System.out.println("String " + Character.SIZE * nome.length() + " bits");
	}

}

// Tipos de Números
// Numéricos (Intereiros e Reais)

package defaultpackage;

public class Data_Type01 {
	// Tipos primitivos
	public static void main(String[] args) {
		long num0 = 99;
		int num1 = 4; // Inteiro
		short num2 = 5; // Inteiro (curto/menor/baixo)
		byte num3 = 6; // Inteiro (menor do que o short)
		char num9 = 5; // Um caractere, e se baseia na tabela ASCII
		
		// Tipos não primitivos/primários
		// Classes dos tipos de números
		Integer num4 = 7;
		Short num5 = 8;
		Byte num6 = 10;
		Long num7 = (long) 55;
		Character num10 = 5;
		
		System.out.println("int -> Num1: " + num1);
		System.out.println("short -> Num2: " + num2);
		System.out.println("byte -> Num3: " + num3);
		System.out.println("long -> Num0: " + num0);
		System.out.println("char -> Num9: " + num9);
		System.out.println("Integer -> Num4: " + num4);
		System.out.println("Short -> Num5: " + num5);
		System.out.println("Byte -> Num6: " + num6);
		System.out.println("Long -> Num7: " + num7);
		System.out.println("Character -> Num10: " + num10);
		
		// Quantidade de espaço da memória ocupada por cada tipo
		System.out.println("int/Integer " + Integer.SIZE);
		System.out.println("short/Short " + Short.SIZE);
		System.out.println("byte/Byte " + Byte.SIZE);
		
		// Valores máximos e mínimos dos tipos de dados
		System.out.println("Valor Min. int/Integer " + Integer.MIN_VALUE);
		System.out.println("Valor Máx. int/Integer " + Integer.MAX_VALUE);
		
		System.out.println("Valor Min. short/Short " + Short.MIN_VALUE);
		System.out.println("Valor Máx. short/Short " + Short.MAX_VALUE);
		
		System.out.println("Valor Min. byte/Byte " + Byte.MIN_VALUE);
		System.out.println("Valor Máx. byte/Byte " + Byte.MAX_VALUE);
		
		System.out.println("Valor Min. long/Long " + Long.MIN_VALUE);
		System.out.println("Valor Máx. long/Long " + Long.MAX_VALUE);
		
		// Consulte a tabela ASCII para compreender os valores
		System.out.println("Valor Min. char/Character " + Character.MIN_VALUE);
		System.out.println("Valor Máx. char/Character " + Character.MAX_VALUE);
	}

}

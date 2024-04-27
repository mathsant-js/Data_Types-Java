// Tipos de Números
// Numéricos (Intereiros e Reais)

package defaultpackage;

public class Data_Type02 {

	public static void main(String[] args) {
		// Tipos primários
		// Por padrão números com decimais são reconhecidos como double
		float num1 = 25.4f; // float ocupa menos espaço de memória
		double num2 = 25.4;
		
		// Tipos não primários/primitivos
		// Classes dos tipos de números
		// Ocupa mais espaço memória
		Float num3 = 25.4f;
		Double num4 = 25.4;
		
		// Quantidade de espaço da memória ocupada por cada tipo
		System.out.println("float/Float " + Float.SIZE);
		System.out.println("double/Double " + Double.SIZE);
		
		// Valores máximos e mínimos dos tipos de dados
		System.out.println("Valor Min. float/Float " + Float.MIN_VALUE);
		System.out.println("Valor Máx. float/Float " + Float.MAX_VALUE);
		
		System.out.println("Valor Min. double/Double " + Double.MIN_VALUE);
		System.out.println("Valor Máx. double/Double " + Double.MAX_VALUE);
		
	}

}

package FiguraG;

public class TipoF {

	public static void TipoF(int base, int altura) { 											// I
		String figura;                               											// 
		if (base == altura) {                        											// 1 
			figura = "cuadrado";                     											// 2
		} else {                                     											// 
			figura = "rectángulo";                 											    // 3
		}																						//
		int perimetro = 2 * base + 2 * altura;                                                  //
		System.out.println("La figura es un " + figura + " y su perímetro es: " + perimetro);   // 4
	}                                                                                           //

}

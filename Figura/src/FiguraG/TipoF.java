package FiguraG;

public class TipoF {

	public static void TipoF(int base, int altura) {
		String figura;
		if (base == altura) {
			figura = "cuadrado";
		} else {
			figura = "rectángulo";
		}
		int perimetro = 2 * base + 2 * altura;
		System.out.println("La figura es un " + figura + " y su perímetro es: " + perimetro);
	}

}

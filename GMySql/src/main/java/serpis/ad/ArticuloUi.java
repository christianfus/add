package serpis.ad;
import java.util.Scanner;

public class ArticuloUi {
	static Scanner sc = new Scanner(System.in);
	public static void NuevoArt() {
		scanInt("Nombre del articulo:");
		String nombre = sc.next();
		System.out.println("Precio del articulo:");
		float precio = sc.nextFloat();
		System.out.println("Categoria del articulo:");
		long categoria = sc.nextLong();
	
	}
	
	public static int scanInt(String label) {
		while(true) {
			try {
				System.out.println(label);
				String line = sc.nextLine();
				return Integer.parseInt(line);
				
			}catch(NumberFormatException ex) {
				System.out.println("Tiene que ser un número.");
			}
		}
		
	}

}

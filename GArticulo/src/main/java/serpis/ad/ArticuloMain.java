package serpis.ad;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Scanner;

public class ArticuloMain {
	// Pruebas de clase
	public enum Option {
		Salir, Nuevo, Editar, Eliminar, Consultar, Listar
	};

	private static Scanner scanner = new Scanner(System.in);

	public static class Articulo {

		private long id;
		private String nombre;
		private BigDecimal precio;
		private long categoria;
	}

	public static void main(String[] args) {
		Option opt = scan(Option.class);
		Runnable runnable;
		// pruebaLong("introduce un numero: ");

		switch (opt) {
		case Salir:
			runnable = () -> salir();
			runnable.run();
			break;

		case Nuevo:
			runnable = () -> nuevo();
			runnable.run();
			break;

		case Editar:
			runnable = () -> editar();
			runnable.run();
			break;

		case Eliminar:
			runnable = () -> eliminar();
			break;

		case Consultar:
			runnable = () -> consultar();
			break;

		case Listar:
			runnable = () -> listar();
			break;
		}

		showFields(Articulo.class);

	}

	private static Object listar() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object consultar() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object eliminar() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object editar() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object salir() {
		// TODO Auto-generated method stub
		return null;
	}
	// public static long pruebaLong(String prueba) {
	// while (true)
	// try {
	// System.out.println(prueba);
	// String line = scanner.nextLine();
	// return Long.parseLong(line);
	// } catch (NumberFormatException ex) {
	// System.out.println("Por favor, sólo números. Vuelve a introducir");
	//
	// }
	// }

	public static <T extends Enum<T>> T scan(Class<T> enumType) {
		T[] constants = enumType.getEnumConstants();
		for (int index = 0; index < constants.length; index++)
			System.out.printf("%s - %s\n", index, constants[index]);
		String options = String.format("^[0-%s]$", constants.length - 1);
		while (true) {
			System.out.println("Elige una opcion: ");
			String line = scanner.nextLine();
			if (line.matches(options))
				return constants[Integer.parseInt(line)];
			System.out.println("Opcion invalida. Vuelve a introducir.");
		}
	}

	public static void nuevo() {
		// TODO implementar
	}

	private static void showFields(Class<?> type) {
		for (Field field : type.getDeclaredFields())
			System.out.printf("%s - %s", field.getName(), field.getType().getName());
	}

}

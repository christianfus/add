package Ventas;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VentaMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ventas.gventa");
		entityManagerFactory.close();
		
	}
}

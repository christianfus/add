package Ventas;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LineaPedido {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private Articulo articulo;
	private BigDecimal importe;
	private Pedido pedido;
	private BigDecimal precio;
	private long unidades;
	
	//GETSET ID
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
	//GETSET ARTICULO
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	//GETSET IMPORTE
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
	//GETSET PEDIDO
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	//GETSET PRECIO
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	//GETSET UNIDADES
	public long getUnidades() {
		return unidades;
	}
	public void setUnidades(long unidades) {
		this.unidades = unidades;
	}
	
}
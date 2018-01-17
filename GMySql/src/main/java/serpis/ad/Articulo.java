package serpis.ad;

public class Articulo {
	private long id;
	private String nombre;
    private float precio;
    private long categoria;

    public Articulo() {}
    
    //Metodos Get
    public long getId() {
		return id;
	}
    
    public String getNombre() {
    	return nombre;
    }
    
    public float getPrecio() {
    	return precio;
    }
    
    public long getCategoria() {
    	return categoria;
    }
    
    //Metodos Set
    public void setId(long id) {
		this.id = id;
    }
    
    public void setNombre(String nombre) {
    	this.nombre= nombre;
    }
    
    public void setPrecio(float precio) {
		this.precio = precio;
    }
    
    public void setCategoria(long categoria) {
		this.categoria = categoria;
    }
	
}

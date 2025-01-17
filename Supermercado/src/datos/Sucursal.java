package datos;

public class Sucursal extends Usuario {
	private String id_sucursal;
	private String nombre_sucursal;
	private String pedido;
	
	
	public Sucursal(String nombre, String password, String dni, String nivel, String id_sucursal, String nombre_sucursal,
			String pedido) {
		super(nombre, password, dni, nivel="0");
		this.id_sucursal = id_sucursal;
		this.nombre_sucursal = nombre_sucursal;
		this.pedido = pedido;
	}
	public Sucursal() {
		super();
	}
	public String getId_sucursal() {
		return id_sucursal;
	}
	public void setId_sucursal(String id_sucursal) {
		this.id_sucursal = id_sucursal;
	}
	public String getNombre_sucursal() {
		return nombre_sucursal;
	}
	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
	
	
	@Override
	public String toString() {
		return "Sucursal [id_sucursal=" + id_sucursal + ", nombre_sucursal=" + nombre_sucursal + ", pedido=" + pedido
				+ "]";
	}
	
	
	
}

package datos;

public class Usuario  {
	private String nombre;
	private String password;
	private String dni;
	private String nivel;
	public Usuario(String nombre, String password, String dni, String nivel) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.dni = dni;
		this.nivel = nivel;
	}
	
	
	
	
	
	public Usuario() {
		super();
	}





	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNivel() {
		return nivel;
	}



	public void setNivel(String nivel) {
		this.nivel = nivel;
	}



	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", password=" + password + ", dni=" + dni + ", nivel=" + nivel + "]";
	}



	
}

package ejercicio_5;

public class Cliente {
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private Direccion ciudad;
    private Direccion codigoPostal;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Direccion getCiudad() {
		return ciudad;
	}
	public void setCiudad(Direccion ciudad) {
		this.ciudad = ciudad;
	}
	public Direccion getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(Direccion codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
    
}


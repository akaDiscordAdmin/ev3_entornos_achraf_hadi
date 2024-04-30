package ejercicio_5;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String codigoPostal;

    /*Solo cree el getDireccion de cliente, ya que solo hay 2 clases más, 
     que una setea una nueva direccion y la otra necesita el getDireccion*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
	public String getDireccion() {
		return direccion;
	}
	
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}


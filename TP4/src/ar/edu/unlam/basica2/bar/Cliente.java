package ar.edu.unlam.basica2.bar;

public class Cliente implements Comparable <Cliente> {
	private String nombre;
	private Integer edad;

	// Oredanados alfabeticamente y por edad
	@Override
	public int compareTo(Cliente otroCliente) {
		if (this.edad > otroCliente.edad)
			return -1;
		else if (this.edad < otroCliente.edad)
			return 1;
		return this.edad.compareTo(otroCliente.edad);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;				
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
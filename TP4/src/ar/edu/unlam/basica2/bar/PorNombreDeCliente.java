package ar.edu.unlam.basica2.bar;

import java.util.Comparator;

public class PorNombreDeCliente implements Comparator<Cliente>  {
	
	@Override
	public int compare(Cliente unCliente, Cliente otroCliente) {
		
		return unCliente.getNombre().toUpperCase().compareTo(otroCliente.getNombre().toUpperCase());
	}


}

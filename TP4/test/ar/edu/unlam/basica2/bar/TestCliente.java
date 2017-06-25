package ar.edu.unlam.basica2.bar;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class TestCliente {

	@Test
	public void testClientesDiferentesNombreYOrdenadosPorNombre() {

		PorNombreDeCliente miCliente = new PorNombreDeCliente();	
		TreeSet <Cliente> miSetDeCliente = new TreeSet <Cliente>(miCliente);
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Homero");
		cliente1.setEdad(19);

		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Homero");
		cliente2.setEdad(35);

		Cliente cliente3 = new Cliente();
		cliente3.setNombre("Carlos");
		cliente3.setEdad(25);

		Cliente cliente4 = new Cliente();
		cliente4.setNombre("Ana");
		cliente4.setEdad(20);
		
		try {
			Assert.assertTrue(miCliente.compare(cliente2, miSetDeCliente.last()) == 0);
		} catch (Exception e) {
			System.out.println("No hay clientes en la lista");
		}

		miSetDeCliente.add(cliente1);
		miSetDeCliente.add(cliente2);
		miSetDeCliente.add(cliente3);
		miSetDeCliente.add(cliente4);
		
		Assert.assertEquals(3, miSetDeCliente.size()); 

		Assert.assertTrue(miSetDeCliente.last().getNombre().equals("Homero"));
		Assert.assertTrue(miSetDeCliente.first().getNombre().equals("Ana"));
		
		Assert.assertTrue(miSetDeCliente.first().toString().equals("Cliente [nombre=Ana, edad=20]"));
		
		Assert.assertTrue(miCliente.compare(cliente3, cliente2) != 0);
		
		Assert.assertTrue(miCliente.compare(cliente2, miSetDeCliente.last()) == 0);
				   
	}
	
	@Test
	public void testOrdenadosPorEdad() {
		
		List <Cliente> miListaDeClientes = new LinkedList <Cliente>();
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Laura");
		cliente1.setEdad(19);
        
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Homero");
		cliente2.setEdad(29);
        
		Cliente cliente3 = new Cliente();
		cliente3.setNombre("Diego");
		cliente3.setEdad(20);
        
		miListaDeClientes.add(cliente1);
		miListaDeClientes.add(cliente2);
		miListaDeClientes.add(cliente3);
        
        
        Collections.sort(miListaDeClientes);
        System.out.println(miListaDeClientes);
        
       
        Assert.assertEquals(3,miListaDeClientes.size());
        Assert.assertTrue(miListaDeClientes.get(0).getNombre().equals("Homero"));
		Assert.assertTrue(miListaDeClientes.get(2).getNombre().equals("Laura"));

	
	}
	
	
}

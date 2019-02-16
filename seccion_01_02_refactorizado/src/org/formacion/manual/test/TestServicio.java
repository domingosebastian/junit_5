package org.formacion.manual.test;

import org.formacion.manual.servicio.Servicio;

public class TestServicio {

	public static void main(String[] args) {
		
		Servicio servicio = new Servicio();
		
		if (servicio.obtenerSituacionParaCompra("JUnit 5", null) != Servicio.Situacion.NO_AUTENTICADO) {
			throw new IllegalStateException("valor devuelto incorrecto!");
		}
		
		System.out.println("ok");
	
	}

}

package org.formacion.manual.test;

import org.formacion.manual.servicio.Servicio;

public class TestServicio {

	public static void main(String[] args) {
		
		Servicio servicio = new Servicio();
		
		// El metodo matricula tiene demasiadas dependencias con el entorno para poder ser 
		//  probado de forma aislada (prueba unitari)
		// servicio.matricula("JUnit5"); // usa mucha infraestructura (autenticacion, bbdd ...)
		
		System.out.println("ok");
	
	}

}

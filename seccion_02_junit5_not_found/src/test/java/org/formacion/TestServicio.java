package org.formacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestServicio {

	@Test
	void test() {
		Servicio servicio = new Servicio();
		assertEquals(7, servicio.suma(2,5), "2 + 5");
	}

}

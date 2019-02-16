package org.formacion.manual.servicio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String cuenta;
	private List<String> cursos;
	
	public Usuario(String cuenta) {
		this.cuenta = cuenta;
		this.cursos = new ArrayList<>();
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	public boolean esAlumno (String curso) {
		return cursos.contains(curso);
	}
	
	public void apunta (String curso) {
		cursos.add(curso);
	}
	
}

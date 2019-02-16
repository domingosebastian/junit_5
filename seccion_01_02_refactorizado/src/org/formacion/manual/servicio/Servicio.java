package org.formacion.manual.servicio;

public class Servicio {

	public enum Situacion { NO_AUTENTICADO, SIN_CUENTA, YA_MATRICULADO, OK }
	
	public void matricula (String curso) {
		
		Usuario usuario = obtenUsuarioSesion();
		
		Situacion situacion = obtenerSituacionParaCompra(curso, usuario);
		
		if (situacion == Situacion.NO_AUTENTICADO ) {
			redirect("/autenticacion");
		}
		
		if (situacion == Situacion.SIN_CUENTA) {
			redirect ("/configuracion");
		}
		
		if (situacion == Situacion.YA_MATRICULADO) {
			showError("Ya esta matriculado del curso");
		}
		
		if (situacion == Situacion.OK) {
			int precio = obtenerPrecioCurso(curso);
			
			boolean ok = pago(usuario.getCuenta(), precio);
			
			if (!ok) {
				showError("Error realizando pago");
				return;
			}
			
			redirect("/curso/" + curso);
		}
	}


	public Situacion obtenerSituacionParaCompra(String curso, Usuario usuario) {
		Situacion situacion = null;
		if (usuario == null) {
			situacion =  Situacion.NO_AUTENTICADO;
		} else if (usuario.getCuenta() == null) {
			situacion =  Situacion.SIN_CUENTA;
		} else if (usuario.esAlumno(curso))  {
			situacion =  Situacion.YA_MATRICULADO;
		} else {
			situacion =  Situacion.OK;
		}
		return situacion;
	}
	
	
	public Usuario obtenUsuarioSesion() {
		return new Usuario("cuenta");
	}
	
	public void redirect (String url) {}
	
	public void showError (String mensaje) {}
	
	public int obtenerPrecioCurso(String curso) {
		return 100;
	}
	
	public boolean pago (String cuenta, int cantidad) {
		return true;
	}
	
}

package control;

import control.acciones.AccionIrAMarca;
import control.acciones.AccionMarcar;
import control.acciones.AccionPaginaAnterior;
import control.acciones.AccionPaginaSiguiente;
import modelo.Libro;
import vista.LectorUIEjemplo;

public class LectorBridge extends LectorUIEjemplo {
	private Libro libro;
	

	public LectorBridge() {
		this.libro = new Libro();
		establecerListeners();
	}

	private void establecerListeners() {
		getBtnAlante().addActionListener(new AccionPaginaSiguiente(this));
		getBtnAtras().addActionListener(new AccionPaginaAnterior(this));
		getBtnIrAMarca().addActionListener(new AccionIrAMarca(this));
		getBtnMarcar().addActionListener(new AccionMarcar(this));
		
	}

	public boolean cargarPaginaSiguiente() {
		getTextArea().setText(String.valueOf(libro.getPaginas().get(libro.getActual() + 1)));
		return true;
	}

	public boolean cargarPaginaAnterior() {
		getTextArea().setText(String.valueOf(libro.getPaginas().get(libro.getActual() - 1)));
		return false;
	}

	public void cargarMarca() {
		getTextArea().setText(String.valueOf(libro.getPaginas().get(libro.getMarca())));
		
	}

	public Libro getLibro() {
		return libro;
	}
	

}

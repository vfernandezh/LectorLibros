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
		libro.cargarPagina(libro.getActual());
		mostrarPagina();
	}

	private void establecerListeners() {
		getBtnAlante().addActionListener(new AccionPaginaSiguiente(this));
		getBtnAtras().addActionListener(new AccionPaginaAnterior(this));
		getBtnIrAMarca().addActionListener(new AccionIrAMarca(this));
		getBtnMarcar().addActionListener(new AccionMarcar(this));

	}

	public void mostrarPagina() {
		getTextArea().setText(libro.obtenerLectura());
	}

	public void actualizarNumeroPagina() {
		getLblNumeroPagina().setText(String.valueOf(libro.getActual()));
	}

	public void cargarMarca() {
		libro.cargarPagina(libro.getActual());

	}

	public Libro getLibro() {
		return libro;
	}

}

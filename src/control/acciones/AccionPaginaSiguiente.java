package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.LectorBridge;

public class AccionPaginaSiguiente implements ActionListener{
	private LectorBridge lectorBridge;

	public AccionPaginaSiguiente(LectorBridge lectorBridge) {
		this.lectorBridge = lectorBridge;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		lectorBridge.getLibro().avanzarPagina();
		lectorBridge.actualizarNumeroPagina();
		lectorBridge.getLibro().cargarPagina(lectorBridge.getLibro().getActual());
		lectorBridge.mostrarPagina();
		lectorBridge.getContentPane().updateUI();
	}

}

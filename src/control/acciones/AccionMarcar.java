package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.LectorBridge;

public class AccionMarcar implements ActionListener{
	private LectorBridge lectorBridge;

	public AccionMarcar(LectorBridge lectorBridge) {
		this.lectorBridge = lectorBridge;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		lectorBridge.getLibro().marcarPagina();
		
	}

}

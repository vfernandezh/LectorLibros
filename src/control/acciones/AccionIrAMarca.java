package control.acciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.LectorBridge;

public class AccionIrAMarca implements ActionListener {
private LectorBridge lectorBridge;

public AccionIrAMarca(LectorBridge lectorBridge) {
	this.lectorBridge = lectorBridge;
}

@Override
public void actionPerformed(ActionEvent e) {
	
	
	lectorBridge.getLibro().irAMarca();
	lectorBridge.getLibro().cargarPagina(lectorBridge.getLibro().getActual());
	lectorBridge.actualizarNumeroPagina();
	lectorBridge.mostrarPagina();
	lectorBridge.getContentPane().updateUI();
	
}


}

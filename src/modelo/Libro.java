package modelo;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JTextArea;

import control.LectorBridge;

public class Libro implements Legible {

	private LectorBridge lectorBridge;
	private String lectura;
	private int actual = 0;
	private int marca = 0;
	private ArrayList<Pagina> paginas;

	public Libro() {
		super();
		lectura = "juegoTronos.txt";
		paginas = new ArrayList<>();
		cargarPagina();

	}

	private void cargarPagina() {

		try {
			FileReader fileR = new FileReader(lectura);
			BufferedReader bufferR = new BufferedReader(fileR);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void avanzarPagina() {
		if (!comprobarUltimaPagina()) {
			if (lectorBridge.cargarPaginaSiguiente())
				actual++;
		}

	}

	private boolean comprobarUltimaPagina() {
		if (actual >= paginas.size()) {
			return true;
		}
		return false;
	}

	@Override
	public void retrocederPagina() {
		if (!comprobarPrimeraPagina()) {
			if (lectorBridge.cargarPaginaAnterior())
				actual--;
		}

	}

	private boolean comprobarPrimeraPagina() {
		if (actual <= 0) {
			return true;
		}
		return false;
	}

	@Override
	public void marcarPagina() {
		marca = actual;

	}

	@Override
	public void irAMarca() {
		lectorBridge.cargarMarca();
	}

	public String getLectura() {
		return lectura;
	}

	public int getActual() {
		return actual;
	}

	public int getMarca() {
		return marca;
	}

	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}

}

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
	private char[] array;

	public Libro() {
		super();
		lectura = "juegoTronos.txt";
		paginas = new ArrayList<>();
		

	}

	public void cargarPagina() {
		try {
			array= new char[400];
			FileReader fileR = new FileReader(lectura);
			BufferedReader bufferR = new BufferedReader(fileR);
			bufferR.read(this.array, actual*400, 400);
			bufferR.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String obtenerLectura() {
		StringBuilder builder= new StringBuilder();
		for (int i = 0; i < this.array.length; i++) {
			builder.append(this.array[i]);
		}
		 String lectura=builder.toString();
		 return lectura;
	}

	@Override
	public void avanzarPagina() {
		if (!comprobarUltimaPagina()) {
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
	
	public char[] getArray() {
		return array;
	}


}

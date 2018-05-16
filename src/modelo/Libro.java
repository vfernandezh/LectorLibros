package modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import control.LectorBridge;

public class Libro implements Legible {

	private LectorBridge lectorBridge;
	private String lectura;
	private int actual;
	private int marca;
	private byte[] array;

	public Libro() {
		super();
		this.lectura = "JuegoTronos.txt";
		this.actual = 1;
		this.marca = 0;

	}

	public void cargarPagina(int pagina) {
		try {
			array = new byte[600];
			FileInputStream fileR = new FileInputStream(lectura);
			for (int i = 0; i < pagina; i++) {
				fileR.read(this.array);
			}
			fileR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String obtenerLectura() {
		try {
			return new String(this.array, "utf8");
		} catch (UnsupportedEncodingException e) {
			return "No se puede cargar la pagina";
		}
	}

	@Override
	public void avanzarPagina() {
			this.actual++;

	}


	@Override
	public void retrocederPagina() {
		if (!comprobarPrimeraPagina()) {
			this.actual--;
		}

	}

	private boolean comprobarPrimeraPagina() {
		return actual == 1;
		
	}

	@Override
	public void marcarPagina() {
		this.marca = actual;

	}

	@Override
	public void irAMarca() {
		if (this.marca!=0){
			this.actual= marca;
		}
		
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

	public byte[] getArray() {
		return array;
	}

}

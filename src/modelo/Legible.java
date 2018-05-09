package modelo;

public interface Legible {
	/**
	 * Este metodo nos lleva la pagina siguiente
	 */
	public void avanzarPagina();
	
	/**
	 * Este metodo nos lleva la pagina anterior
	 */
	public void retrocederPagina();
	
	/**
	 * Estodo metodo nos marca una pagina
	 */
	public void marcarPagina();
	
	/**
	 * Este metodo nos lleva a la pagina marcada
	 */
	public void irAMarca();
}

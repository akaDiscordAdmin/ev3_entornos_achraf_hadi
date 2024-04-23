package ejercicio_4;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @param producto
 * @param modo
 * @throws Exception
 */
public class GestorAlmacen {
	private List<String> productos = new ArrayList<>();
	public static final int AGREGAR = 1;
	public static final int ELIMINAR = 0;

	/**
	 * Metodo que maneja productos, elimar y agregar.
	 * @param producto nombre del producto.
	 * @param modo eliminar o agregar.
	 * @throws Exception
	 */
	public void manejarProducto(String producto, int modo) throws Exception {
		if (productos.contains(producto) && modo == ELIMINAR) {
			productos.remove(modo);
		} else if (!productos.contains(producto) && modo == AGREGAR) {
			productos.add(producto);
		} else if (modo == AGREGAR) {
			throw new Exception("Imposible añadir, el producto ya estaba");
		} else if (modo == ELIMINAR) {
			throw new Exception("Imposible borrar, el producto no está");
		} else
			throw new Exception("Modo no soportado");

	}
}

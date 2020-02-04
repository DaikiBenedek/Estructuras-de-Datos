/**
 *
 * @author Luis Manuel Martínez Dámaso
 */
import java.util.Iterator;

public class ArregloDinamico<T> implements Iterable<T> {

    private T[] arreglo;
    private int elementos;

    private class Iterador<T> implements Iterator<T> {

        private int siguiente;

        public Iterador() {

        }

        @Override
        public boolean hasNext() {
	    return siguiente<=elementos;
        }

        @Override
        public T next() {
	    if(arreglo.hasNext()){
		T[] aux =arreglo[siguiente];
		siguiente++;
		return aux;
	    }
	    else{
		return null;
	    }
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

    }

    /**
     * Constructor por omisión
     */
    public ArregloDinamico() {
        this.arreglo = (T[]) new Object[20];
    }

    /**
     * Constructor que recibe el tamaño con el cual queremos inicializar el
     * arreglo dinámico.
     *
     * @param n
     */
    public ArregloDinamico(int n) {
        this.arreglo= (T[]) new Object[n];
    }

    /**
     * Método para insertar un elemento al final del arreglo dinamico. Si el
     * arreglo no tiene espacio, crecer el arreglo al doble de tamaño.
     *
     * @param elem
     */
    public void agrega(T elem) {
        if(elementos == arreglo.length){
	    T[] aux = (T[]) new Object[arreglo.length*2];
	    for(int i=0 ; i<arreglo.length;i++){
		arreglo[i] = aux[i];
	    }
	    arreglo = aux;
	}
	arreglo[elementos] = elem;
	elementos++;
    }

    /**
     * Método para acceder al elemento n-esimo del arreglo dinámico. El método
     * debe devolver el elemento buscado. Si no existe elemento n-esimo,
     * devolver null.
     *
     * @param n
     * @return 
     */
    public T busca(int n) {
	if(n >= elementos){
	    return null;
	}
	else{
	    return arreglo[n];
	}
    }

    /**
     * Método para eliminar al elemento n-esimo del arreglo dinámico, no debe
     * haber espacios sin elementos. El método debe devolver el elemento
     * eliminado. Si no existe elemento n-esimo, devolver null.
     *
     * @param n
     * @return
     */
    public T elimina(int n) {
        //Codigo
        return null;
    }

    /**
     * Método para saber si un elemento esta en el arreglo dinámico, devuelve
     * true si esta en el arreglo, false en otro caso.
     *
     * @param elem
     * @return
     */
    public boolean contiene(T elem) {
        //Aquí va tu código
        return false;
    }
    /**
     * 
     * @param <T>
     * @param array 
     */
    public static <T extends Comparable<T>> void quickSort(ArregloDinamico<T> array) {
	quickSort(array, 0, array.length);
    }
    /**
     * 
     * @param <T>
     * @param a
     * @param ini
     * @param fin 
     */

    public static <T extends Comparable<T>> void quickSort(T[] a, int ini, int fin) {
	/*	while(ini != fin){
	    if(a < arreglo[ini]){
		ini++;
	    }
	    else{
		if(a > arreglo[fin]){
		    fin--;
		}
		else{
		    int aux= arreglo[ini];
		    arreglo[ini] = arreglo[fin];
		    arreglo[fin] = aux;
		}
	    }
	}
    }
*/    
    @Override
    public java.util.Iterator<T> iterator() {
        return new Iterador();
    }

    /**
     * Método para representar el arreglo en una cadena.
     *
     * @return
     */
    @Override
    public String toString() {
    	//Aquí va tu código
        return null;
    }
}

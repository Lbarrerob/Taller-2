package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {	
        arregloEnteros = new int[0];
        arregloCadenas = new String[0];
        
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
        int[] copiaArrEnteros = this.arregloEnteros.clone();
    	return copiaArrEnteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
        String[]copiaArrCadenas = this.arregloCadenas.clone();
    	return copiaArrCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	int tamanioEnteros = this.arregloEnteros.length;
    	return tamanioEnteros;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int tamanioCadenas = this.arregloCadenas.length;
        return tamanioCadenas;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero(int entero)
    {
    	try {
    		int tamanio = this.arregloEnteros.length;
    		int[] nuevo = Arrays.copyOf(this.arregloEnteros, tamanio+1);
        	nuevo [this.arregloEnteros.length] = entero;
        	this.arregloEnteros = nuevo;
    	}catch(Exception e) {
    		this.arregloEnteros = new int[] {entero};
    	}
    	
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	try {
    		int tamanio = this.arregloCadenas.length;
    		String[] nuevo = Arrays.copyOf(this.arregloCadenas, tamanio+1);
        	nuevo [this.arregloCadenas.length] = cadena;
        	arregloCadenas = nuevo;
    	}catch(Exception e) {
    		this.arregloCadenas = new String[] {cadena};
    	}
    	
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int tamanio = this.arregloEnteros.length;
    	int contador = 0;
    	for (int i=0; i<tamanio; i++) {
    		if (this.arregloEnteros[i] == valor) {
    			contador ++;
    		}
    	}
    	int tamNuevo = tamanio - contador;
    	int[] nuevo = new int[tamNuevo];
    	for (int i=0; i<tamanio; i++) {
    		contador = 0;
    		if (this.arregloEnteros[i] != valor) {
    			nuevo[contador] = this.arregloEnteros[i];
    			contador ++;
    		}
    	}
    	this.arregloEnteros = nuevo;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int tamanio = this.arregloCadenas.length;
    	int contador = 0;
    	for (int i=0; i<tamanio; i++) {
    		if (this.arregloCadenas[i].equals(cadena)) {
    			contador ++;
    		}
    	}
    	int tamNuevo = tamanio - contador;
    	String[] nuevo = new String[tamNuevo];
    	for (int i=0; i<tamanio; i++) {
    		contador = 0;
    		if (!this.arregloCadenas[i].equals(cadena)) {
    			nuevo[contador] = this.arregloCadenas[i];
    			contador ++;
    		}
    	}
    	this.arregloCadenas = nuevo;
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion)
    {
    	try {
    		int tamanio = this.arregloEnteros.length;
        	if (posicion < 0) {
        		this.arregloEnteros[0] = entero;
        	}
        	else if (posicion > tamanio-1) {
        		this.arregloEnteros[tamanio-1] = entero;
        	}
        	else {
        		this.arregloEnteros[posicion] = entero;
        	}
    	}catch (Exception e) {
    		this.arregloEnteros = new int[] {entero};
    	}
    	
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a 
     * ninguna posición del arreglo de enteros, el método no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	try {
    		int tamanio = this.arregloEnteros.length;
        	int [] nuevo = new int[tamanio-1];
        	int contador = 0;
        	for (int i=0; i<tamanio; i++) {
        		if (i != posicion) {
        			nuevo [contador] = this.arregloEnteros[i];
        			contador ++;
        		}
        	}
        	this.arregloEnteros = nuevo;
    	}catch (Exception e){
    		
    	}
    	
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int tamanio = valores.length;
    	int[] rEnteros = new int[tamanio];
    	for (int i=0; i<tamanio; i++) {
    		rEnteros[i] = (int) valores[i];
    	}
    	this.arregloEnteros = rEnteros;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	int tamanio = objetos.length;
    	String[] rCadenas = new String[tamanio];
    	for (int i=0; i<tamanio; i++) {
    		rCadenas[i] = objetos[i].toString();
    	}
    	this.arregloCadenas = rCadenas;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int tamanio = this.arregloEnteros.length;
    	for (int i=0; i<tamanio; i++) {
    		if (this.arregloEnteros[i] < 0) {
    			this.arregloEnteros[i] = this.arregloEnteros[i]*(-1);
    		}
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	int tamanio = this.arregloEnteros.length;
    	int [] ordenado = new int [tamanio];
    	for (int i=0; i<tamanio; i++) {
    		int menor = this.encontrarEnteroMenor( );
    		ordenado[i] = menor;
    	}
    	this.arregloEnteros = ordenado;
    }
    
    private int encontrarEnteroMenor( )
    {
    	int tamanio = this.arregloEnteros.length; 
    	int menor = 999999999;
    	int posMenor = 0;
    	for (int i=0; i<tamanio; i++) {
    		if (this.arregloEnteros[i] < menor) {
    			menor = this.arregloEnteros[i];
    			posMenor = i;
    		}
    	}
    	this.eliminarEnteroPorPosicion(posMenor);
    	return menor;
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	int tamanio = this.arregloCadenas.length;
    	String [] ordenado = new String [tamanio];
    	for (int i=0; i<tamanio; i++) {
    		String menor = this.encontrarCadenaMenor();
    		ordenado[i] = menor;
    	}
    	this.arregloCadenas = ordenado;
    }
    
    private String encontrarCadenaMenor( )
    {
    	int tamanio = this.arregloCadenas.length;
    	String cadenaMenor = "😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀😀";
    	int posMenor = 0;
    	for (int i=0; i<tamanio; i++) {
    		int comparacion = this.arregloCadenas[i].compareTo(cadenaMenor);
    		if (comparacion < 0) {
    			cadenaMenor = this.arregloCadenas[i];
    			posMenor = i;
    		}
    	}
    	this.eliminarEnteroPorPosicion(posMenor);
    	return cadenaMenor;
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int tamanio = this.arregloEnteros.length;
    	int cantidad = 0;
    	for (int i=0; i<tamanio; i++) {
    		if (this.arregloEnteros[i] == valor) {
    			cantidad ++;
    		}
    	}
    	return cantidad;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int tamanio = this.arregloCadenas.length;
    	int cantidad = 0;
    	for (int i=0; i<tamanio; i++) {
    		if (this.arregloCadenas[i].equals(cadena)) {
    			cantidad ++;
    		}
    	}
    	return cantidad;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
        int tamanio = this.arregloEnteros.length;
        int contador = 0; 
        for (int i=0; i<tamanio; i++) {
        	if (this.arregloEnteros[i] == valor) {
        		contador ++;
        	}
        }
        int[] posiciones = new int[contador]; 
        int pos = 0;
        for (int i=0; i<tamanio; i++) {
        	if (this.arregloEnteros[i] == valor) {
        		posiciones[pos] = i;
        		pos ++;
        	}
        }
    	return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
        if (this.arregloEnteros.length == 0) {
        	return new int[0];
        }
        else {
        	int[] minYmax = new int[2];
            int min = this.enteroMenor();
            int max = this.enteroMayor();
            
            minYmax[0] = min;
            minYmax[1] = max;
            
        	return minYmax;
        }
    }
    
    private int enteroMenor( )
    {
    	int tamanio = this.arregloEnteros.length; 
    	int menor = 999999999;
    	int posMenor = 0;
    	for (int i=0; i<tamanio; i++) {
    		if (this.arregloEnteros[i] < menor) {
    			menor = this.arregloEnteros[i];
    			posMenor = i;
    		}
    	}
    	return menor;
    }
    
    private int enteroMayor( )
    {
    	int tamanio = this.arregloEnteros.length; 
    	int mayor = 0;
    	int posMenor = 0;
    	for (int i=0; i<tamanio; i++) {
    		if (this.arregloEnteros[i] > mayor) {
    			mayor = this.arregloEnteros[i];
    			posMenor = i;
    		}
    	}
    	return mayor;
    }


    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        HashMap<Integer, Integer> histograma = new HashMap<Integer, Integer>();
        int tamanio = this.arregloEnteros.length;
        for (int i=0; i<tamanio; i++) {
        	if (!histograma.containsKey(this.arregloEnteros[i])) {
        		histograma.put(this.arregloEnteros[i], 1);
        	}
        	else {
        		int valor = histograma.get(this.arregloEnteros[i]);
        		valor ++;
        		histograma.put(this.arregloEnteros[i], valor);
        	}	
        }
        		
    	return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteros diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> histoAnterior = this.calcularHistograma();
    	List<Integer> repeticiones = new ArrayList<Integer>(histoAnterior.values());
    	int contador = 0;
    	for (int i=0; i<repeticiones.size(); i++) {
    		if (repeticiones.get(i)>1) {
    			contador++;
    		}
    	}
    	return contador;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	boolean respuesta = true;
    	for (int i=0; i<this.arregloEnteros.length; i++) {
    		if (this.arregloEnteros[i] != otroArreglo[i]) {
    			respuesta = false;
    		}
    	}
        return respuesta;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    @SuppressWarnings("unused")
	public boolean mismosEnteros( int[] otroArreglo )
    {
    	boolean respuesta = true;
    	for (int i=0; i<this.arregloEnteros.length; i++) {
    		boolean temp = false;
    		for (int j = 0; j < otroArreglo.length; j++) {
        		if (this.arregloEnteros[i] == otroArreglo[j]) {
        			temp = true;
        		}
        	}
    		if (!temp) {
    			respuesta = false;
    		}
    		break;	
    	}
        return respuesta;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] arreglo = new int[cantidad];
    	for (int i=0; i<cantidad; i++) {
    		int numero = (int) (Math.random()*maximo);
    		if (numero < minimo) {
    			arreglo[i] = minimo;
    		}
    		else {
    			arreglo[i] = numero;
    		}
    	}
    	this.arregloEnteros = arreglo;
    }

}

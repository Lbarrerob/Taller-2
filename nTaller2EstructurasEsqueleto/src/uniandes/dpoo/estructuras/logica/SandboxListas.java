package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas
{
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> listaEnteros;

    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones
     */
    private List<String> listaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxListas( )
    {
        listaEnteros = new ArrayList<Integer>( );
        listaCadenas = new LinkedList<String>( );
    }

    /**
     * Retorna una copia de la lista de enteros, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de enteros
     */
    public List<Integer> getCopiaEnteros( )
    {
    	try {
    		List<Integer> copiaEnteros = new ArrayList<Integer>( );
        	Iterator<Integer> iterador = this.listaEnteros.iterator();
        	while (iterador.hasNext()) {
        		Integer elemento = iterador.next();
        		copiaEnteros.add(elemento);
        	}
        	return copiaEnteros;
    	}catch(Exception e){
    		return this.listaEnteros;
    	}	
    }

    /**
     * Retorna una copia de la lista de cadenas, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de cadenas
     */
    public List<String> getCopiaCadenas( )
    {
    	List<String> copiaEnteros = new LinkedList<String>( );
    	Iterator<String> iterador = this.listaCadenas.iterator();
    	while (iterador.hasNext()) {
    		String elemento = iterador.next();
    		copiaEnteros.add(elemento);
    	}
    	return copiaEnteros;
    }

    /**
     * Retorna un arreglo con los valores de la lista de enteros, es decir un arreglo del mismo tamaño que contiene copias de los valores de la lista
     * @return Una arreglo de enteros
     */
    public Integer[] getEnterosComoArreglo( )
    {
    	int tamanio = this.listaEnteros.size();
;    	Integer[] arreglo = new Integer[tamanio];
    	Iterator<Integer> iterador = this.listaEnteros.iterator();
    	int contador = 0;
    	while (iterador.hasNext()) {
    		Integer elemento = iterador.next();
    		arreglo[contador] = elemento;
    		contador++;
    	}
    	return arreglo;
    }

    /**
     * Retorna la cantidad de valores en la lista de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        int tamanio = this.listaEnteros.size();
    	return tamanio;
    }

    /**
     * Retorna la cantidad de valores en la lista de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
        int tamanio = this.listaCadenas.size();
    	return tamanio;
    }

    /**
     * Agrega un nuevo valor al final de la lista de enteros. Es decir que este método siempre debería aumentar en 1 el tamaño de la lista.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	this.listaEnteros.add(entero);
    }

    /**
     * Agrega un nuevo valor al final de la lista de cadenas. Es decir que este método siempre debería aumentar en 1 la capacidad de la lista.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	this.listaCadenas.add(cadena);
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	try {
    		this.listaEnteros.remove(valor);
    	}catch (Exception e) {
    
    	}
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	this.listaCadenas.remove(cadena);
    }

    /**
     * Inserta un nuevo entero en la lista de enteros
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en la lista aumentada. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño de la lista, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	
    	if (posicion < 0) {
    		this.listaEnteros.add(0, entero);
    	}
    	else if (posicion > this.listaEnteros.size()) {
    		this.listaEnteros.add(this.listaEnteros.size()-1, entero);
    	}
    	else {
    		this.listaEnteros.add(posicion, entero);
    	}
    }

    /**
     * Elimina un valor de la lista de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición de la lista de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	try {
    		this.listaEnteros.remove(posicion);
    	} catch (Exception e) {
    		
    	}
    }

    /**
     * Reinicia la lista de enteros con los valores contenidos en el parámetro 'valores', pero truncados.
     * 
     * Es decir que si el valor fuera 3.67, en la nueva lista debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	List<Integer> nueva = new ArrayList<Integer>();
    	for (int i = 0; i < valores.length; i++) {
    		int elemento = (int) valores[i];
    		nueva.add(i,elemento);
    	}
    }

    /**
     * Reinicia la lista de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarArregloCadenas( List<Object> objetos )
    {
    	List<String> nueva = new LinkedList<String>();
    	for (int i = 0; i < objetos.size(); i++) {
    		String elemento = objetos.get(i).toString();
    		nueva.add(i,elemento);
    	}
    }

    /**
     * Modifica la lista de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	List<Integer> nueva = new ArrayList<Integer>( );
    	Iterator<Integer> iterador = this.listaEnteros.iterator();
    	while (iterador.hasNext()) {
    		Integer elemento = iterador.next();
    		if (elemento < 0) {
    			nueva.add(elemento*(-1));
    		}
    		else {
    			nueva.add(elemento);
    		}
    	}
    	this.listaEnteros = nueva;
    }

    /**
     * Modifica la lista de enteros para que todos los valores queden organizados de MAYOR a MENOR.
     */
    public void organizarEnteros( )
    {
    	this.listaEnteros.sort(Collections.reverseOrder());
    }

    /**
     * Modifica la lista de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	this.listaEnteros.sort(null);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en la lista de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
        int apariciones = 0;
    	Iterator<Integer> iterador = this.listaEnteros.iterator();
    	while (iterador.hasNext()) {
    		Integer elemento = iterador.next();
    		if (elemento == valor) {
    			apariciones ++;
    		}
    	}
    	return apariciones;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en la lista de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
        int apariciones = 0;
        Iterator<String> iterador = this.listaCadenas.iterator();
    	while (iterador.hasNext()) {
    		String elemento = iterador.next();
    		if (elemento.equals(cadena)) {
    			apariciones ++;
    		}
    	}
    	return apariciones;
    }

    /**
     * Cuenta cuántos valores dentro de la lista de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> histoAnterior = this.calcularHistogramaListas();
    	List<Integer> repeticiones = new ArrayList<Integer>( histoAnterior.values());
    	int contador = 0;
    	for (int i=0; i<repeticiones.size(); i++) {
    		if (repeticiones.get(i)>1) {
    			contador++;
    		}
    	}
    	return contador;
    }
    
    private HashMap<Integer, Integer> calcularHistogramaListas( )
    {
        HashMap<Integer, Integer> histograma = new HashMap<Integer, Integer>();
        Iterator<Integer> iterador = this.listaEnteros.iterator();
    	while (iterador.hasNext()) {
    		Integer elemento = iterador.next();
        	if (!histograma.containsKey(elemento)) {
        		histograma.put(elemento, 1);
        	}
        	else {
        		int valor = histograma.get(elemento);
        		valor ++;
        		histograma.put(elemento, valor);
        	}	
        }
    	return histograma;
    }

    
    /**
     * Compara la lista de enteros con un arreglo de enteros y verifica si contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos son los mismos y en el mismo orden y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	try {
    		boolean respuesta = true;
            for(int i =0; i < otroArreglo.length;i++) {
            	if (otroArreglo[i] != this.listaEnteros.get(i)) {
            		respuesta = false;
            	}
            }
            return respuesta;
    	} catch (Exception e) {
    		return false;
    	}
    }

    /**
     * Cambia los elementos de la lista de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en la lista deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en la lista
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	List<Integer> arreglo = new ArrayList<Integer>();
    	for (int i=0; i<cantidad; i++) {
    		int numero = (int) (Math.random()*maximo);
    		if (numero < minimo) {
    			arreglo.add(minimo);
    		}
    		else {
    			arreglo.add(numero);
    		}
    	}
    	this.listaEnteros = arreglo;
    }

}

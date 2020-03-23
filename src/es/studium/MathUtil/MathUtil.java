package es.studium.MathUtil;

/**
 * Esto es una clase con la que se calcula varias operaciones
 * 
 * @author David.Info Esto es una prueba del ejercicio 3. Javadoc
 * @version 1.0.0
 *
 */
public class MathUtil {
	/**
	 * Esta funci�n nos ayuda a sumar dos valores
	 * @param a aqu� ingresaremos el primer parametro de la operaci�n
	 * @param b aqu� ingresaremos el segundo parametro de la operaci�n
	 * @return gracias a esta instrucci�n se nos devuelve el resultado
	 */
	public int sumar(int a, int b) {
		return a + b;
	}

	/**
	 * Esta funci�n nos ayuda a restar dos valores
	 * @param a aqu� ingresaremos el primer parametro de la operaci�n
	 * @param b aqu� ingresaremos el segundo parametro de la operaci�n
	 * @return gracias a esta instrucci�n se nos devuelve el resultado
	 */
	public int restar(int a, int b) {
		return a - b;
	}
	/**
	 * Esta funci�n nos ayuda a multiplicar dos valores
	 * @param a aqu� ingresaremos el primer parametro de la operaci�n
	 * @param b aqu� ingresaremos el segundo parametro de la operaci�n
	 * @return gracias a esta instrucci�n se nos devuelve el resultado
	 */
	public int multiplicar(int a, int b) {
		return a * b;
	}

	/**
	 * Esta funci�n nos ayuda a dividir dos valores enteros
	 * @param a aqu� ingresaremos el primer parametro de la operaci�n
	 * @param b aqu� ingresaremos el segundo parametro de la operaci�n
	 * @return gracias a esta instrucci�n se nos devuelve el resultado
	 */
	public int divisionEntera(int a, int b) {
		return (int) Math.floor(a / b);
	}

	/**
	 * Esta funci�n nos ayuda a generar un porcentaje de dos valores
	 * @param a aqu� ingresaremos el primer parametro de la operaci�n
	 * @param b aqu� ingresaremos el segundo parametro de la operaci�n
	 * @return gracias a esta instrucci�n se nos devuelve el resultado
	 */
	public int resto(int a, int b) {
		return a % b;
	}

	/**
	 * Funci�n para averiguar que parametro es menor
	 * 
	 * @param a aqu� ingresaremos el primer parametro de la operaci�n
	 * @param b aqu� ingresaremos el segundo parametro de la operaci�n
	 * @return gracias a esta instrucci�n se nos devuelve el resultado
	 */
	public static int minimo(int a, int b) {
		int min;
		if (a > b) {
			min = b;
		} else {
			min = a;
		}
		return min;
	}
	/**
	 * Esta funci�n nos ayuda a generar una puntuaci�n 
	 * @param puntos nos genera una puntuaci�n
	 */
	public static void rangoPuntos(double puntos) {
		if (puntos >= 100) {
			System.out.println("Tiene m�s de 100 puntos");
		} else if (puntos >= 50) {
			System.out.println("Tiene entre 50 y 100 puntos");
		} else {
			System.out.println("Tiene menos de 50 puntos");
		}
	}

}

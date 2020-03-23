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
	 * Esta función nos ayuda a sumar dos valores
	 * @param a aquí ingresaremos el primer parametro de la operación
	 * @param b aquí ingresaremos el segundo parametro de la operación
	 * @return gracias a esta instrucción se nos devuelve el resultado
	 */
	public int sumar(int a, int b) {
		return a + b;
	}

	/**
	 * Esta función nos ayuda a restar dos valores
	 * @param a aquí ingresaremos el primer parametro de la operación
	 * @param b aquí ingresaremos el segundo parametro de la operación
	 * @return gracias a esta instrucción se nos devuelve el resultado
	 */
	public int restar(int a, int b) {
		return a - b;
	}
	/**
	 * Esta función nos ayuda a multiplicar dos valores
	 * @param a aquí ingresaremos el primer parametro de la operación
	 * @param b aquí ingresaremos el segundo parametro de la operación
	 * @return gracias a esta instrucción se nos devuelve el resultado
	 */
	public int multiplicar(int a, int b) {
		return a * b;
	}

	/**
	 * Esta función nos ayuda a dividir dos valores enteros
	 * @param a aquí ingresaremos el primer parametro de la operación
	 * @param b aquí ingresaremos el segundo parametro de la operación
	 * @return gracias a esta instrucción se nos devuelve el resultado
	 */
	public int divisionEntera(int a, int b) {
		return (int) Math.floor(a / b);
	}

	/**
	 * Esta función nos ayuda a generar un porcentaje de dos valores
	 * @param a aquí ingresaremos el primer parametro de la operación
	 * @param b aquí ingresaremos el segundo parametro de la operación
	 * @return gracias a esta instrucción se nos devuelve el resultado
	 */
	public int resto(int a, int b) {
		return a % b;
	}

	/**
	 * Función para averiguar que parametro es menor
	 * 
	 * @param a aquí ingresaremos el primer parametro de la operación
	 * @param b aquí ingresaremos el segundo parametro de la operación
	 * @return gracias a esta instrucción se nos devuelve el resultado
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
	 * Esta función nos ayuda a generar una puntuación 
	 * @param puntos nos genera una puntuación
	 */
	public static void rangoPuntos(double puntos) {
		if (puntos >= 100) {
			System.out.println("Tiene más de 100 puntos");
		} else if (puntos >= 50) {
			System.out.println("Tiene entre 50 y 100 puntos");
		} else {
			System.out.println("Tiene menos de 50 puntos");
		}
	}

}

package es.studium.practica_2;

/**
 * Clase TestBanco donde se gestiona la informaci�n de las clases Cliente y Cuenta para mostrarla 
 * @author miguel
 *@version 2021
 */

public class TestBanco {
	
	public static void main(String[] args) {
		
		/**
		 * Se crean variables texto y moneda para la refactorizaci�n del c�digo
		 */
		String texto = "La cuenta de";
		String moneda = "Euros";
		
		/**
		 * Se introducen los datos de los clientes haciendo referencia a la clase Cliente
		 */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Ben�tez", "Calle Sol, 4");

		/**
		 * Se introducen los datos de la cuentas de los clientes haciendo referencia a la clase Cuenta
		 */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

		/**
		 * Consulta de las cuentas de los clientes despu�s de realizar movimientos en ellas
		 */
		movimiento(texto, moneda, cuentaAntonio);
		movimiento(texto, moneda, cuentaBeatriz);

		/**
		 * Se realizan modificaciones en el saldo de la cuenta de los clientes
		 */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);

		/**
		 * Consulta de las cuentas de los clientes despu�s de realizar movimientos en ellas
		 */
		movimiento(texto, moneda, cuentaAntonio);
		movimiento(texto, moneda, cuentaBeatriz);

		/**
		 * Se realiza una modificaci�n en la cuenta del cliente Antonio
		 */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
		

		/**
		 * Se realiza una modificaci�n en la cuenta del cliente Beatriz
		 */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
		

		/**
		 * Se realizan modificaciones en el saldo de la cuenta de los clientes
		 */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
		
		/**
		 * Consulta de las cuentas de los clientes despu�s de realizar movimientos en ellas
		 */
		movimiento(texto, moneda, cuentaAntonio);
		movimiento(texto, moneda, cuentaBeatriz);
	}

	/**
	 * M�todo generado despu�s de aplicar la refactorizaci�n con el patr�n extraer m�todo
	 * @param texto
	 * @param moneda
	 * @param cuentaAntonio
	 */
	private static void movimiento(String texto, String moneda, Cuenta cuentaAntonio)
	{
		System.out.println(texto + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " " + moneda);
	}
	
}
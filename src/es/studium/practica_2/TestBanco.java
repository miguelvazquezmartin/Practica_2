package es.studium.practica_2;

/**
 * Clase TestBanco donde se gestiona la información de las clases Cliente y Cuenta para mostrarla 
 * @author miguel
 *@version 2021
 */

public class TestBanco {
	
	public static void main(String[] args) {
		
		String texto = "La cuenta de";
		String moneda = "Euros";
		
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

		/* Antonio y Beatriz consultan el saldo */
		movimiento(texto, moneda, cuentaAntonio);
		movimiento(texto, moneda, cuentaBeatriz);

		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);

		movimiento(texto, moneda, cuentaAntonio);
		movimiento(texto, moneda, cuentaBeatriz);

		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
		

		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
		

		/* Antonio transfiere 50€ a Beatriz */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
		
		movimiento(texto, moneda, cuentaAntonio);
		movimiento(texto, moneda, cuentaBeatriz);
	}

	private static void movimiento(String texto, String moneda, Cuenta cuentaAntonio)
	{
		System.out.println(texto + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " " + moneda);
	}
	
}
package es.studium.practica_2;

public class TestBanco {
	
	public static void main(String[] args) {
		
		String texto = "La cuenta de";
		String moneda = "Euros";
		
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Ben�tez", "Calle Sol, 4");

		/* Por defecto, todas las cuentas nuevas tienen 100� */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

		/* Antonio y Beatriz consultan el saldo */
		System.out.println(texto + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " " + moneda);
		System.out.println(texto + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldo() + " " + moneda);

		/* Beatriz transfiere 50� a Antonio */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);

		/* Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		System.out.println(texto + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " " + moneda);
		System.out.println(texto + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldo() + " " + moneda);

		/* Antonio gana 100� en una rifa y hace un ingreso en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);
		

		/* Beatriz tiene que pagar 30� a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);
		

		/* Antonio transfiere 50� a Beatriz */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
		
		/*Antonio y Beatriz consultan por �ltima vez la cuenta del banco, despu�s de los �ltimos movimientos*/
		System.out.println(texto + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " " + moneda);
		System.out.println(texto + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldo() + " " + moneda);
	}
	
}
package es.studium.practica_2;

public class Cuenta
{/*Creamos los atributos de la clase Cliente*/
		private int numeroCuenta;
		private int saldo;
		private Cliente cliente;
		
		public Cuenta()
		{/*Creamos los constructores por defecto*/
			numeroCuenta=0;
			saldo=0;
			cliente= new Cliente();
		}

		public Cuenta(int numeroCuenta, int saldo, Cliente cliente)
		{/*Genero el constructor por parámetros*/
			super();
			this.numeroCuenta = numeroCuenta;
			this.saldo = saldo;
			this.cliente = cliente;
		}
		/*Genero los Getters and Setter para poder obtener y sacar información de la clase*/
		public int getNumeroCuenta()
		{
			return numeroCuenta;
		}

		public void setNumeroCuenta(int numeroCuenta)
		{
			this.numeroCuenta = numeroCuenta;
		}

		public int getSaldo()
		{
			return saldo;
		}

		public void setSaldo(int saldo)
		{
			this.saldo = saldo;
		}

		public Cliente getCliente()
		{
			return cliente;
		}

		public void setCliente(Cliente cliente)
		{
			this.cliente = cliente;
		}
		
}

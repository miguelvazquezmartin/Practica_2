package es.studium.practica_2;

/**
 * Clase con la que se crean los objetos de tipo Cuenta
 * @author miguel
 *@version 2021
 */
public class Cuenta
{
		private int numeroCuenta;
		private int saldo;
		private Cliente cliente;
		
		/**
		 * Constructor vac�o
		 */
		public Cuenta()
		{
			numeroCuenta=0;
			saldo=0;
			cliente= new Cliente();
		}

		/**
		 * Constructor por par�metros
		 * @param numeroCuenta Atributo de clase numeroCuenta
		 * @param saldo Atributo de clase saldo
		 * @param cliente Atributo de clase cliente
		 */
		public Cuenta(int numeroCuenta, int saldo, Cliente cliente)
		{
			super();
			this.numeroCuenta = numeroCuenta;
			this.saldo = saldo;
			this.cliente = cliente;
		}

		/**
		 * M�todo get de mi atributo numeroCuenta
		 * @return numeroCuenta
		 */
		public int getNumeroCuenta()
		{
			return numeroCuenta;
		}

		/**
		 * M�todo set de mi atributo numeroCuenta
		 * @param numeroCuenta
		 */
		public void setNumeroCuenta(int numeroCuenta)
		{
			this.numeroCuenta = numeroCuenta;
		}

		/**
		 * M�todo get de mi atributo salgo
		 * @return saldo
		 */
		public int getSaldo()
		{
			return saldo;
		}

		/**
		 * M�todo set de mi atributo saldo
		 * @param saldo
		 */
		public void setSaldo(int saldo)
		{
			this.saldo = saldo;
		}

		/**
		 * M�todo get de mi atributo Cliente
		 * @return Cliente
		 */
		public Cliente getCliente()
		{
			return cliente;
		}

		/**
		 * M�todo set de mi atributo Cliente
		 * @param cliente
		 */
		public void setCliente(Cliente cliente)
		{
			this.cliente = cliente;
		}
		
		
}

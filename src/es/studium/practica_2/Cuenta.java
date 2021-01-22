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
		 * Constructor vacío
		 */
		public Cuenta()
		{
			numeroCuenta=0;
			saldo=0;
			cliente= new Cliente();
		}

		/**
		 * Constructor por parámetros
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
		 * Método get de mi atributo numeroCuenta
		 * @return numeroCuenta
		 */
		public int getNumeroCuenta()
		{
			return numeroCuenta;
		}

		/**
		 * Método set de mi atributo numeroCuenta
		 * @param numeroCuenta
		 */
		public void setNumeroCuenta(int numeroCuenta)
		{
			this.numeroCuenta = numeroCuenta;
		}

		/**
		 * Método get de mi atributo salgo
		 * @return saldo
		 */
		public int getSaldo()
		{
			return saldo;
		}

		/**
		 * Método set de mi atributo saldo
		 * @param saldo
		 */
		public void setSaldo(int saldo)
		{
			this.saldo = saldo;
		}

		/**
		 * Método get de mi atributo Cliente
		 * @return Cliente
		 */
		public Cliente getCliente()
		{
			return cliente;
		}

		/**
		 * Método set de mi atributo Cliente
		 * @param cliente
		 */
		public void setCliente(Cliente cliente)
		{
			this.cliente = cliente;
		}
		
		
}

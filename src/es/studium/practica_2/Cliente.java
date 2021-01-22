package es.studium.practica_2;

/**
 * Clase con la que se crean los objetos de tipo Cliente
 * @author miguel
 *@version 2021
 */

public class Cliente
{ 
	private String dni;
	private String nombre;
	private String direccion;
	
	/**
	 * Constructor vac�o
	 */
	public Cliente()
{ 
	dni="";
	nombre="";
	direccion="";
}
	/**
	 * Constructor por par�metros
	 * @param dni Atributo de clase dni
	 * @param nombre Atributo de clase nombre 
	 * @param direccion Atributo de clase direcci�n 
	 */
	public Cliente(String dni, String nombre, String direccion)
	{ 
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/**
	 * M�todo get de mi atributo dni
	 * @return dni
	 */
	public String getDni()
	{
		return dni;
	}

	/**
	 * M�todo set de mi atributo dni
	 * @param dni 
	 */
	public void setDni(String dni)
	{
		this.dni = dni;
	}

	/**
	 * M�todo get de mi atributo nombre
	 * @return nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * M�todo set de mi atributo nombre
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * M�todo get de mi atributo direccion
	 * @return direccion
	 */
	public String getDireccion()
	{
		return direccion;
	}

	/**
	 * M�todo set de mi atributo direccion
	 * @param direccion
	 */
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}	
	
	
}

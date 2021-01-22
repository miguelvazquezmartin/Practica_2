package es.studium.practica_2;

public class Cliente
{ /*Creamos los atributos de la clase Cliente*/
	private String dni;
	private String nombre;
	private String direccion;
	
	public Cliente()
{ /*Creamos los constructores por defecto*/
	dni="";
	nombre="";
	direccion="";
}
	public Cliente(String dni, String nombre, String direccion)
	{ /*Genero el constructor por parámetros*/
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	/*Genero los Getters and Setter para poder obtener y sacar información de la clase*/
	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}	
	
	
}

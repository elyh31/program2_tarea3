
public class Animal {
	
	//declaración de variables
	public  String nombre;
	public int edad;
	
	//construcctor
	Animal(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//obtiene lo almacenado en la variable nombre
	public String getNombre()
	{
		return nombre;
	}
	
	//obtiene lo almacenado en la variable edad
	public int getEdad()
	{
		return edad;
	}
	
	//establese un valor a la variable nombre
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	//establese un valor a la variable edad
	public void setEdad(int edad)
	{
		this.edad = edad;
	}

}

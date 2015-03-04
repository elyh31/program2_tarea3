
public class Perro extends Animal{
	
	public Perro(String nombre, int edad)
	{
		//recupera el constructor creado en la clase Animal
		super (nombre,edad);
	}
	
	//recupera el constructor creado en la clase Animal
	public String ladrar()
	{
		return "gua";
	}
}

package paradigmas;

public class Humano extends Animal {
	    protected String nombre;
	    protected String apellido;
	    public Humano(String nombre,String apellido, String sexo) {
	        super(sexo);
	    	this.nombre = nombre;
	        this.apellido = apellido;
	    }
	  
}

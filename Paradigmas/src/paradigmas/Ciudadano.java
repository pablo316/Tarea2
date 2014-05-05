package paradigmas;

public class Ciudadano extends Humano {
	protected String direccion;
    protected String rut;
    public Ciudadano(String nombre,String apellido,String sexo,String direccion, String rut) {
        super(nombre,apellido,sexo);
        this.direccion = direccion;
    }

}

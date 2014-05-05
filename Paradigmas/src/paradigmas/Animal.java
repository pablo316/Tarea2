package paradigmas;

public class Animal {
	protected int extremidades;
	protected int ojos;
	protected int cabezas;
	protected String sexo;
	public Animal (String sexo){
		this.sexo = sexo;
	}
	public int getextremidades () {
		return extremidades;
		}
		public void setextremidades (int extremidades) {
		this.extremidades = extremidades;
		}
    public int getojos () {
    	return ojos;
    }
    public void setojos (int ojos) {
    	this.ojos = ojos;
    }
    public int getcabezas () {
    	return cabezas;
    }
    public void setcabezas (int cabezas){
    	this.cabezas = cabezas;
    }
}

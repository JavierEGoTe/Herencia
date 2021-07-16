
public class Perro extends Animal implements Mascota{
	String raza="";
	String color = "";
	float peso = 0;
	public Perro(String nombre,int edad) {
		super(nombre,edad);
	}
	public String ladrar() {
		return "Guaf";
	}
	public String comer() {
		return "Comiendo corquetas";
	}
	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return null;
	}
}

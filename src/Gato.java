
public class Gato extends Animal {
	int num_bigotes;
	String color;
	int vidas_disponibles =9;
	
	public int getNumero_bigotes() {
		return num_bigotes;		
	}
	public void setNumero_bigotes(int numero_bigotes) {
		this.num_bigotes = num_bigotes;
	}
	public String getColor(){
		return color;
	}
	public void setColor() {
		this.color = color;
	}
	public int getVidas_diponibles() {
		return vidas_disponibles;
	}
	public void setVidas_disponibles(int vidas_disponibles){
		this.vidas_disponibles = vidas_disponibles;
	}
}
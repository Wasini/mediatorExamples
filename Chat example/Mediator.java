public class Mediator {
	public static void main(String[] args) {
		Usuario a = new Usuario("Alejo");
		Usuario b = new Usuario("Valentina");
		b.sendMessenge("Alejo, hay que tener sexo!");
		a.sendMessenge("Y si vamos a comer comida?");
	}
}
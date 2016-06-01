public class Usuario {
	private String name;

	//constructor
	public Usuario (String nombre){
		this.name = nombre;
	}

	public String getName(){
		return this.name;
	}

	public void sendMessenge (String mensaje){
		Chat.showMessenge(this,mensaje);
	}
}
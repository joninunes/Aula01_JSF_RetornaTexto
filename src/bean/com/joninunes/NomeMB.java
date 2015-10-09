package bean.com.joninunes;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class NomeMB {
	
	//private String nome = "Joni Luis Nunes";
	private String nome;
	
	public String esse(){
		if (getNome().equals("3")){
			return "third";
		}
		else 
		if (getNome().equals("2")){
			return "second";
		}
		else
			return getNome();
	}

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NomeMB() {
		// TODO Auto-generated constructor stub
	}

}


public class Pessoa{
	private String nome;
	private String apelido;
	private Data dataNascimento;


	public Pessoa(String nome){
		this.nome = nome;
	}

	public Pessoa(String nome, String apelido){
		this.nome = nome;
		this.apelido = apelido;
	}

	public Pessoa(String nome, String apelido, Data d){
		this.nome = nome;
		this.apelido = apelido;
		this.dataNascimento = d;
	}


	public String toString(){
		return "n: " + this.nome + 
				", apelido: " + this.apelido + 
				", nasc: " + this.dataNascimento.getDia() + "/" + this.dataNascimento.getMes() + "/" + this.dataNascimento.getAno(); 
	}


	//Getters and Setters
	public void setDataNascimento(Data data){
		this.dataNascimento = data;
	}
	public Data getData(){
		return this.dataNascimento;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}

	public void setApelido(String nome){
	this.apelido = nome;
	}
	public String getApelido(){
		return this.apelido;
	}



	//End Get e Set
	
}
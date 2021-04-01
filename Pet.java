abstract class Pet {
	private String nome;
	private Data dtNasc;
	private double peso;
	private double altura;
	
	abstract public void emitiSom();
	abstract public void movimenta();
	abstract public void come();

	public void dormir(){
		System.out.println("Dormingo...");
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Data dtNasc) {
		this.dtNasc = dtNasc;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}

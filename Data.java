public class Data {
	private int dia;
	private int mes;
	private int ano;

	private	String animal;

	public Data(){
		this.animal = "Dragao";
	}

	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;	
	}



	//Getter e Setters
	public void setDia(int dia){
		if (dia > 0 && dia < 31)
			this.dia = dia;
	}

	public int getDia(){
		return this.dia;
	}

	public void setMes(int mes){
		this.mes = mes;
	}

	public int getMes(){
		return this.mes;
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public int getAno(){
		return this.ano;
	}
	// FIM GETTERS E SETTERS
}

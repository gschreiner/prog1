public class Programa2 {


	public static void main(String[] args) {

		Pessoa p = new Pessoa("Atreyu","Minino do cavalo",  new Data(05,10,1984));

		Data d = p.getData();
		d.setMes(9);

		p.getData().setMes(9);
		
		System.out.println(p.toString());
		
		
	}
}

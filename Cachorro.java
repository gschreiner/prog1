public abstract class Cachorro extends Pet{

	@Override
	public void come() {
		System.out.println("Comendo carne...");
	}

	@Override
	public void movimenta() {
		System.out.println("Caminhando...");	
	}

	@Override
	public void emitiSom() {
		System.out.println("Latindo...");		
	}

	abstract boolean viajaAviao();

	
}

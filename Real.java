package cofrinhoDeMoedas;

//classe da moeda real
public class Real extends Moeda {
	public Real(double valor) {
		super(valor);
		this.cambio = 1; //coloquei o cambio como 1, para ter uma base
	}

	@Override
	void Info() {
		//método info, para imprimir o nome da meoda e o seu valor adicionado ao cofrinho
		System.out.println("Real: " + valor);
	}

	@Override
	double Converter() {
		//esse metódo não tem muita utilidade nessa classe, mas tive que implementá-lo...
		return valor * cambio;
	}

}

package cofrinhoDeMoedas;

//classe da moeda iene
public class Iene extends Moeda {
	public Iene(double valor) {
		super(valor);
		this.cambio = 0.034; //define seu cambio, usei a cotação de agosto/2023
	}

	@Override
	void Info() {
		//método info, para imprimir o nome da meoda e o seu valor adicionado ao cofrinho
		System.out.println("Iene: " + valor);
	}

	@Override
	double Converter() {
		//define o valor da moeda convertido para real
		return valor * cambio;
	}

}

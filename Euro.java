package cofrinhoDeMoedas;

//classe da moeda euro
public class Euro extends Moeda {
	public Euro(double valor) {
		super(valor);
		this.cambio = 5.41; //define seu cambio, usei a cotação de agosto/2023
	}

	@Override
	void Info() {
		//método info, para imprimir o nome da meoda e o seu valor adicionado ao cofrinho
		System.out.println("Euro: " + valor);
	}

	@Override
	double Converter() {
		//define o valor convertido para real
		return valor * cambio;
	}

}

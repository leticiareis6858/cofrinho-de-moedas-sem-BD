package cofrinhoDeMoedas;

//classe da moeda dolar
public class Dolar extends Moeda {
	public Dolar(double valor) {
		super(valor);
		this.cambio = 4.91; //define seu cambio, usei a cotação de agosto/2023
	}

	@Override
	void Info() {
		//método info, para imprimir o nome da meoda e o seu valor adicionado ao cofrinho
		System.out.println("Dolar: " + valor);
	}

	@Override
	double Converter() {
		//define o valor convertido em real
		return valor * cambio;
	}

}

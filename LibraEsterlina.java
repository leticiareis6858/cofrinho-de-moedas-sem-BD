package cofrinhoDeMoedas;

//classe da moeda libra esterlina
public class LibraEsterlina extends Moeda {
	public LibraEsterlina(double valor) {
		super(valor);
		this.cambio = 6.24; //define seu cambio, usei a cotação de agosto/2023
	}

	@Override
	void Info() {
		//método info, para imprimir o nome da meoda e o seu valor adicionado ao cofrinho
		System.out.println("Libra Esterlina: " + valor);
	}

	@Override
	double Converter() {
		//define o valor da moeda convertido para real
		return valor * cambio;
	}

}

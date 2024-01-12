package cofrinhoDeMoedas;

//abstract class de moeda
public abstract class Moeda {

	// define todo o escopo básico que uma moeda precisa ter.(metodos e variáveis)

	double valor;
	double cambio;

	Moeda(double valor) {
		this.valor = valor;
		this.cambio = cambio;
	}

	abstract void Info();

	abstract double Converter();

}

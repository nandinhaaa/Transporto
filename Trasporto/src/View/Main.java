package View;

import Model.Caminhoneiro;
import Model.Carreta;
import Model.Cliente;
import Model.Viagem;

public class Main {
	public static void main(String[] args) {

		Carreta carreta1 = new Carreta("Carreta ct-7000");

		Caminhoneiro caminhoneiro1 = new Caminhoneiro("Joao Alves", "12345689", "123.456.789-10", 2000.0);

		Viagem viagem1 = new Viagem("Sao Paulo", 4.5, 350.0);

		Cliente cliente1 = new Cliente("Pedro", caminhoneiro1, viagem1, carreta1);

		viagem1.calcularViagem();

		cliente1.visualizarViagem();
	}
}

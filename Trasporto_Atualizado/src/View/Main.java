package View;

import java.util.ArrayList;

import Model.Caminhoneiro;
import Model.Carreta;
import Model.Cliente;
import Model.Viagem;

public class Main {
	public static void main(String[] args) {

		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Caminhoneiro> caminhoneiros = new ArrayList<>();
		ArrayList<Carreta> carretas = new ArrayList<>();
		ArrayList<Viagem> viagens = new ArrayList<>();

		// adicionando alguns objetos às listas
		Caminhoneiro caminhoneiro1 = new Caminhoneiro("João", "123456789", null, 0);
		caminhoneiros.add(caminhoneiro1);

		Caminhoneiro caminhoneiro2 = new Caminhoneiro("Fernanda", "987654321", null, 1000);
		caminhoneiros.add(caminhoneiro2);

		Caminhoneiro caminhoneiro3 = new Caminhoneiro("Tulio", "123123123", null, 1300);
		caminhoneiros.add(caminhoneiro3);

		Caminhoneiro caminhoneiro4 = new Caminhoneiro("Amanda", "987654321", null, 0);
		caminhoneiros.add(caminhoneiro4);

		Carreta carreta1 = new Carreta("Mercedes-Benz");
		carretas.add(carreta1);

		Carreta carreta2 = new Carreta("Scania");
		carretas.add(carreta2);

		Carreta carreta3 = new Carreta("Volkswagen");
		carretas.add(carreta3);

		Carreta carreta4 = new Carreta("Volvo");
		carretas.add(carreta4);

		Viagem viagem1 = new Viagem("São Paulo", 1000, 3.5);
		viagem1.calcularViagem();
		viagens.add(viagem1);

		Viagem viagem2 = new Viagem("Rio de Janeiro", 800, 25);
		viagem2.calcularViagem();
		viagens.add(viagem2);

		Viagem viagem3 = new Viagem("Minas Gerais", 300, 100);
		viagem3.calcularViagem();
		viagens.add(viagem3);

		Viagem viagem4 = new Viagem("Santa Catarina", 100, 50);
		viagem4.calcularViagem();
		viagens.add(viagem4);

		Cliente cliente1 = new Cliente("José", caminhoneiro1, carreta1);
		cliente1.adicionarViagem(viagem4);
		clientes.add(cliente1);

		Cliente cliente2 = new Cliente("Maria", caminhoneiro2, carreta2);
		cliente2.adicionarViagem(viagem2);
		clientes.add(cliente2);

		Cliente cliente3 = new Cliente("Laura", caminhoneiro1, carreta3);
		cliente3.adicionarViagens(viagem4, viagem2);

		clientes.add(cliente3);

		for (Cliente cliente : clientes) {
			cliente.visualizarViagens();
			System.out.println();
		}
	}
}

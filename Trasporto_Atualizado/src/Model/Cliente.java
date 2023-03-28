package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String CPF;
	private String RG;
	private Caminhoneiro c1;
	private List<Viagem> viagens;
	private Carreta carreta1;

	public Cliente(String nome, Caminhoneiro c1, Carreta carreta1) {
		this.nome = nome;
		this.c1 = c1;
		this.viagens = new ArrayList<>();
		this.carreta1 = carreta1;
	}

	public void adicionarViagem(Viagem viagem) {
		this.viagens.add(viagem);
	}

	public void adicionarViagens(Viagem viagem, Viagem viagem2) {
		this.viagens.add(viagem);
		this.viagens.add(viagem2);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public Caminhoneiro getC1() {
		return c1;
	}

	public void setC1(Caminhoneiro c1) {
		this.c1 = c1;
	}

	public List<Viagem> getViagens() {
		return viagens;
	}

	public void setViagens(List<Viagem> viagens) {
		this.viagens = viagens;
	}

	public Carreta getCarreta1() {
		return carreta1;
	}

	public void setCarreta1(Carreta carreta1) {
		this.carreta1 = carreta1;
	}

	public void visualizarViagens() {
		System.out.println("Cliente: " + nome);
		for (Viagem viagem : viagens) {
			System.out.println("Motorista: " + c1.getNome());
			System.out.println("Veículo: " + carreta1.getModeloCarreta());
			System.out.println("Destino: " + viagem.getDestino());
			System.out.println("Valor KM: " + viagem.getValorKM() + " Distância: " + viagem.getDistancia());
			System.out.println("Valor total Viagem: " + viagem.getValorViagem());
		}
	}

}

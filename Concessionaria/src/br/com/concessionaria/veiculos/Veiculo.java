package br.com.concessionaria.veiculos;



public class Veiculo {
	
	private String placa;
	private int ano;
	private int modelo;
	private String numerochassi;
	private String cor;
	private int kmRodados;
	
	public int informarQuilometragem(int quilometragem) {
		
		return quilometragem;
	}
	
	public Veiculo(String placa, int ano, int modelo, String numeroChassi, String cor, int kmRodados) {
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.numerochassi = numeroChassi;
		this.cor = cor;
		this.kmRodados = kmRodados;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getNumerochassi() {
		return numerochassi;
	}

	public void setNumerochassi(String numerochasi) {
		this.numerochassi = numerochasi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(int kmRodados) {
		this.kmRodados = kmRodados;
	}
	
}

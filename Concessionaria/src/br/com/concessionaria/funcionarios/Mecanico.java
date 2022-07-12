package br.com.concessionaria.funcionarios;

public class Mecanico {
	
	private String nome;
	private int anoExperiencia;
	private int carrosSimultaneos;
	
	public Mecanico(String nome, int anoExperiencia, int carrosSimultaneos) {
		this.nome = nome;
		this.anoExperiencia = anoExperiencia;
		this.carrosSimultaneos = carrosSimultaneos;
	}
	
	public Mecanico() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoExperiencia() {
		return anoExperiencia;
	}

	public void setAnoExperiencia(int anoExperiencia) {
		this.anoExperiencia = anoExperiencia;
	}

	public int getCarrosSimultaneos() {
		return carrosSimultaneos;
	}

	public void setCarrosSimultaneos(int carrosSimultaneos) {
		this.carrosSimultaneos = carrosSimultaneos;
	}
	
}

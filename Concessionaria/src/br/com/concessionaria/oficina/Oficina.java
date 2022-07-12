package br.com.concessionaria.oficina;

import java.util.ArrayList;
import java.util.Random;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.veiculos.Veiculo;

public class Oficina {

	private String nome;
	private ArrayList<Mecanico> listaMecanico = new ArrayList<Mecanico>();
	private ArrayList<Peca> listaPecas = new ArrayList<Peca>();
	private ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
	private int pecasNecessarias;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Oficina(String nome) {
		this.nome = nome;
	}
	
	public void adicionaMecanico(Mecanico mecanico) {
		listaMecanico.add(mecanico);
	}
	
	public void removerMecanico(Mecanico mecanico) {
		listaMecanico.remove(mecanico);
	}
	
	public void adicionaPeca(Peca peca) {
		listaPecas.add(peca);
	}
	
	public void removerPeca(Peca peca) {
		listaPecas.remove(peca);
	}
	
	public void adicionaVeiculo(Veiculo veiculo) {
		
		listaVeiculos.add(veiculo);
		
		//gerando e armazenando numero aleatorio de pecas para o veículo
		Random aleatorio = new Random();
		int pecaAle = aleatorio.nextInt(3) + 1;
		this.pecasNecessarias += pecaAle;
		
	}
	
	public void removerVeiculo(Veiculo veiculo) {
		listaVeiculos.remove(veiculo);
	}
	
	public int verificarPecasRevisao() {
		
		//verifica se tem veiculos para realizar revisao
		if (listaVeiculos.size()>0) {
			
			//verifica se existem pecas suficientes para realizar revisao
			if(listaPecas.size()<pecasNecessarias) {
				System.out.println("Sem pecas disponiveis na Oficina - Entre em contato com o setor de compra!\n");
			}else{
				System.out.printf("Total de pecas necessarias para as revisoes: %d \n",pecasNecessarias);
			}
		}
		
		return pecasNecessarias;
	}
	
	public boolean realizarRevisaoVeiculos() {
		
		int totalSimul = 0;
		
		//Verifica se existem carros para serem revisados
		if (listaVeiculos.size()>0) {
						
			//Verifica se existem pecas suficientes para realizar as revisões
			if(listaPecas.size()<pecasNecessarias) {
				System.out.println("--");
			} else{
								
				//Verifica se existem mecanicos suficientes para realizar revisao simultanea
				for (int i = 0; i < listaMecanico.size(); i++) {
					totalSimul += listaMecanico.get(i).getCarrosSimultaneos();
				}
			
				if(totalSimul>listaVeiculos.size()) {
					
					System.out.printf("-----------\n");
					//imprime o nome das placas dos carros
					for (int i = 0; i < listaVeiculos.size(); i++) {	
						System.out.printf("PLACA: %s \n",listaVeiculos.get(i).getPlaca());
					}
					System.out.printf("-----------\n");
					
					//imprime o nome dos mecanicos
					for (int i = 0; i < listaMecanico.size(); i++) {	
						System.out.printf("MECANICO: %s \n",listaMecanico.get(i).getNome());
					}
					System.out.printf("-----------\n");
					
					//imprime o nome das pecas
					for (int i = 0; i < listaPecas.size(); i++) {	
						System.out.printf("PECAS: %s \n",listaPecas.get(i).getNome());
					}
					System.out.printf("-----------\n");
					
					return true;
				} else{
					return false;
				}
			}
			
			
		} else {
			System.out.println("Não existem carros para serem revisado");
		}
		return false;		
	}
	
	public float valorTotalPecas() {
		float valorTotal = 0;
		
		//Verfica se existem pecas armazenadas o suficiente
		if(listaPecas.size()>pecasNecessarias) {
			for (int i = 0; i < pecasNecessarias; i++) {
				valorTotal += listaPecas.get(i).getValor();
			}
			System.out.printf("O valor total das pecas necessarias: R$ %.2f\n",valorTotal);
		}
		return valorTotal;
	}
}

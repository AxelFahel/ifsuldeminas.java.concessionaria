package br.com.concessionaria;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.oficina.Oficina;
import br.com.concessionaria.veiculos.Veiculo;

public class Main {

	public static void main(String[] args) {

		//Criando o Objeto Oficina
		Oficina oficina1 = new Oficina("Josue Car");
		
		//Criando os Objetos Veículos
		Veiculo veiculo1 = new Veiculo("AAA1205",2012, 2011, "2XCHC32XD22005200", "Prata", 15200);
		Veiculo veiculo2 = new Veiculo("BBB4502",2019, 2020, "4ACHA32AA55005600", "Verde", 20000);
		Veiculo veiculo3 = new Veiculo("CCC1205",2021, 2021, "5ABBA32BB55008800", "Preto", 70000);
		
		//Criando os Objetos Pecas
		Peca peca1 = new Peca("Parachoque Honda CIVIC 2022", 600, "24/01/2022");
		Peca peca2 = new Peca("CAPO CHEVETTE 83/93", 600, "24/01/2022");
		Peca peca3 = new Peca("PAINEL TRASEIRO CHEVETTE HATCH 83 EM DIANTE EXT SUPERIOR", 250, "22/09/2021");
		Peca peca4 = new Peca("Multimídia Automotivo Pioneer DMH-A248BT WEBLINK, USB, Bluetooth", 1400, "12/12/2021");
		Peca peca5 = new Peca("Par Farol Palio Siena Strada G3 2003 2004 2005 2006", 354, "21/05/2022");
		Peca peca6 = new Peca("Fita LED DRL Dual Color Universal 3000K", 79, "18/01/2022");
		Peca peca7 = new Peca("Câmera de Ré Universal 2 em 1", 30, "21/01/2022");
		Peca peca8 = new Peca("Capota Marítima S10 2012 a 2022", 370, "27/02/2022");
		Peca peca9 = new Peca("Carregador de Bateria Automotiva 12V 2A Shutt", 210, "15/01/2022");
		Peca peca10 = new Peca("Par Suporte Traseiro Capota Marítima Flash Force AH1116", 400, "25/08/2022");
		
		//Criando os Objetos Mecanicos
		Mecanico mecanico1 = new Mecanico("Josue", 10, 4);
		Mecanico mecanico2 = new Mecanico("Erike", 2, 1);
		Mecanico mecanico3 = new Mecanico("Roger", 7, 2);
		
		//Adicionando os Objetos Veiculos na lista
		oficina1.adicionaVeiculo(veiculo1);
		oficina1.adicionaVeiculo(veiculo2);
		oficina1.adicionaVeiculo(veiculo3);
		
		//Adicionando os Objetos Mecanicos na lista
		oficina1.adicionaMecanico(mecanico1);
		oficina1.adicionaMecanico(mecanico2);
		oficina1.adicionaMecanico(mecanico3);
		
		//Adicionando os Objetos Pecas na lista
		oficina1.adicionaPeca(peca1);
		oficina1.adicionaPeca(peca2);
		oficina1.adicionaPeca(peca3);
		oficina1.adicionaPeca(peca4);
		oficina1.adicionaPeca(peca5);
		oficina1.adicionaPeca(peca6);
		oficina1.adicionaPeca(peca7);
		oficina1.adicionaPeca(peca8);
		oficina1.adicionaPeca(peca9);
		oficina1.adicionaPeca(peca10);
		
		//Verificando os métodos
		oficina1.verificarPecasRevisao();
		oficina1.realizarRevisaoVeiculos();
		oficina1.valorTotalPecas();		
		
		//removendo
		oficina1.removerPeca(peca9);
		oficina1.removerPeca(peca8);
		oficina1.removerPeca(peca5);
		oficina1.removerVeiculo(veiculo3);
		
	}

}

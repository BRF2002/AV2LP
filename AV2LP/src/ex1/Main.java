package ex1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String marca, modelo;
		int opcao=0, ano=0, contAno=0, med=0, i=0;
		double val=0, contmenos=0;
		
		ArrayList<String> tabelaFipe = new ArrayList<String>();
		
		System.out.println("DIGITE O VALOR DA OPÇÃO DESEJADA\n1) Cadastrar um Carro\n2) Listagem Geral\n3) Mostrar resultados\n4)SAIR");
		opcao = leitor.nextInt();
		
		do {	
			switch(opcao) {
			
			case 1:
				
						System.out.print("Digite a marca do veículo: \n");
						marca = leitor.next();
						{				
					
						System.out.printf("Digite o modelo do veículo: \n");
						modelo = leitor.next();
						
						System.out.printf("Digite o ano de fabricação do carro: \n");
						ano = leitor.nextInt();
						
						
						System.out.print("Informe o valor do veículo: \n");
						val = leitor.nextDouble();
						
						contAno+=ano;
						
						tabelaFipe.add(marca + ";" + modelo + ";" + Integer.toString(ano) + ";" + Double.toString(val));
						
						if(val>=50000) {contmenos++;	break;}
						else 
						{
						}
						
					}
			
			case 2:
				
				for (String carros: tabelaFipe) {
				System.out.printf(carros+"\n");
				i++;
				}
				break;
			
			case 3:
					System.out.printf("Carros com valor acima ou igual 50 mil reais (Valor>=R$ 50.000,00) " + contmenos + "\n");
					med=(contAno/tabelaFipe.size());
					System.out.printf("Média de anos dos veículos cadastrados: " + med + "\n");
				break;
			case 4:
				break;
			default: 
				System.out.println("Insira um valor válido!"); 
		}
			if(opcao!=4) {
			System.out.println("DIGITE O VALOR DA OPÇÃO DESEJADA\n1) Cadastrar um Carro\n2) Listagem Geral\n3) Mostrar resultados\n4)SAIR");
			opcao = leitor.nextInt();} else {break;}

	}while(opcao!=4);

}
	}
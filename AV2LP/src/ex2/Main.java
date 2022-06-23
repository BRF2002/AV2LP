package ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int matt[][] = new int[2][2];
		
		int matriz1[][] = new int[2][2]; 
		for (int i = 0; i < matriz1.length; i++) {
			for (int c = 0; c < matriz1[i].length; c++) {
				System.out.printf("Digite o números para preencher a linha : ", c + 1, i + 1);
				matriz1[i][c] = leitor.nextInt();
			}
		}
		int matriz2[][] = new int[2][2];
		for (int i = 0; i < matriz2.length; i++) {
			for (int c = 0; c < matriz2[i].length; c++) {
				System.out.printf("Digite o números para preencher a linha : ", c + 1, i + 1);
				matriz2[i][c] = leitor.nextInt();
			}
		}
		leitor.close();
		
		double valdetermi = (matriz2[0][1] * matriz2[1][1])- (matriz2[0][1]*matriz2[1][0]);	

			if(valdetermi!=0)
				{
					System.out.println("O valor determinante é: " + valdetermi);
				}
			else {
				System.out.println("O determinante não pode ser 0");
			
			}
			
			
		matt[0][0] = matriz2[1][1];
		matt[0][1] = matriz2[0][1] * -1;
		matt[1][0] = matriz2[1][0] * -1;
		matt[1][1] = matriz2[0][0];

		double calc=0;
		calc=(1/valdetermi);
		double valaux[][] = new double[2][2];
		
		valaux[0][0]=matt[0][0] * calc;
		valaux[0][1]=matt[0][1] * calc;
		valaux[1][0]=matt[1][0] * calc;
		valaux[1][1]=matt[1][1] * calc;

		     
		
		double matrizFinal[][] = new double[2][2];
	
		
		for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
            	for(int k=0;k<2;k++){
                	matrizFinal[j]=(matriz1[k] * valaux[k][j]);
                    }
                    }    
                }
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        System.out.print(matrizFinal[j]+ " | ");    
                    }    
                        System.out.println();
                    }    
                
	}
}
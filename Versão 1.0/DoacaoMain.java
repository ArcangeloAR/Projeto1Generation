package Pacote1;

import java.util.Scanner;

public class DoacaoMain {

	public static void main(String[] args) {
	
		int opcao;
		int qntdTiposProdutos=0;
		int i;
		int codigoDoacao = 0;
		int opcaoDoacao;
		int opcaoDoacaoPerecivel;
		int opcaoDoacaoNaoPerecivel;
		boolean sair = false;
		
		Scanner read = new Scanner(System.in);

		
		while(sair==false) {
		
			System.out.println("Por favor, digite uma das op��es abaixo: \n1. Adicionar doa��o recebida;\n2. Repassar doa��o;\n3. Visualizar Estoque;\n4. Visualizar Doa��es Recebidas;\n5. Visualizar Doa��es Repassadas;\n6. Sair;");
			opcao = read.nextInt();
			
			while(opcao<1 || opcao>6) {
				System.out.println("Por favor, digite uma op��o v�lida: ");
				opcao = read.nextInt();
			}
			
			switch(opcao) {
			case 1:
					
				System.out.println("Por favor, digite a quantidade de tipos de produtos que ser�o inclusos: ");
					qntdTiposProdutos = read.nextInt();
					codigoDoacao++;
					for(i=0;i<qntdTiposProdutos;i++) {
						System.out.println("Por favor, digite o c�digo da classifica��o do "+(i+1)+"� tipo de produto da doa��o "+codigoDoacao+"-"+(i+1)+": ");
						System.out.println("1. Produto Perec�vel;\n2. Produto N�o Perec�vel;");
						
						opcaoDoacao = read.nextInt();
						
						
						
						while(opcaoDoacao<1 || opcaoDoacao>2) {
							System.out.println("Por favor, digite uma op��o v�lida: ");
							opcaoDoacao = read.nextInt();
						}
						
						switch(opcaoDoacao) {
						case 1:
							System.out.println("Por favor, digite o c�digo do "+(i+1)+"� tipo de produto da doa��o "+codigoDoacao+"-"+(i+1)+": ");
							System.out.println("1. Produtos Farmac�uticos;\n2. Gr�os;\n3. Frutas;\n4. Carnes;\n5. Outros;");
							opcaoDoacaoPerecivel = read.nextInt();
							
							while(opcaoDoacao<1 || opcaoDoacao>5) {
								System.out.println("Por favor, digite uma op��o v�lida: ");
								opcaoDoacaoPerecivel = read.nextInt();
							}
							
							switch(opcaoDoacaoPerecivel) {
							
							case 1:
								/* 	
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observa��o;
								*/
							break;
							
							case 2:
								/*
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observa��o;
							 */
							break;
							
							case 3:
								/*
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observa��o;
							 */
							break;
							
							case 4:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observa��o;
							 */
							break;	
							
							case 5:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observa��o;
							 */
							break;
							}
								
						break;
						
						case 2:
							
							System.out.println("Por favor, digite o c�digo do "+(i+1)+"� tipo de produto da doa��o "+codigoDoacao+"-"+(i+1)+": ");
							System.out.println("1. Produto de Higi�ne;\n2. Produto Enlatado;\n3. Roupas;\n4. Uniforme;\n5. Outros;");
							opcaoDoacaoNaoPerecivel = read.nextInt();
							
							while(opcaoDoacao<1 || opcaoDoacao>5) {
								System.out.println("Por favor, digite uma op��o v�lida: ");
								opcaoDoacaoNaoPerecivel = read.nextInt();
							}
							
							switch(opcaoDoacaoNaoPerecivel) {
							
							case 1:
								/* 	
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observa��o;
								*/
							break;
							
							case 2:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observa��o;
								 */
							break;
							
							case 3:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observa��o;
								 */
							break;
							
							case 4:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observa��o;
								 */
							break;	
							
							case 5:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observa��o;
								 */
							break;
							}
							
							
						break;
						}
	
					}
				System.out.printf("Obrigado por adicionar a doa��o %d",codigoDoacao);
				
			break;
	
			case 2:
				// Repassar doa��o;
			break;
			
			case 3:
				// Visualizar Estoque;
			break;
			
			case 4:
				// Visualizar Doa��es Recebidas;;
			break;
			
			case 5:
				// Visualizar Doa��es Repassadas;
			break;
			
			case 6:
				System.out.println("Obrigado por utilizar nosso programa de repasse de doa��es");
				sair=true;
				
			break;
			
			}
		}
	}

}

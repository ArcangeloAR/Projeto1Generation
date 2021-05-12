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
		
			System.out.println("Por favor, digite uma das opções abaixo: \n1. Adicionar doação recebida;\n2. Repassar doação;\n3. Visualizar Estoque;\n4. Visualizar Doações Recebidas;\n5. Visualizar Doações Repassadas;\n6. Sair;");
			opcao = read.nextInt();
			
			while(opcao<1 || opcao>6) {
				System.out.println("Por favor, digite uma opção válida: ");
				opcao = read.nextInt();
			}
			
			switch(opcao) {
			case 1:
					
				System.out.println("Por favor, digite a quantidade de tipos de produtos que serão inclusos: ");
					qntdTiposProdutos = read.nextInt();
					codigoDoacao++;
					for(i=0;i<qntdTiposProdutos;i++) {
						System.out.println("Por favor, digite o código da classificação do "+(i+1)+"º tipo de produto da doação "+codigoDoacao+"-"+(i+1)+": ");
						System.out.println("1. Produto Perecível;\n2. Produto Não Perecível;");
						
						opcaoDoacao = read.nextInt();
						
						
						
						while(opcaoDoacao<1 || opcaoDoacao>2) {
							System.out.println("Por favor, digite uma opção válida: ");
							opcaoDoacao = read.nextInt();
						}
						
						switch(opcaoDoacao) {
						case 1:
							System.out.println("Por favor, digite o código do "+(i+1)+"º tipo de produto da doação "+codigoDoacao+"-"+(i+1)+": ");
							System.out.println("1. Produtos Farmacêuticos;\n2. Grãos;\n3. Frutas;\n4. Carnes;\n5. Outros;");
							opcaoDoacaoPerecivel = read.nextInt();
							
							while(opcaoDoacao<1 || opcaoDoacao>5) {
								System.out.println("Por favor, digite uma opção válida: ");
								opcaoDoacaoPerecivel = read.nextInt();
							}
							
							switch(opcaoDoacaoPerecivel) {
							
							case 1:
								/* 	
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observação;
								*/
							break;
							
							case 2:
								/*
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observação;
							 */
							break;
							
							case 3:
								/*
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observação;
							 */
							break;
							
							case 4:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observação;
							 */
							break;	
							
							case 5:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Vencimento;
								- Observação;
							 */
							break;
							}
								
						break;
						
						case 2:
							
							System.out.println("Por favor, digite o código do "+(i+1)+"º tipo de produto da doação "+codigoDoacao+"-"+(i+1)+": ");
							System.out.println("1. Produto de Higiêne;\n2. Produto Enlatado;\n3. Roupas;\n4. Uniforme;\n5. Outros;");
							opcaoDoacaoNaoPerecivel = read.nextInt();
							
							while(opcaoDoacao<1 || opcaoDoacao>5) {
								System.out.println("Por favor, digite uma opção válida: ");
								opcaoDoacaoNaoPerecivel = read.nextInt();
							}
							
							switch(opcaoDoacaoNaoPerecivel) {
							
							case 1:
								/* 	
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observação;
								*/
							break;
							
							case 2:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observação;
								 */
							break;
							
							case 3:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observação;
								 */
							break;
							
							case 4:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observação;
								 */
							break;	
							
							case 5:
								/* 
								- Nome doador; 
								- Nome produto; 
								- Quantidade (unidade/peso/ml);
								- Observação;
								 */
							break;
							}
							
							
						break;
						}
	
					}
				System.out.printf("Obrigado por adicionar a doação %d",codigoDoacao);
				
			break;
	
			case 2:
				// Repassar doação;
			break;
			
			case 3:
				// Visualizar Estoque;
			break;
			
			case 4:
				// Visualizar Doações Recebidas;;
			break;
			
			case 5:
				// Visualizar Doações Repassadas;
			break;
			
			case 6:
				System.out.println("Obrigado por utilizar nosso programa de repasse de doações");
				sair=true;
				
			break;
			
			}
		}
	}

}

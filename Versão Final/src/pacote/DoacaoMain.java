package pacote;

import java.util.ArrayList;
import java.util.Scanner;


public class DoacaoMain {

	public static void main(String[] args) {
		
		int opcao = 0;
		int qntdTiposProdutos = 0;
		int opcaoDoacao = 0;
		int opcaoDoacaoPerecivel = 0;
		int opcaoDoacaoNaoPerecivel = 0;
		int quantidadePereciveis;
		int id = 1;
		int quantNaoPereciveis;
		int quantDoacoes = 0;
		boolean sair = false;
		String tipo;
		String nomeDoador;
		String nomeProduto;
		String datavencimento;
		String entidade;
		ArrayList <Doacao> doacoes = new ArrayList<Doacao>();
		ArrayList <Repasse> repasses = new ArrayList<Repasse>();
		
		Scanner read = new Scanner(System.in);
		
		while(sair==false) {
		
			System.out.println("\n---------------------------------------"
					+ "\nPor favor, digite uma das op��es abaixo: "
					+ "\n\t1. Adicionar doa��o recebida;"
					+ "\n\t2. Repassar doa��o;"
					+ "\n\t3. Visualizar Estoque;"
					+ "\n\t4. Visualizar Doa��es Recebidas;"
					+ "\n\t5. Visualizar Doa��es Repassadas;"
					+ "\n\t6. Sair;");
			
			try {
				opcao = read.nextInt();
			}catch(Exception erro){
				System.err.println("\nPor favor, execute o programa novamente e digite um n�mero de acordo com a lista de op��es.");
			}
			
			while(opcao<1 || opcao>6) {
				System.out.println("\nPor favor, digite uma op��o v�lida: ");
				opcao = read.nextInt();
			}
			
			switch(opcao) {
			case 1:
				read.nextLine();
				System.out.println("\nPor favor, digite a quantidade de tipos de produtos que ser�o inclusos: ");
				qntdTiposProdutos = read.nextInt(); 
				System.out.println("\nAgora, insira o nome do doador: ");
				read.nextLine();
				nomeDoador = read.nextLine();
				System.out.println("\nDoador atual: " + nomeDoador);
				Doacao dp = new Doacao(nomeDoador, id++); 
			
				for(int i=0;i<qntdTiposProdutos;i++) {
					System.out.println("\nPor favor, digite o c�digo da classifica��o do "+(i+1)+"� tipo de produto da doa��o "+dp.getId()+"-"+(i+1)+": ");
					System.out.println("\n\t1. Produto Perec�vel;"
							+ "\n\t2. Produto N�o Perec�vel;"); //menu classificacao dos tipos produtos
					
					try {
						opcaoDoacao = read.nextInt();
					}catch(Exception erro){
						System.err.println("\nPor favor, execute o programa novamente e digite um n�mero de acordo com a lista de op��es.");
					}	
					
					while(opcaoDoacao<1 || opcaoDoacao>2) {
						System.out.println("\nPor favor, digite uma op��o valida: ");
						opcaoDoacao = read.nextInt();
					}
					
					switch(opcaoDoacao) {
					case 1:
						System.out.println("Por favor, digite o c�digo do "+(i+1)+"� tipo de produto da doa��o "+dp.getId()+"-"+(i+1)+": ");
						System.out.println("\n\t1. Produtos Farmac�uticos;"
								+ "\n\t2. Gr�os;"
								+ "\n\t3. Frutas;"
								+ "\n\t4. Carnes;"
								+ "\n\t5. Outros;");
						try {
							opcaoDoacaoPerecivel = read.nextInt();
						}catch(Exception erro){
							System.err.println("\nPor favor, execute o programa novamente e digite um n�mero de acordo com a lista de op��es.");
						}
						
						while(opcaoDoacao<1 || opcaoDoacao>5) {
							System.out.println("\nPor favor, digite uma op��o v�lida: "); 
							opcaoDoacaoPerecivel = read.nextInt();
						}
						
						switch(opcaoDoacaoPerecivel) {
						
						case 1:
							read.nextLine();
							tipo = "\nProdutos Farmac�uticos"; 
							System.out.println("\nInforme a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantidadePereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto perec�vel: ");
							nomeProduto = read.nextLine(); 
							read.nextLine();
							System.out.println("\nInsira a data de vencimento desse produto: ");
							datavencimento = read.nextLine(); 
							ProdutoPerecivel  pp = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp);
						break;
						
						case 2:
							read.nextLine();
							tipo = "Gr�os";
							System.out.println("\nInforme a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantidadePereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto perec�vel: ");
							nomeProduto = read.nextLine();
							read.nextLine();
							System.out.println("\nInsira a data de vencimento desse produto: ");
							datavencimento = read.nextLine();
							ProdutoPerecivel  pp1 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp1);
						break;
						
						case 3:
							read.nextLine();
							tipo = "Frutas";
							System.out.println("\nInforme a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantidadePereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto perec�vel: ");
							nomeProduto = read.nextLine();
							read.nextLine();
							System.out.println("\nInsira a data de vencimento desse produto: ");
							datavencimento = read.nextLine();
							ProdutoPerecivel  pp2 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp2);
						break;
						
						case 4:
							read.nextLine();
							tipo = "Carnes";
							System.out.println("\nInforme a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantidadePereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto perec�vel: ");
							nomeProduto = read.nextLine();
							read.nextLine();
							System.out.println("\nInsira a data de vencimento desse produto: ");
							datavencimento = read.nextLine();
							ProdutoPerecivel  pp3 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp3);
						break;	
						
						case 5:
							read.nextLine();
							tipo = "Outros";
							System.out.println("\nInforme a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantidadePereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto perec�vel: ");
							nomeProduto = read.nextLine();
							read.nextLine();
							System.out.println("\nInsira a data de vencimento desse produto: ");
							datavencimento = read.nextLine();
							ProdutoPerecivel  pp4 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp4);
							
						break;
						}
							
					break;
					
					case 2:
						read.nextLine();
						System.out.println("\nPor favor, digite o c�digo do "+(i+1)+" tipo de produto da doa��o "+dp.getId()+"-"+(i+1)+": ");
						System.out.println("\n\t1. Produto de Higiene;"
								+ "\n\t2. Produto Enlatado;"
								+ "\n\t3. Roupas;"
								+ "\n\t4. Uniforme;"
								+ "\n\t5. Outros;");
						try {
							opcaoDoacaoNaoPerecivel = read.nextInt();
						}catch(Exception erro){
							System.err.println("\nPor favor, execute o programa novamente e digite um n�mero de acordo com a lista de op��es.");
						}
						
						while(opcaoDoacao<1 || opcaoDoacao>5) {
							System.out.println("\nPor favor, digite uma op��o v�lida: ");
							opcaoDoacaoNaoPerecivel = read.nextInt();
						}
						
						switch(opcaoDoacaoNaoPerecivel) {
						
						case 1:
							read.nextLine();
							tipo = "Produto de Higiene";
							System.out.println("\nInforme a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantNaoPereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto n�o perec�vel: ");
							nomeProduto = read.nextLine();
							ProdutoNaoPerecivel  pnp = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp);
							read.nextLine();
							
						break;
						
						case 2:
							read.nextLine();
							tipo = "Produto Enlatado";
							System.out.println("\nInforme a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantNaoPereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto n�o perec�vel: ");
							nomeProduto = read.nextLine();
							ProdutoNaoPerecivel  pnp1 = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp1);
							read.nextLine();
							
						break;
						
						case 3:
							read.nextLine();
							tipo = "Roupas";
							System.out.println("\nInforme a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantNaoPereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto n�o perec�vel: ");
							nomeProduto = read.nextLine();
							ProdutoNaoPerecivel  pnp2 = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp2);
							read.nextLine();
						break;
						
						case 4:
							read.nextLine();
							tipo = "Uniforme";
							System.out.println("\nInforme a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantNaoPereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto n�o perec�vel: ");
							nomeProduto = read.nextLine();
							ProdutoNaoPerecivel  pnp3 = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp3);
							read.nextLine();
						break;	
						
						case 5:
							read.nextLine();
							tipo = "Outros";
							System.out.println("\nInforme a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
							quantNaoPereciveis = read.nextInt();
							read.nextLine();
							System.out.println("\nInsira o nome desse produto n�o perec�vel: ");
							nomeProduto = read.nextLine();
							ProdutoNaoPerecivel  pnp4 = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp4);
							read.nextLine();
						break;
						}
						
						
					break;
					}
					
				}
				doacoes.add(dp);
					
				System.out.printf("\nObrigado por adicionar a doa��o %d ",dp.getId());
			break;
	
			case 2:
				if(quantDoacoes < doacoes.size()){
					read.nextLine();
					Doacao d = doacoes.get(quantDoacoes++);
					System.out.printf("\nN�mero do pedido: %d",d.getId());
					System.out.println("\nDoador: " + d.getNomeDoador());
					System.out.println("\nInforme a ONG para qual voc� est� repassando a doa��o: ");
					entidade = read.nextLine();
					read.nextLine();
					System.out.println("\nProdutos doados na categoria de 'perec�veis': ");
					d.imprimirArrayPereciveis();
					read.nextLine();
					System.out.println("\nProdutos doados na categoria de 'n�o perec�veis': ");
					d.imprimirArrayNaoPereciveis();
					read.nextLine();
					repasses.add(new Repasse(entidade, d));
				} 
				else {
					System.out.printf("Infelizmente n�o h� doa��es dispon�veis...");
				}
				// Repassar doa��o;
			break;
			
			case 3:
				read.nextLine();
				System.out.println("\nEstoque de Produtos: ");
				read.nextLine();
				System.out.println("\nProdutos perec�veis:");
				for(Doacao d: doacoes){
					for(ProdutoPerecivel p: d.getProdutosPereciveis()){
						System.out.println("\nTipo: " + p.getTipo() + " | " + p.getNome() + " | Vencimento: " + p.getDataVencimento());
					}
				}
				System.out.println("\n----------------------------------");

				System.out.println("\nProdutos n�o perec�veis:");
				for(Doacao d: doacoes){
					for(ProdutoNaoPerecivel p: d.getProdutosNaoPereciveis()){
						System.out.println("\nTipo: " + p.getTipo() + " | " + p.getNome());
					}
				}
				System.out.println("\n----------------------------------");
				
				System.out.println();
				// Visualizar Estoque;
			break;
			
			case 4:
				// Visualizar Doa��es Recebidas;
				read.nextLine();
				for(Doacao d: doacoes){
					System.out.println("\nDoador: " + d.getNomeDoador());
					System.out.println("\nId: " + d.getId());
					System.out.println("\nProdutos perec�veis: ");
					d.imprimirArrayPereciveis();
					System.out.println("\nProdutos n�o perec�veis: ");
					d.imprimirArrayNaoPereciveis();
					System.out.println("\n----------------------------------");
				}
			break;
			
			case 5:
				// Visualizar Doa��es Repassadas;
				read.nextLine();
				for(Repasse r: repasses){
					System.out.println("\nId da doa��o: " + r.getDoacao().getId());
					System.out.println("\nEntidade benefici�ria: " + r.getEntidade());
					System.out.println("\nProdutos perec�veis: ");
					r.getDoacao().imprimirArrayPereciveis();
					System.out.println("\nProdutos n�o perec�veis: ");
					r.getDoacao().imprimirArrayNaoPereciveis();
				}

			break;
			
			case 6:
				System.out.println("\n\t\tObrigado por utilizar nosso programa de repasse de doa��es!");
				sair=true;
			break;
			
			}
		}
	}

}
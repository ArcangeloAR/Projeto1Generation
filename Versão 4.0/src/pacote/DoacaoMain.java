package pacote;

import java.util.ArrayList;
import java.util.Scanner;


public class DoacaoMain {

	public static void main(String[] args) {
		
		int opcao;
		int qntdTiposProdutos=0;
		int opcaoDoacao;
		int opcaoDoacaoPerecivel;
		int opcaoDoacaoNaoPerecivel;
		int quantidadePereciveis;
		int id=1;
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
		
			System.out.println("Por favor, digite uma das opções abaixo: \n1. Adicionar doação recebida;\n2. Repassar doação\n3. Visualizar Estoque;\n4. Visualizar Doações Recebidas;\n5. Visualizar Doações Repassadas;\n6. Sair;");
			opcao = read.nextInt();
			
			while(opcao<1 || opcao>6) {
				System.out.println("Por favor, digite uma opção válida: ");
				opcao = read.nextInt();
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Por favor, digite a quantidade de tipos de produtos que serão inclusos: ");
				qntdTiposProdutos = read.nextInt(); 
				System.out.println("Agora, insira o nome do doador: ");
				read.nextLine();
				nomeDoador = read.nextLine();
				System.out.println(" -> " + nomeDoador);
				Doacao dp = new Doacao(nomeDoador, id++); 
			
				for(int i=0;i<qntdTiposProdutos;i++) {
					System.out.println("Por favor, digite o código da classificação do "+(i+1)+"º tipo de produto da doação "+dp.getId()+"-"+(i+1)+": ");
					System.out.println("1. Produto Perecível;\n2. Produto Não Perecível;"); //menu classificacao dos tipos produtos
					
					opcaoDoacao = read.nextInt();	
					
					while(opcaoDoacao<1 || opcaoDoacao>2) {
						System.out.println("Por favor, digite uma opção valida: ");
						opcaoDoacao = read.nextInt();
					}
					
					switch(opcaoDoacao) {
					case 1:
						System.out.println("Por favor, digite o código do "+(i+1)+"º tipo de produto da doação "+dp.getId()+"-"+(i+1)+": ");
						System.out.println("1. Produtos Farmacêuticos;\n2. Grãos;\n3. Frutas;\n4. Carnes;\n5. Outros;");
						opcaoDoacaoPerecivel = read.nextInt();
						
						while(opcaoDoacao<1 || opcaoDoacao>5) {
							System.out.println("Por favor, digite uma opção válida: "); 
							opcaoDoacaoPerecivel = read.nextInt();
						}
						
						switch(opcaoDoacaoPerecivel) {
						
						case 1:
							tipo = "Produtos Farmacêuticos"; 
							System.out.println("Informe a quantidade de produtos perecíveis de um mesmo tipo que serão inseridos: ");
							quantidadePereciveis = read.nextInt(); 
							System.out.println("Insira o nome desse produto perecível: ");
							nomeProduto = read.next(); 
							System.out.println("Insira a data de vencimento desse produto: ");
							datavencimento = read.next(); 
							ProdutoPerecivel  pp = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp);
						break;
						
						case 2:
							tipo = "Grãos";
							System.out.println("Informe a quantidade de produtos perecíveis de um mesmo tipo que serão inseridos: ");
							quantidadePereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto perecível: ");
							nomeProduto = read.next();
							System.out.println("Insira a data de vencimento desse produto: ");
							datavencimento = read.next();
							ProdutoPerecivel  pp1 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp1);
						break;
						
						case 3:
							tipo = "Frutas";
							System.out.println("Informe a quantidade de produtos perecíveis de um mesmo tipo que serão inseridos: ");
							quantidadePereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto perecível: ");
							nomeProduto = read.next();
							System.out.println("Insira a data de vencimento desse produto: ");
							datavencimento = read.next();
							ProdutoPerecivel  pp2 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp2);
						break;
						
						case 4:
							tipo = "Carnes";
							System.out.println("Informe a quantidade de produtos perecíveis de um mesmo tipo que serão inseridos: ");
							quantidadePereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto perecível: ");
							nomeProduto = read.next();
							System.out.println("Insira a data de vencimento desse produto: ");
							datavencimento = read.next();
							ProdutoPerecivel  pp3 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp3);
						break;	
						
						case 5:
							tipo = "Outros";
							System.out.println("Informe a quantidade de produtos perecíveis de um mesmo tipo que serão inseridos: ");
							quantidadePereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto perecível: ");
							nomeProduto = read.next();
							System.out.println("Insira a data de vencimento desse produto: ");
							datavencimento = read.next();
							ProdutoPerecivel  pp4 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
							dp.insereProdutoPerecivel(pp4);
							
						break;
						}
							
					break;
					
					case 2:
						
						System.out.println("Por favor, digite o código do "+(i+1)+" tipo de produto da doação "+dp.getId()+"-"+(i+1)+": ");
						System.out.println("1. Produto de Higiene;\n2. Produto Enlatado;\n3. Roupas;\n4. Uniforme;\n5. Outros;");
						opcaoDoacaoNaoPerecivel = read.nextInt();
						
						while(opcaoDoacao<1 || opcaoDoacao>5) {
							System.out.println("Por favor, digite uma opção válida: ");
							opcaoDoacaoNaoPerecivel = read.nextInt();
						}
						
						switch(opcaoDoacaoNaoPerecivel) {
						
						case 1:
							tipo = "Produto de Higiene";
							System.out.println("Informe a quantidade de produtos não perecíveis de um mesmo tipo que serão inseridos: ");
							quantNaoPereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto não perecível: ");
							nomeProduto = read.next();
							ProdutoNaoPerecivel  pnp = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp);
							read.nextLine();
							
						break;
						
						case 2:
							tipo = "Produto Enlatado";
							System.out.println("Informe a quantidade de produtos não perecíveis de um mesmo tipo que serão inseridos: ");
							quantNaoPereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto não perecível: ");
							nomeProduto = read.next();
							ProdutoNaoPerecivel  pnp1 = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp1);
							read.nextLine();
							
						break;
						
						case 3:
							tipo = "Roupas";
							System.out.println("Informe a quantidade de produtos não perecíveis de um mesmo tipo que serão inseridos: ");
							quantNaoPereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto não perecível: ");
							nomeProduto = read.next();
							ProdutoNaoPerecivel  pnp2 = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp2);
							read.nextLine();
						break;
						
						case 4:
							tipo = "Uniforme";
							System.out.println("Informe a quantidade de produtos não perecíveis de um mesmo tipo que serão inseridos: ");
							quantNaoPereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto não perecível: ");
							nomeProduto = read.next();
							ProdutoNaoPerecivel  pnp3 = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp3);
							read.nextLine();
						break;	
						
						case 5:
							tipo = "Outros";
							System.out.println("Informe a quantidade de produtos não perecíveis de um mesmo tipo que serão inseridos: ");
							quantNaoPereciveis = read.nextInt();
							System.out.println("Insira o nome desse produto não perecível: ");
							nomeProduto = read.next();
							ProdutoNaoPerecivel  pnp4 = new ProdutoNaoPerecivel(nomeProduto, quantNaoPereciveis, tipo);
							dp.insereProdutoNaoPerecivel(pnp4);
							read.nextLine();
						break;
						}
						
						
					break;
					}
					
				}
				doacoes.add(dp);
					
				System.out.printf("Obrigado por adicionar a doação %d\n",dp.getId());
			break;
	
			case 2:
				if(quantDoacoes < doacoes.size()){
					Doacao d = doacoes.get(quantDoacoes++);
					System.out.printf("Número do pedido: 000%d",d.getId());
					System.out.println("\nDoador: "+ d.getNomeDoador());
					System.out.println("\nInforme a ONG para qual você está repassando a doação: ");
					entidade = read.next();
					System.out.println("\nProdutos doados na categoria de 'perecíveis': ");
					d.imprimirArrayPereciveis();
					System.out.println("\nProdutos doados na categoria de 'não perecíveis': ");
					d.imprimirArrayNaoPereciveis();
					read.nextLine();
					repasses.add(new Repasse(entidade, d));
				} 
				else {
					System.out.printf("Infelizmente não há doações disponíveis...");
				}
				// Repassar doação;
			break;
			
			case 3:
				System.out.println("Estoque de Produtos: ");
				System.out.println("Produtos perecíveis:");
				for(Doacao d: doacoes){
					for(ProdutoPerecivel p: d.getProdutosPereciveis()){
						System.out.println("tipo: " + p.getTipo() + " | " + p.getNome() + " | vencimento: " + p.getDataVencimento());
					}
				}
				System.out.println("----------------------------------");

				System.out.println("Produtos não perecíveis:");
				for(Doacao d: doacoes){
					for(ProdutoNaoPerecivel p: d.getProdutosNaoPereciveis()){
						System.out.println("tipo: " + p.getTipo() + " | " + p.getNome());
					}
				}
				System.out.println("----------------------------------");
				
				System.out.println();
				// Visualizar Estoque;
			break;
			
			case 4:
				// Visualizar Doações Recebidas;
				for(Doacao d: doacoes){
					System.out.println("Doador: " + d.getNomeDoador());
					System.out.println("id: " + d.getId());
					System.out.println("Produtos perecíveis: ");
					d.imprimirArrayPereciveis();
					System.out.println("Produtos não perecíveis: ");
					d.imprimirArrayNaoPereciveis();
					System.out.println("----------------------------------");
				}
				System.out.println();
			break;
			
			case 5:
				// Visualizar Doações Repassadas;
				for(Repasse r: repasses){
					System.out.println("id da doação: " + r.getDoacao().getId());
					System.out.println("Entidade beneficiária: " + r.getEntidade());
					System.out.println("Produtos perecíveis: ");
					r.getDoacao().imprimirArrayPereciveis();
					System.out.println("Produtos não perecíveis: ");
					r.getDoacao().imprimirArrayNaoPereciveis();
				}
				System.out.println();
			break;
			
			case 6:
				System.out.println("Obrigado por utilizar nosso programa de repasse de doa��es");
				sair=true;
			break;
			
			}
		}
	}

}
package pacote;

import java.util.Scanner;

public class DoacaoMain {

	public static void main(String[] args) {
	
		int opcao;
		int qntdTiposProdutos=0;
		int opcaoDoacao;
		int opcaoDoacaoPerecivel;
		int opcaoDoacaoNaoPerecivel;
		int quantidadePereciveis;
		int id=0;
		int quantNaoPereciveis;
		int quantDoacoes = 0;
		boolean sair = false;
		String tipo;
		String nomeDoador;
		String nomeProduto;
		String datavencimento;
		String entidade;
		ArrayList <Doacao> doacoes = new ArrayList<Doacao>();
		
		Scanner read = new Scanner(System.in);
		
		while(sair==false) {
		
			System.out.println("Por favor, digite uma das op��es abaixo: \n1. Adicionar doa��o recebida;\n2. Repassar doa��o\n3. Visualizar Estoque;\n4. Visualizar Doa��es Recebidas;\n5. Visualizar Doa��es Repassadas;\n6. Sair;");
			opcao = read.nextInt();
			
			while(opcao<1 || opcao>6) {
				System.out.println("Por favor, digite uma op��o v�lida: ");
				opcao = read.nextInt();
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Por favor, digite a quantidade de tipos de produtos que ser�o inclusos: ");
				qntdTiposProdutos = read.nextInt(); 
				System.out.println("Agora, insira o nome do doador: ");
				nomeDoador = read.nextLine();
				Doacao dp = new Doacao(nomeDoador, id++); 
				
				
					for(int i=0;i<qntdTiposProdutos;i++) {
						System.out.println("Por favor, digite o c�digo da classifica��o do "+(i+1)+"� tipo de produto da doa��o "+dp.getId()+"-"+(i+1)+": ");
						System.out.println("1. Produto Perec�vel;\n2. Produto N�o Perec�vel;"); //menu classificacao dos tipos produtos
						
						opcaoDoacao = read.nextInt();	
						
						while(opcaoDoacao<1 || opcaoDoacao>2) {
							System.out.println("Por favor, digite uma op��o valida: ");
							opcaoDoacao = read.nextInt();
						}
						
						switch(opcaoDoacao) {
						case 1:
							System.out.println("Por favor, digite o c�digo do "+(i+1)+"� tipo de produto da doa��o "+dp.getId()+"-"+(i+1)+": ");
							System.out.println("1. Produtos Farmac�uticos;\n2. Gr�os;\n3. Frutas;\n4. Carnes;\n5. Outros;");
							opcaoDoacaoPerecivel = read.nextInt();
							
							while(opcaoDoacao<1 || opcaoDoacao>5) {
								System.out.println("Por favor, digite uma op��o v�lida: "); 
								opcaoDoacaoPerecivel = read.nextInt();
							}
							
							switch(opcaoDoacaoPerecivel) {
							
							case 1:
								tipo = "Produtos Farmac�uticos"; 
								System.out.println("Informe a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantidadePereciveis = read.nextInt(); 
								System.out.println("Insira o nome desse produto perec�vel: ");
								nomeProduto = read.next(); 
								System.out.println("Insira a data de vencimento desse produto: ");
								datavencimento = read.next(); 
								ProdutoPerecivel  pp = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoPerecivel(pp);
							break;
							
							case 2:
								tipo = "Gr�os";
								System.out.println("Informe a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantidadePereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto perec�vel: ");
								nomeProduto = read.next();
								System.out.println("Insira a data de vencimento desse produto: ");
								datavencimento = read.next();
								ProdutoPerecivel  pp1 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoPerecivel(pp1);
							break;
							
							case 3:
								tipo = "Frutas";
								System.out.println("Informe a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantidadePereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto perec�vel: ");
								nomeProduto = read.next();
								System.out.println("Insira a data de vencimento desse produto: ");
								datavencimento = read.next();
								ProdutoPerecivel  pp2 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoPerecivel(pp2);
							break;
							
							case 4:
								tipo = "Carnes";
								System.out.println("Informe a quantidade de produtos perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantidadePereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto perec�vel: ");
								nomeProduto = read.next();
								System.out.println("Insira a data de vencimento desse produto: ");
								datavencimento = read.next();
								ProdutoPerecivel  pp3 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoPercivel(pp3);
							break;	
							
							case 5:
								tipo = "Outros";
								System.out.println("Informe a quantidade de produtos perecíveis de um mesmo tipo que ser�o inseridos: ");
								quantidadePereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto perec�vel: ");
								nomeProduto = read.next();
								System.out.println("Insira a data de vencimento desse produto: ");
								datavencimento = read.next();
								ProdutoPerecivel  pp4 = new ProdutoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoPerecivel(pp4);
								
							break;
							}
								
						break;
						
						case 2:
							
							System.out.println("Por favor, digite o c�digo do "+(i+1)+"� tipo de produto da doa��o "+dp.getId()+"-"+(i+1)+": ");
							System.out.println("1. Produto de Higiene;\n2. Produto Enlatado;\n3. Roupas;\n4. Uniforme;\n5. Outros;");
							opcaoDoacaoNaoPerecivel = read.nextInt();
							
							while(opcaoDoacao<1 || opcaoDoacao>5) {
								System.out.println("Por favor, digite uma op��o v�lida: ");
								opcaoDoacaoNaoPerecivel = read.nextInt();
							}
							
							switch(opcaoDoacaoNaoPerecivel) {
							
							case 1:
								tipo = "Produto de Higiene";
								System.out.println("Informe a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantNaoPereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto n�o perec�vel: ");
								nomeProduto = read.next();
								ProdutoNaoPerecivel  pnp = new ProdutoNaoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoNaoPerecivel(pnp);
								read.nextLine();
								
							break;
							
							case 2:
								tipo = "Produto Enlatado";
								System.out.println("Informe a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantNaoPereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto n�o perec�vel: ");
								nomeProduto = read.next();
								ProdutoNaoPerecivel  pnp1 = new ProdutoNaoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoNaoPerecivel(pnp1);
								read.nextLine();
								
							break;
							
							case 3:
								tipo = "Roupas";
								System.out.println("Informe a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantNaoPereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto n�o perec�vel: ");
								nomeProduto = read.next();
								ProdutoNaoPerecivel  pnp2 = new ProdutoNaoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoNaoPerecivel(pnp2);
								read.nextLine();
							break;
							
							case 4:
								tipo = "Uniforme";
								System.out.println("Informe a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantNaoPereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto n�o perec�vel: ");
								nomeProduto = read.next();
								ProdutoNaoPerecivel  pnp3 = new ProdutoNaoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoNaoPerecivel(pnp3);
								read.nextLine();
							break;	
							
							case 5:
								tipo = "Outros";
								System.out.println("Informe a quantidade de produtos n�o perec�veis de um mesmo tipo que ser�o inseridos: ");
								quantNaoPereciveis = read.nextInt();
								System.out.println("Insira o nome desse produto n�o perec�vel: ");
								nomeProduto = read.next();
								ProdutoNaoPerecivel  pnp4 = new ProdutoNaoPerecivel(nomeProduto, quantidadePereciveis, datavencimento, tipo);
								dp.insereProdutoNaoPerecivel(pnp4);
								read.nextLine();
							break;
							}
							
							
						break;
						}
						
					} doacoes.add(dp);
					
				System.out.printf("Obrigado por adicionar a doa��o %d",dp.getId());
				
			break;
	
			case 2:
				if(quantDoacoes < doacoes.size());{
					Doacao d = doacoes.get(quantDoacoes++);
					System.out.printf("N�mero do pedido: 000%d",d.getId());
					System.out.println("Doador: "+ d.getNomeDoador());
					System.out.println("Informe a ONG para qual voc� est� repassando a doa��o: ");
					entidade = read.next();
					System.out.println("Produtos doados na categoria de 'Perec�veis': ");
					d.imprimirArrayPereciveis();
					System.out.println("Produtos doados na categoria de 'N�o Perec�veis': ");
					d.imprimirArrayNaoPereciveis();
					read.nextLine();
				} else {
					System.out.printf("Infelizmente n�o h� doa��es dispon�veis...");
				}
				
				
				
				// Repassar doação;
			break;
			
			case 3:
				System.out.printf("Estoque de Produtos:");
				
				// Visualizar Estoque;
			break;
			
			case 4:
				// Visualizar Doações Recebidas;;
			break;
			
			case 5:
				// Visualizar Doações Repassadas;
				
			break;
			
			case 6:
				System.out.println("Obrigado por utilizar nosso programa de repasse de doa��es");
				sair=true;
			break;
			
			}
		}
	}

}
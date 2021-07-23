import java.util.Scanner;

public class TP1 {
	public static void main (String[] args)  {
		
		int numClientes = 0, numProdutos = 0; //Quantidade de Clientes e produtos a serem cadastrados;
		int i, u = 0, n = 0, j = 0; //Variaveis usadas em laços;
		int opcao; //Opção do menu;
		int[] quantidade = new int[10]; //Dados dos produtos a serem cadastrados;
		int quantidadeVendida;
		
		String[] nome = new String[10], endereco = new String[10], telefone = new String[10], nomep = new String[10], descricao = new String[10], porcentagem = new String[10], valor = new String[10]; //Dados dos clientes e produtos a serem cadastrados; 
		String pesquisa, resposta; //Strings usadas para pesquisas e respostas ao longo do programa;
		String[] comprador = new String[10];//Registro de clientes que compraram;
		Scanner Leitor = new Scanner (System.in), Ler = new Scanner (System.in);
		
		
		while (true) {
			
			//Seleção de opções no menu;
			System.out.println ("Bem vindo ao menu, digite a opção a ser selecionada:\n1.Cadastro de novo cliente.\n2.Busca por cliente.\n3.Cadastro de novo produto.\n4.Busca por produto.\n5.Cadastro de venda.\n6.Mostrar produtos em estoque.\n7.Sair.");
			opcao = Leitor.nextInt();	
			
			if (opcao == 1) {
			
				//Leitura da quantidade de Clientes a serem cadastrados;
				System.out.println ("Digite a quantidade de clientes a serem cadastrados: ");
				numClientes = numClientes + Leitor.nextInt();
				
				//Leitura dos dados dos clientes a serem cadastrados;
				for (; u < numClientes; u ++) {
					
					System.out.println ("Digite o nome do cliente a ser cadastrado: ");
					nome[u] = Ler.nextLine();
					
					System.out.println ("Digite o endereço do cliente a ser cadastrado: ");
					endereco[u] = Ler.nextLine();
					
					System.out.println ("Digite o telefone do cliente a ser cadastrado: ");
					telefone[u] = Ler.nextLine();
					
					//Teste: System.out.println ("Nome: " + nome[u] + "\n" + "Endereço: " + endereco[u] + "\n" + "Telefone: " + telefone[u] + "\n");
					
				}
				
				System.out.println ("Clientes cadastrados com sucesso!\nVoltando ao menu...\n");
				try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			
			}
			else if (opcao == 2) {
				
				if (numClientes == 0) {
					
					System.out.println ("Ainda não foi cadastrado nenhum cliente!\nVoltando ao menu...\n");
					try { Thread.sleep (1500); } catch (InterruptedException ex) {}
				
					continue;
					
				}
				
				//Lista de clientes;
				System.out.println ("Lista de clientes:");
				for (i = 0; i < numClientes; i ++) System.out.println ("-" + nome[i]);
			
				//Nome a ser buscado;
				System.out.println ("Digite o nome do cliente: ");
				pesquisa = Ler.nextLine();
				
				//Busca por cliente;
				for (i = 0; i < numClientes; i ++) 	if (nome[i].equals(pesquisa)) break;
				
				//Alteração de dados;
				if (i == numClientes) {System.out.println ("Cliente não encontrado!\nVoltando ao menu...\n"); try { Thread.sleep (1500); } catch (InterruptedException ex) {}}
				else {
					
					System.out.println ("O cliente foi encontrado, veja aqui os seus dados..." + "\n" + "Nome: " + nome[i] + "\n" + "Endereço: " + endereco[i] + "\n" + "Telefone: " + telefone[i] + "\n" + "Você deseja alterar algum dado? (Responda " + "sim" + " ou " + "não" + ")");
					resposta = Ler.nextLine();
					
					if (resposta.equals("sim")) {
						
						System.out.println ("O que você gostaria de alterar? (responda " + "nome" + " ou " + "endereço" + " ou " + "telefone" + ")");
						resposta = Ler.nextLine();
						
						if (resposta.equals("nome")) {
						
						System.out.println ("Digite o novo nome do cliente a ser cadastrado: ");
						nome[i] = Ler.nextLine();
						
						}
						else if (resposta.equals("endereço")) {
						
						System.out.println ("Digite o novo endereço do cliente a ser cadastrado: ");
						endereco[i] = Ler.nextLine();
						
						}
						else if (resposta.equals("telefone")) {
						
						System.out.println ("Digite o novo telefone do cliente a ser cadastrado: ");
						telefone[i] = Ler.nextLine();
						
						}
						else {
							
							System.out.println ("Opção não encontrada!\nVoltando ao menu...\n");
							try { Thread.sleep (1500); } catch (InterruptedException ex) {}
							
							continue;
							
						}
						
						System.out.println ("Alterações foram feitas com sucesso:" + "\n" + "Nome: " + nome[i] + "\n" + "Endereço: " + endereco[i] + "\n" + "Telefone: " + telefone[i] + "\nVoltando ao menu...\n");
						try { Thread.sleep (1500); } catch (InterruptedException ex) {}
						
					}
					else if (resposta.equals("não")) {System.out.println ("Ok :)\nVoltando ao menu...\n"); try { Thread.sleep (1500); } catch (InterruptedException ex) {}}
					else {System.out.println ("Opção não encontrada!\nVoltando ao menu...\n");  try { Thread.sleep (1500); } catch (InterruptedException ex) {}}
					
				}
				
			}
			else if (opcao == 3) {
				
				//Leitura da quantidade de Produtos a serem cadastrados;
				System.out.println ("Digite a quantidade de produtos a serem cadastrados: ");
				numProdutos = numProdutos + Leitor.nextInt();
				
				//Leitura dos dados dos produtos a serem cadastrados;
				for (; n < numProdutos; n ++) {
					
					System.out.println ("Digite o nome do produto a ser cadastrado: ");
					nomep[n] = Ler.nextLine();
					
					System.out.println ("Digite a descrição do produto a ser cadastrado: ");
					descricao[n] = Ler.nextLine();
					
					System.out.println ("Digite o valor de compra do produto a ser cadastrado: ");
					valor[n] = Ler.nextLine();
					
					System.out.println ("Digite a porcentagem de lucro do produto a ser cadastrado: ");
					porcentagem[n] = Ler.nextLine();
					
					System.out.println ("Digite a quantidade em estoque do produto a ser cadastrado: ");
					quantidade[n] = Leitor.nextInt();
					
					//Teste: System.out.println ("Nome: " + nomep[n] + "\n" + "Descrição: " + descricao[n] + "\n" + "Valor de compra: " + valor[n] + "\n" + "Porcentagem de lucro: " + porcentagem[n] + "\n" + "Quantidade em estoque: " + quantidade[n] + "\n");
					
				}
				
				System.out.println ("Produtos cadastrados com sucesso!\nVoltando ao menu...\n");
				try { Thread.sleep (1500); } catch (InterruptedException ex) {}
				
			}
			else if (opcao == 4) {
				
				if (numProdutos == 0) {
					
					System.out.println ("Ainda não foi cadastrado nenhum produto!\nVoltando ao menu...\n");
					try { Thread.sleep (1500); } catch (InterruptedException ex) {}
				
					continue;
					
				}
				
				//Lista de produtos;
				System.out.println ("Lista de produtos:");
				for (i = 0; i < numProdutos; i ++) System.out.println ("-" + nomep[i]);
			
				//produto a ser buscado;
				System.out.println ("Digite o nome do produto: ");
				pesquisa = Ler.nextLine();
				
				//Busca por produto;
				for (i = 0; i < numProdutos; i ++) 	if (nomep[i].equals(pesquisa)) break;
				
				//Alteração de dados;
				if (i == numProdutos) {System.out.println ("Produto não encontrado!\nVoltando ao menu...\n"); try { Thread.sleep (1500); } catch (InterruptedException ex) {}}
				else {
					
					System.out.println ("O produto foi encontrado, veja aqui os seus dados..." + "\n" + "Nome: " + nomep[i] + "\n" + "Descrição: " + descricao[i] + "\n" + "Valor de compra: " + valor[i] + "\n" + "Porcentagem de lucro: " + porcentagem[i] + "\n" + "Quantidade em estoque: " + quantidade[i] + "\n" + "Você deseja alterar algum dado? (Responda " + "sim" + " ou " + "não" + ")");
					resposta = Ler.nextLine();
					
					if (resposta.equals("sim")) {
						
							System.out.println ("O que você gostaria de alterar? (responda " + "nome" + " ou " + "descrição" + " ou " + "valor" + " ou " + "porcentagem" + " ou " + "quantidade" + ")");
							resposta = Ler.nextLine();
						
						if (resposta.equals("nome")) {
						
							System.out.println ("Digite o novo nome do produto a ser cadastrado: ");
							nomep[i] = Ler.nextLine();
						
						}
						else if (resposta.equals("descrição")) {
						
							System.out.println ("Digite a nova descrição do produto a ser cadastrado: ");
							descricao[i] = Ler.nextLine();
						
						}
						else if (resposta.equals("valor")) {
						
							System.out.println ("Digite o novo valor de compra do produto a ser cadastrado: ");
							valor[i] = Ler.nextLine();
							
						}
						else if (resposta.equals("porcentagem")) {
							
							System.out.println ("Digite a nova porcentagem de lucro do produto a ser cadastrado: ");
							porcentagem[i] = Ler.nextLine();
							
						}
						else if (resposta.equals("quantidade")) {
							
							System.out.println ("Digite a nova quantidade em estoque do produto a ser cadastrado: ");
							quantidade[i] = Leitor.nextInt();
							
						}
						else {
							
							System.out.println ("Opção não encontrada!\nVoltando ao menu...\n");
							try { Thread.sleep (1500); } catch (InterruptedException ex) {}
							
							continue;
							
						}
						
						System.out.println ("Alterações foram feitas com sucesso:" + "\n" + "Nome: " + nomep[i] + "\n" + "Descrição: " + descricao[i] + "\n" + "Valor de compra: " + valor[i] + "\n" + "Porcentagem de lucro: " + porcentagem[i] + "\n" + "Quantidade em estoque: " + quantidade[i] + "\n" + "\nVoltando ao menu...\n");
						try { Thread.sleep (1500); } catch (InterruptedException ex) {}
						
					}
					else if (resposta.equals("não")) {System.out.println ("Ok :)\nVoltando ao menu...\n"); try { Thread.sleep (1500); } catch (InterruptedException ex) {}}
					else {System.out.println ("Opção não encontrada!\nVoltando ao menu...\n");  try { Thread.sleep (1500); } catch (InterruptedException ex) {}}
					
				}
				
			}
			else if (opcao == 5) {
				
			if (numProdutos == 0 || numClientes == 0) {
				
				System.out.println ("Ainda não foi cadastrado nenhum produto ou cliente!\nVoltando ao menu...\n");
				try { Thread.sleep (1500); } catch (InterruptedException ex) {}
			
				continue;
				
			}
			
				//Lista de clientes;
				System.out.println ("Lista de clientes:");
				for (i = 0; i < numClientes; i ++) System.out.println ("-" + nome[i]);
				
				//Nome a ser escolhido;
				System.out.println ("Digite o nome do cliente a ser escolhido: ");
				comprador[j] = Ler.nextLine();
				j ++;
				
				while (true) {
				
					//Lista de produtos;
					System.out.println ("Lista de produtos:");
					for (i = 0; i < numProdutos; i ++) System.out.println ("-" + nomep[i]);
					
					//Produto a ser escolhido;
					System.out.println ("Digite o nome do produto a ser escolhido: ");
					pesquisa = Ler.nextLine();
					
					//Busca por produto;
					for (i = 0; i < numProdutos; i ++) 	if (nomep[i].equals(pesquisa)) break;
					
					if (i == numProdutos) {
						
					System.out.println ("Esse produto não foi encontrado, deseja selecionar outro?" + "(Responda " + "sim" + " ou " + "não" + ")");
					resposta = Ler.nextLine();
					quantidade[i] = 0;
					
					if (resposta.equals("sim")) continue;
					else break;
					
					}
					
					if (quantidade[i] <= 0) {
						
						System.out.println ("Esse produto não tem mais no estoque, deseja selecionar outro?" + "(Responda " + "sim" + " ou " + "não" + ")");
						resposta = Ler.nextLine();
						quantidade[i] = 0;
						
						if (resposta.equals("sim")) continue;
						else break;
						
					}
					
					//Quantidade do produto que foi vendida;
					System.out.println ("Digite a quantidade do produto que foi vendida para o cliente: ");
					quantidadeVendida = Leitor.nextInt();
					
					if (quantidadeVendida > quantidade[i]) {
						
						System.out.println ("Quantidade indisponível no estoque, estoque atual: " + quantidade[i]);
						
						System.out.println ("Deseja selecionar outro produto ou o mesmo?" + "(Responda " + "sim" + " ou " + "não" + ")");
						resposta = Ler.nextLine();
						
						if (resposta.equals("sim")) continue;
						else break;
						
					}
					
					quantidade[i] = quantidade[i] - quantidadeVendida;
					
					System.out.println ("Quantidade restante no estoque: " + quantidade[i]);
					
					System.out.println ("Você deseja cadastrar outra venda? (Responda " + "sim" + " ou " + "não" + ")");
					resposta = Ler.nextLine();
					
					if (resposta.equals("não")) break;
					
				}
				
				System.out.println ("Voltando ao menu...\n");
				try { Thread.sleep (1500); } catch (InterruptedException ex) {}
				
			}
			else if (opcao == 6) {
				
				System.out.println ("Lista de produtos com a quantidade em estoque de cada:");
				for (i = 0; i < numProdutos; i ++) System.out.println ("-" + nomep[i] + " -" + quantidade[i] + " unidades");
				System.out.println ("\n");
				
			}
			else if (opcao == 7) {System.out.println ("Volte mais vezes, obrigado!"); break;} //Sair do programa;
		
		}
		
	}
}

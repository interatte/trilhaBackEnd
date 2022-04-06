import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.Categoria;
import entity.Lancamento;
import entity.Produto;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Categoria categoria = new Categoria();
		categoria.setId(1l);
		categoria.setName("Maria Augusta");
		categoria.setDescription("Salário");
		System.out.println("--- C A T E G O R I A --- ");
		System.out.println("ID: " + categoria.getId());
		System.out.println("Name: " + categoria.getName());
		System.out.println("Description: " + categoria.getDescription() + "\n");

		/*
		 * Produto produto = new Produto(); produto.setId(2l);
		 * produto.setName("Hp Pavilion 5020"); produto.setDescription("Notebook");
		 * produto.setPrice(5000.00); System.out.println("ID: " + produto.getId());
		 * System.out.println("Nome do Produto: " + produto.getName());
		 * System.out.priadintln("Descrição do Produto: " + produto.getDescription());
		 * System.out.printf("Preço do Protuto : $ " + "%.2f",produto.getPrice());
		 * System.out.println("\n");
		 */

		Lancamento lancamento = new Lancamento();
		lancamento.setId(3l);
		lancamento.setName("Salário ma Empresa Interatte");
		lancamento.setDescription("Adiantamento Quinzenal");
		lancamento.setType("revenue");
		lancamento.setAmount("4000.00");
		lancamento.setDate("05/09/1978");
		lancamento.setPayd(true);
		lancamento.setCategoryid(4l);
		System.out.println("--- L A N C A M E N T O --- ");
		System.out.println("ID: " + lancamento.getId());
		System.out.println("Name: " + lancamento.getName());
		System.out.println("Descrption: " + lancamento.getDescription());
		System.out.printf("Amount : " + lancamento.getAmount() + "\n");
		System.out.println("Type: " + lancamento.getType());
		System.out.println("date: " + lancamento.getDate());
		System.out.println("Payd: " + lancamento.getPayd());
		System.out.printf("CategoryID : " + lancamento.getCategoryid() + "\n");
		System.out.println("\n");
		System.out.println("--- L I S T A  D E  P R O D U T O S  --- ");

		Scanner dados = new Scanner(System.in);
		Scanner dados1 = new Scanner(System.in);
		Scanner dados2 = new Scanner(System.in);
		Scanner dados3 = new Scanner(System.in);
		ProdutoController produtoController = new ProdutoController();
		Produto c1 = new Produto();

		String id = "";
		String name = "";
		String description = "";
		double price ;
	

		System.out.println("Opçoes\n 1-Cadastrar produto\n 2-Remover produto\n 3-Verificar produto\n 4-Dinheiro\n");
		int numopc = 0;

		System.out.print("nº: ");

		numopc = dados.nextInt();

		while (numopc == 1) {

			switch (numopc) {

			case 1:
				System.out.println("Id do produto: ");
				id = dados1.nextLine();
				c1.setId(id);

				System.out.println("Nome do produto: ");
				name = dados2.nextLine();
				c1.setName(name);

				System.out.println("Descriçao do produto: ");
				description = dados3.nextLine();
				c1.setDescription(description);

				System.out.println("Preço do produto: ");
				price = dados.nextDouble();
				c1.setPrice(price);

				System.out.println("\n Cadastrar mais produtos?\n  1-Sim\n  0-Não\n");
				numopc = dados.nextInt();

				produtoController.adicionar(c1);
				c1 = new Produto();
				break;

			case 2:
				break;

			}
		}
		produtoController.listaProdutos();
		
		List<Produto> produtos = produtoController.getPoduto();
		List<Produto> maioresNumeros = new ArrayList<Produto>();
		double numeroMaior = 0D;
		int cont = 1;
		int posicaoMaior =0;
		
		while (cont <=3 ) {
			int i = 0;
			int j = produtos.size();
			Produto produto = new Produto();
			
			for (Produto p: produtos) {
				
				double numero = p.getPrice();
				
				if (numero > numeroMaior) {
					numeroMaior = numero;
					produto = p;
					posicaoMaior = produtos.indexOf(p);
					
				}
				if (j > i) {
					i++;
					
			
				}
			}
			
			maioresNumeros.add(produto);
			produtos.remove(posicaoMaior);
			numeroMaior = 0;
			produto = null;
			posicaoMaior = 0;
			
			cont++;
		}
		produtoController.lista3maisCaros(maioresNumeros);
		
			
		
	
	}
	
	

	
}
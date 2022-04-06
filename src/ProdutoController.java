import java.util.ArrayList;
import java.util.List;


import entity.Produto;



public class ProdutoController {
	
List<Produto> produtos = new ArrayList<>();

public void adicionar(Produto cp) {
    produtos.add(cp);
}


public void listaProdutos() {
    produtos.forEach((p) -> {
        System.out.println("Id: " + p.getId());
        System.out.println("Nome: " + p.getName());
        System.out.println("Description: " + p.getDescription());
        System.out.println("Preço: " + p.getPrice());
        System.out.println("-----------------------------");
    });
    System.out.println("-----------Com 10.00 a mais---------");
    produtos.forEach((p) -> {
        System.out.println("Id: " + p.getId());
        System.out.println("Nome: " + p.getName());
        System.out.println("Description: " + p.getDescription());
        System.out.println("Preço: " + (p.getPrice() + 10.00));
        System.out.println("-----------------------------");
    });
    
    
}

public void lista3maisCaros(List<Produto> maisCaros) {
	for (Produto p: maisCaros) {
        System.out.println("Id: " + p.getId());
        System.out.println("Nome: " + p.getName());
        System.out.println("Description: " + p.getDescription());
        System.out.println("Preço: " + p.getPrice() + 10.00);
        System.out.println("---------Os 3 Produtos mais caros!-----");
	}
	
}
public List<Produto> getPoduto() {
	return produtos;
	
}
}
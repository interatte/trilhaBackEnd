package trilha.back.financys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trilha.back.financys.entities.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {


	private List<Categoria> lista = new ArrayList<Categoria>();

	@PostMapping
	public int create(@RequestBody Categoria categoria) {
		lista.add(categoria);
		return lista.lastIndexOf(categoria);
	}

	@GetMapping
	public List<Categoria> read() {

		return lista;
	}

}

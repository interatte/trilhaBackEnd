package trilha.back.financys.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trilha.back.financys.FinancysApplication;
import trilha.back.financys.entities.Lancamento;

@RestController
@RequestMapping("/lancamentos")
public class LancamentosController {

	private List<Lancamento> lista = new ArrayList<Lancamento>();

	@PostMapping
	public int create(@RequestBody Lancamento lancamento) {
		lista.add(lancamento);
		return lista.lastIndexOf(lancamento);
	}

	@GetMapping
	public List<Lancamento> read() {
		Collections.sort(lista);
		return lista;
	}

}

package trilha.back.financys;

import nonapi.io.github.classgraph.json.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinancysApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FinancysApplication.class);

	public static void main(String[] args) {
		LOGGER.info("iniciando Api Financys");
		SpringApplication.run(FinancysApplication.class, args);
		LOGGER.info("Äpi de Financys iniciada com Sucesso!");

	}


}

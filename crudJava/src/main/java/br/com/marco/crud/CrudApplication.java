package br.com.soften.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {
	//? Faltou os Repository, Service do ItemSale e da Sale, e o Controller da Sale

	// Recomendo o uso do plugin Better Comments
	// Comentários simples são questões a melhorar
	// Comentários com * são dicas Ex: //* Dica
	// Comentários com ? são dúvidas Ex: //? Dúvida
	// Comentários com ! são erros Ex: //! Erro
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}

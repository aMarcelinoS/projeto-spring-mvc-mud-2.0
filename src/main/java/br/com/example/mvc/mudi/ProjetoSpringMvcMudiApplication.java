package br.com.example.mvc.mudi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ProjetoSpringMvcMudiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringMvcMudiApplication.class, args);
		
		
	}
}

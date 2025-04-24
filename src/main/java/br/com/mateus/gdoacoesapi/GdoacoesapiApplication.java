package br.com.mateus.gdoacoesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:env/local.properties")
public class GdoacoesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdoacoesapiApplication.class, args);
	}

}

package br.com.wmomodas.wmomodas;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan("br.com.wmomdas.persistence")//to scan repository files
@EntityScan("br.com.wmomodas")
@EnableJpaRepositories("br.com.wmomodas.persistence")
public class WmomodasApplication {

	public static void main(String[] args) {
		SpringApplication.run(WmomodasApplication.class, args);
	}


}
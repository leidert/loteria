package com.tanos.loteria;

import com.tanos.loteria.repository.SorteoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Configuration
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = SorteoRepository.class)
public class LoteriaApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(LoteriaApplication.class, args);
	}

}

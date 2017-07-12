package com.prasanth;

import com.prasanth.entity.Account;
import com.prasanth.entity.Bookmark;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
public class RestfulApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestfulApplication.class, args);
	}
}

package com.example.samplepncapp;

import com.example.samplepncapp.domain.Person;
import com.example.samplepncapp.repository.PersonRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SamplePncAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplePncAppApplication.class, args);
	}


	@Bean
	ApplicationRunner run (PersonRepository pr){
		return args -> {
			Stream.of("Bob","Tom","Erik","Evan","Sameer").forEach(
					x -> pr.save(new Person(null,x))
			);
		};
	}

}


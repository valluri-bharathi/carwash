package com.carwash.springbootmongodbsecurity;
import com.carwash.springbootmongodbsecurity.domain.Role;
import com.carwash.springbootmongodbsecurity.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMongodbSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbSecurityApplication.class, args);
	}
	@Bean
	CommandLineRunner init(RoleRepository roleRepository) {

	    return args -> {

	        Role adminRole = roleRepository.findByRole("ADMIN");
	        if (adminRole == null) {
	            Role newAdminRole = new Role();
	            newAdminRole.setRole("ADMIN");
	            roleRepository.save(newAdminRole);
	        }

	        Role userRole = roleRepository.findByRole("USER");
	        if (userRole == null) {
	            Role newUserRole = new Role();
	            newUserRole.setRole("USER");
	            roleRepository.save(newUserRole);
	        }
	    };

	}

}

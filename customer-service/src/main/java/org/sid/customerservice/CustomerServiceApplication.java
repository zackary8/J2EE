package org.sid.customerservice;
import  org.sid.customerservice.Repository.CustomerRepository;
import org.sid.customerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean

CommandLineRunner start(CustomerRepository customerRepository , RepositoryRestConfiguration restConfiguration)
{
	restConfiguration.exposeIdsFor(Customer.class);
	return  args ->{
		customerRepository.save(new Customer(null,"zakaria","zakarianajib@gmail.com"));
		customerRepository.save(new Customer(null,"yousef","ysf@gmail.com"));
		customerRepository.save(new Customer(null,"radi","radi@gmail.com"));
	customerRepository.findAll().forEach(c->{
		System.out.println(c.toString());
	});
	};
}}

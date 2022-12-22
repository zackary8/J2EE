package org.sid.inventoryservice;

import lombok.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository , RepositoryRestConfiguration restConfiguration) {
	restConfiguration.exposeIdsFor(Product.class);
		return  args -> {
		productRepository.save(new Product(null,"Ordinateur",788,12));
		productRepository.save(new Product(null,"Iphone",7788,12));
		productRepository.save(new Product(null,"pc portable",808,12));
		productRepository.save(new Product(null,"tablet",88,12));
		productRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});
	};
	}
}
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
class Product{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private  String name;
	private  double price;
	private  double quatity;}
@RepositoryRestResource
interface ProductRepository extends JpaRepository<Product, Long>{}



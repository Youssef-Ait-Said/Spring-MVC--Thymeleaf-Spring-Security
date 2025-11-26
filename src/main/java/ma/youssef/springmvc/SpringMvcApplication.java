package ma.youssef.springmvc;

import ma.youssef.springmvc.entities.Product;
import ma.youssef.springmvc.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
          productRepository.save(Product.builder()
                        .name("PC")
                        .price(2500)
                        .quantity(12)
                  .build());
          productRepository.save(Product.builder()
                        .name("TV")
                        .price(3400)
                        .quantity(15)
                  .build());
          productRepository.save(Product.builder()
                        .name("Phone")
                        .price(1500)
                        .quantity(2)
                  .build());

          productRepository.findAll().forEach(p->{
              System.out.println(p.toString());
          });
        };
    }
}

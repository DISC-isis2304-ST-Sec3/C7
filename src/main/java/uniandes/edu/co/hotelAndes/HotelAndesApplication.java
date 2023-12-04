package uniandes.edu.co.hotelAndes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class HotelAndesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelAndesApplication.class, args);
	}

}

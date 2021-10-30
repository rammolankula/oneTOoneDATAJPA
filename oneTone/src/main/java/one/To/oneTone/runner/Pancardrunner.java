package one.To.oneTone.runner;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import one.To.oneTone.domain.Pancard;
import one.To.oneTone.repository.Pancardrepository;
@Component
public class Pancardrunner implements CommandLineRunner {
	
	@Autowired
	Pancardrepository panrepo;

	@Override
	public void run(String... args) throws Exception {

		/*saving the data in child class*/
		 panrepo.save(new Pancard(1000,"Ram","Molankula",new Date(System.currentTimeMillis())));
		 panrepo.save(new Pancard(2000,"Ganesh","molankula",new Date(System.currentTimeMillis())));
		 panrepo.save(new Pancard(3000,"Shyam","molankula",new Date(System.currentTimeMillis())));
		 panrepo.save(new Pancard(4000,"dad","molankula",new Date(System.currentTimeMillis())));
		
	}
}

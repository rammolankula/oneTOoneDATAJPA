package one.To.oneTone.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import one.To.oneTone.domain.Person;
import one.To.oneTone.repository.Pancardrepository;
import one.To.oneTone.repository.Personrepository;
@Component
public class Personrunner implements CommandLineRunner {

	@Autowired
	Pancardrepository panrepo;
	
	@Autowired
	Personrepository personrepo;
	
	@Override
	public void run(String... args) throws Exception {
	
	/*Setting person p1 for OnePanCard*/
		
	Person p1=new Person();
	p1.setPersonId(1);
	p1.setPersonName("Ram");
	p1.setGender("male");
	p1.setPersonAddress("Hyd");
	p1.setPandata(panrepo.findByPanId(1000));
	personrepo.save(p1);
	
	/*Setting person p2  for OnePanCard*/
	
	Person p2=new Person();
	
	p2.setGender("male");
	p2.setPersonAddress("ckd");
	p2.setPersonId(2);
	p2.setPersonName("Ram");
	p2.setPandata(panrepo.findByPanId(4000));
	personrepo.save(p2);

		
	}
	

}

package sn.uidt.cisse410;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.uidt.cisse410.model.Welcome;
import sn.uidt.cisse410.service.BusinessService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	BusinessService bs;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Welcome welcome = bs.getWelcome();
		System.out.println(welcome);
	}

}

package guru.springframework.nickdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.nickdi.controllers.MyController;

@SpringBootApplication
public class NickDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(NickDiApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		String greeting = myController.sayHello();
		
		System.out.println(greeting);
	}

}

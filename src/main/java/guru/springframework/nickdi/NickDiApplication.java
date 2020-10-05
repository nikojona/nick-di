package guru.springframework.nickdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.nickdi.controllers.ConstructorInjectedController;
import guru.springframework.nickdi.controllers.I18NController;
import guru.springframework.nickdi.controllers.MyController;
import guru.springframework.nickdi.controllers.PetController;
import guru.springframework.nickdi.controllers.PropertyInjectedController;
import guru.springframework.nickdi.controllers.SetterInjectedController;

@SpringBootApplication
public class NickDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(NickDiApplication.class, args);
		
		System.out.println("------------------------ Pet Controller:");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.wichPetIsTheBest());
		
		System.out.println("------------------------ i18n Language:");
		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());

		System.out.println("------------------------ No Bean:");
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		
		System.out.println("------------------------ Primary Bean:");
		System.out.println(myController.sayHelloWithBean());
		
		System.out.println("------------------------ Property:");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("------------------------ Setter:");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("------------------------ Constructor:");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}

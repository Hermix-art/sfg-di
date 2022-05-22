package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SfgDiApplication.class, args); // spring creates context, basing on objects annotated, conf. files etc.
		MyController myController = (MyController) con.getBean("myController"); // hey, spring, give me a controller bean from your context

		String methodResult = myController.sayHello();
		System.out.println(methodResult);
	}

}

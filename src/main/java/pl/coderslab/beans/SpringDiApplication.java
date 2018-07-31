package pl.coderslab.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class)) {

			Auto1 auto1 = context.getBean(Auto1.class);
			System.out.println(auto1.getAuto2().getClass().getName());
		}

	}
}

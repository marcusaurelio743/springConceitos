package arquiteturaspring;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ArquiteturaApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(ArquiteturaApplication.class, args);*/
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaApplication.class);
		builder.bannerMode(Mode.OFF);
		
		ConfigurableApplicationContext context = builder.context();
		//var produto = context.getBean("produtoRepository");
		builder.profiles("producao");
		builder.properties("spring.datasource.url");
		builder.run(args);
		
		
		
	}

}

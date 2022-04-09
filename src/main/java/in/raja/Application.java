package in.raja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.PayloadApplicationEvent;

import in.raja.beans.PayslipGenrator;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(Application.class, args);
		System.out.println("rajasekhar");
		PayslipGenrator ps=con.getBean(PayslipGenrator.class);
		ps.start();
	}

}

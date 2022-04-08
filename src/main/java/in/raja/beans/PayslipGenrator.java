package in.raja.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayslipGenrator {
	
	private Printer pr;
	
	 //in constructor injection @Autowired is not mandotory its optional only
	public PayslipGenrator(Printer pr) {
		System.out.println("------ payslip genrator constructor-------");
		this.pr=pr;
	}
	
	public void start() {
		pr.print();
	}

}

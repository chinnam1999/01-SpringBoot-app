package in.raja.beans;

import org.springframework.stereotype.Component;

@Component
public class Printer {

	public Printer() {
		System.out.println("----- printer constructor ------");
	}
	
	public void print() {
		System.out.println(" Pay slip generator ");
	}

}

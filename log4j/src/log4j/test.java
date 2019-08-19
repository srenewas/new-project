package log4j;

import org.apache.log4j.Logger;

public class test {
	final static Logger logger = Logger.getLogger(test.class);
	
	public void m1() {
		System.out.println("m1 method excution successfully");
	}
	public static void main(String[] args) {
		test t = new test();
		t.m1();
		logger.info("excution successfully");
		logger.info("m1 method status"+t.toString());
	}
	@Override
	public String toString() {
		return "test [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

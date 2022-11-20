import java.io.IOException;
import java.sql.SQLException;

public class Multiple_Exception {
	
	void m1() throws ArithmeticException { //dev 1
		
        try {
            throw new ArithmeticException("Condition is not accepted");
		} 
        catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("method 1 is created");
	}
	void m2() throws IOException{ //dev 2
		System.out.println("method 2 is created");
	}
	void m3() throws SQLException,IOException,ArithmeticException {//dev 3

		System.out.println("method 3 is created");
		throw new SQLException("Condition is not accepted");
	}
	public static void main(String[] args) throws Exception {
		
		Multiple_Exception obj=new Multiple_Exception();
        
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
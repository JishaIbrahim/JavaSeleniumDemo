package Demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		demo();
		}
		catch(Exception exp) {
			System.out.println("i m inside catch block");
			System.out.println("message is "+exp.getMessage());
			System.out.println("cause is "+exp.getCause());
		}
		finally {
			System.out.println("inside finally block");
		}
	}
		
	public static void demo() throws Exception{	
		
		System.out.println("Hello");
		int i=1/0;
		System.out.println("completed");
		
		
		
	}

}

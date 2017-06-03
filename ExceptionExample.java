public class ExceptionExample{
	public static void main(String args[]){
		int number = 50;
		int divisor = 0;
		try{
			System.out.println(number/divisor);
		}catch(Exception e){
			System.out.println("There was some excetion in dividing:"+e);
		}
		int num = 10;
		int den = 5;
		System.out.println(10/5);	
	}


} 

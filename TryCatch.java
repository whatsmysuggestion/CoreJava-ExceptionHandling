
public class TryCatch {

	public static void main(String[] args) {

		
		try {
			
			int a[]=new int[5];
			a[0]=10;
			a[1]=2;
			a[3]=a[0]/a[1];
			System.out.println(a[3]);
			
		}
	
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ss)
		{
			 
			ss.printStackTrace();
			// System.out.println("Please enter other 0 for divison   "+ss);
			 
		}
	 
		catch(Exception ss)
		{
			ss.printStackTrace();
			 
			 //System.out.println("Please enter elements lessthan array size    "+ss);
		}
		
		finally
		{
			System.out.println("End Of The Program");
		}
		 
		 
	}
	
}

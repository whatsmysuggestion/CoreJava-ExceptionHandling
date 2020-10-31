class myEx1 extends ArithmeticException
{
	public myEx1() {
		 System.out.println("Some Error Occured Please Try Again");
	}
	
	public myEx1(String s) {
	 System.out.println("Exception Is "+s);
	}
} 
public class TryCatchExample {
	public static void main(String[] args) throws myEx1 
	  {
	 try {  			
		int a[]=new int[10];		 
		a[0]=10;
		a[5]=0;
 		if(a[5]==0)
			//throw new myEx1();
			throw new myEx1("Division By Zero Not Possible");
 		a[8]=a[0]/a[5];
		System.out.println(a[8]);		 
  }		
		catch(myEx1  re)
		{			 
	 
			throw re;
			 //throw new myEx1("Division By Zero Not Possible");
		}
	 	 
	}
}

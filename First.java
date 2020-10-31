class myEx extends Exception 
{

	myEx() {
	 System.out.println("Please Enter Other Than 0 For Denominator");
	}
	
	myEx(String s)
	{
		System.out.println("Error Occured  "+s);
	}
		
}



public class First {

	public static void main(String[] args)
	{

		
		try{
			First f=new First();
			f.display();	
			
		}
		catch(myEx me)
		{
	//	System.out.println(me);	
		}


	}

	
	
	void display()throws myEx 
	{
		int a[]=new int[5];		
		 
		a[0]=10;
		a[1]=0;
		if(a[1]==0)
			throw new myEx("Arithmetic Exception");
			//throw new myEx();
		a[7]=a[0]/a[1];
		System.out.println(a[7]);
 
	}
}

//Instance Variable
public class InstaV {
	/*Case 1:
	int i=10;
	void M1()
	{
		System.out.println(i);
	}
	*/
	
	//Case 2:
	/*void M1()
	{
		int i=10;//instance variable
		System.out.println(i);
	}
	public static void main(String[] args) {
		InstaV a=new InstaV();
		a.M1();
	}*/
	
	//Case 3:
	int i=10;
	public static void main(String[] args)
	{
		InstaV a=new InstaV();
		InstaV a1=new InstaV();
		System.out.println(a.i);	//10
		System.out.println(a1.i);	//10
		a1.i=30;
		System.out.println(a.i);	//10
		System.out.println(a1.i);	//30
	}
	
	//Case 4:
	/*int i=50;
	public static void main(String[] args)
	{
		System.out.println(i);//CE-Cannot make a static reference to the non-static field i
	}*/
}


//class Calc
//{
//	int n1;
//	int n2;
//	
//	Calc()
//	{
//		n1 = 5;
//	}
//	
//	public Calc(int n1,int n2)
//	{
//		this.n1=n1;
//		this.n2=n2;
//	}
//	
//}

class Add
{
	static
	{
		System.out.println("Addtion in Static Block");
	}
	Add()
	{
		System.out.println("Addtion in Add Constructor");
	}
	public int Add1(int i, int j)
	{
		return i+j;
	}
	public int Add1(int i, int j,int k)
	{
		return i+j+k;
	}
	public double Add1(double i, double j)
	{
		return i+j;
	}
}

public class Javabasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5)
//			{
//				//continue;
//				break;
//			}
//			System.out.println(i);
//		}
		
//		Calc ob=new Calc();
//		Calc ob1 = new Calc(3,5);
//		System.out.println(ob.n1);
//		System.out.println(ob1.n1);
//		System.out.println(ob1.n2);
		
		Add obj=new Add();
		System.out.println(obj.Add1(1, 2));
		System.out.println(obj.Add1(1, 2, 3));
		System.out.println(obj.Add1(1.1, 2.1));
	}

}

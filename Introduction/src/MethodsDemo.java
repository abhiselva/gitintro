
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();

		String name = d.getData();

		System.out.println(name);

		//MethodsDemo2 d1 = new MethodsDemo2();
		String Abhi = "Abhi";
		String name1 = d.getData2(Abhi);
		
		System.out.println(name1);
		//d1.getUserData();

		//getData2();


	};

	public String getData()

	{

		System.out.println ("hello world");

		return "rahul shetty";

	}



	public String getData2(String a)

		{

		System.out.println (a +" hello world");

		return "rahul shetty method 2";

		}




}


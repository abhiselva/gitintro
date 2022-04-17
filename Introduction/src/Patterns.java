
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		
//		a
//		ab
//		abc
//		abcd
//		abcde
		
//		for(int i=1;i<=6;i++)
//		{	
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
////		char a = 65;
////		System.out.println(a);
//		
//		for(int i=65;i<=90;i++)
//		{	
//			for(int j=65;j<=i;j++)
//			{
//				System.out.print((char)j);
//			}
//			System.out.println();
//		}
		
//		$$$$
//		$$$
//		$$
//		$
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=i;j<=4;j++)
//			{
//				System.out.print("$ ");
//			}
//			System.out.println();
//		}
		
//		$$$$
//		$  $
//		$  $
//		$$$$
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if((i==2 && j==2) || (i==2 && j==3) || (i==3 && j==2) || (i==3 && j==3))
					System.out.print(" ");
				else
					System.out.print("$");
			}
			System.out.println();
		}
		
	}

}


public class javabasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		int num = 6;
		StringBuffer wb = new StringBuffer();
		StringBuffer w = new StringBuffer();
		StringBuffer w1 = new StringBuffer();
		char c ='s';
		double sa = 5.99;
		boolean d =false;
		char[] str = new char[4];
	
		str[0]='A';
		str[1] = 'B';
		str[2]= 'H';
		str[3]= 'I';
		System.out.println(wb);
		
		
		for (int i=0;i<4;i++)
		{
			//System.out.println(str[i]);
			//w=Character.toString(str[i]);
			wb=wb.append(str[i]);
			//System.out.println(arr2[i]);
		}
		//System.out.println(w);
		System.out.println(wb.reverse());
		//System.out.println(num + wb);
		String[] aa=website.split(" ");
		for (int i=0;i<aa.length;i++)
		{
			System.out.println(aa[i]);
		
		}
		//System.out.println(myNum+"is the value stored in the myNum variable");
		//System.out.println(website);

		//Arrays -
		int[] arr = new int[5];// 5, 10
		arr[0] = 1;
		arr[1] = 2;
		arr[2]= 4;
		arr[3]= 5;
		arr[4]= 6;

		int[] arr2 = {1,2,4,5,6};
		
		for (int i=0;i<5;i++)
		{
			//System.out.println(arr[i]);
			//System.out.println(arr2[i]);
		}
		//System.out.println(arr2[0]);

	}

}

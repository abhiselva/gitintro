import java.io.IOException;
import java.util.ArrayList;

public class GetData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DataExcel obj = new DataExcel();
		ArrayList<String> s = obj.getrowData("Login");
		
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		System.out.println(s.get(2));
		System.out.println(s.get(3));
		

	}

}

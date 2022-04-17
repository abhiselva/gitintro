import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreamsDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Aju");
		names.add("Jeeva");
		names.add("Manoj");
		names.add("Santhosh");
		names.add("Arun");
		
		int count =0;
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).startsWith("A"))
				count++;
		}
		System.out.println(count);
		
		//using streams we can do the above operation in single line of code
		long as=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(as);
		
		long veg=Stream.of("Carrot","Onion","Tomato","Chilly","Chives","Cabbage","cauliflower").filter(s->s.startsWith("C")).count();
		System.out.println(veg);
		
		//Stream.of("Carrot","Onion","Tomato","Chilly","Chives","Cabbage","cauliflower").filter(s->s.startsWith("C")).forEachOrdered(s->System.out.println(s));
		Stream.of("Carrot","Onion","Tomato","Chilly","Chives","Cabbage","cauliflower").filter(s->s.startsWith("C"))
		.map(s->s.toUpperCase()).sorted().limit(2).forEach(s->System.out.println(s));
		System.out.println();
		List<String> names1 = Arrays.asList("Carrot","Onion","Tomato","Chilly","Chives","Cabbage","cauliflower");
		
		Stream<String> newStream = Stream.concat(names.stream(),names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("jeeva"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		List<Integer> num1 = Arrays.asList(23,12,12,31,44,12,33,44,21,76,89);
		num1.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		List<String> ns= names1.stream().distinct().collect(Collectors.toList());
		System.out.println(ns.get(0));
	}

}

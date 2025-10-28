import java.util.ArrayList;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		List<String> name=new ArrayList<>();
		HashSet<Integer> rollNumbers=new HashSet<>();
		name.add("Yash");
		name.add("Aditya");
		name.add("Yash");
    name.add("Bob");
		rollNumbers.add(1);
    rollNumbers.add(2);
    rollNumbers.add(3);
    rollNumbers.add(4);
    marks.add(Integer.valueOf(50)); 
    marks.add(Integer.valueOf(70));
    marks.add(Integer.valueOf(50));
    marks.add(Integer.valueOf(10));
    System.out.println("Names: "+name);
    System.out.println("Marks: "+marks);
    System.out.println("RollNumbers: "+rollNumbers);

		
		
		

}
}
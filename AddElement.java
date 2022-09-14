package arraylist;
import java.util.*;
public class AddElement {
public static void main(String[] args) {
	List<String> colour= new ArrayList<>();
	colour.add(0, "red");
	colour.add(1, "green");
	colour.add(2, "orange");
	colour.add(3, "white");
	colour.add(4, "black");
	//printing elements
	System.out.println("arraylist "+colour);
	System.out.println("\n");
	//printing elements using iterator
	Iterator<String>s=  colour.iterator();
	System.out.println("using iterator");
	while(s.hasNext())
	{
		System.out.println(s.next());
	}
	//adding elements in the specified index
	colour.add(0,"indigo");
	//to extract positon from arraylist
	System.out.println("\n");
	System.out.println("extracting the elements : "+colour.subList(0, 3));
	System.out.println("\n");
	//after adding the elements printing arraylist
	System.out.println(colour);
	System.out.println("\n");
	//swaping two index elements in arraylist
	Collections.swap(colour, 2, 5);
	System.out.println("after swapping the two index : "+colour);
	
//increase size of array by adding elements
String[] colors= {"blue","pink"};
Collections.addAll(colour, colors);

Iterator<String>s2=  colour.iterator();
System.out.println("\n");
System.out.println("printing after addding two elements");
while(s2.hasNext())
{
	System.out.println(s2.next());
}
//replace the element in the specified index
colour.set(1, "dark green");
System.out.println("\n");
System.out.println("after replacing the index 1 : "+colour);
//shuffling the arraylist
Collections.shuffle(colour);
//after shuffling printing arraylist
Iterator<String>s1=  colour.iterator();
System.out.println("\n");
System.out.println("using iterator after shuffling");
while(s1.hasNext())
{
	System.out.println(s1.next());
}
}
}

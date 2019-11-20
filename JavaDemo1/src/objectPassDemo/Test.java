package objectPassDemo;
import java.util.*;
public class Test {
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public void getDeatails() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name: ");
		name = in.nextLine();
		System.out.println("Enter the Id: ");
		id = in.nextInt();
		//in.close();
	}
	
	public void putDeatails() {
		System.out.println("ID of Student  : "+id);
		System.out.println("Name of Student: "+name);
	}
	

}

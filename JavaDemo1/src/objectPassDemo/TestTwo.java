package objectPassDemo;

import java.util.*;
import objectPassDemo.Test;

public class TestTwo {
	public void editDeatails(Test t) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = in.nextLine();
		t.setName(name);
		in.close();
		
	}

}

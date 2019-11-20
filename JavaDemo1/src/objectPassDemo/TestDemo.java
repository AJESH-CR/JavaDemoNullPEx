package objectPassDemo;

import objectPassDemo.*;

public class TestDemo {

	public static void main(String[] args) {
		Test t = new Test();
		TestTwo tt = new TestTwo();
		t.getDeatails();
		t.putDeatails();
		tt.editDeatails(t);
		t.putDeatails();
		
	}

}

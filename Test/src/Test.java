import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		
		Iterator ite = list.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}

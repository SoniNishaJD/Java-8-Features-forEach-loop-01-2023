import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Exampl1 {
	// For Each loop
	public static void main(String[] args) {
		// Sample Colection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++)
			myList.add(i);
		// Traversing by Iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator value: " + i);
		}
		// forEach method in Iterable
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value: " + t);
			}
		});
		// traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

	}

}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::" + t);
	}
}
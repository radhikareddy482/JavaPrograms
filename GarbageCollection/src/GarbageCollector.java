
public class GarbageCollector {
	protected void Finalize() {
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args) {
		GarbageCollector g = new GarbageCollector();
		GarbageCollector g1 = new GarbageCollector();
		g = null;
		g1 = null;
		System.gc();
		
	}

}

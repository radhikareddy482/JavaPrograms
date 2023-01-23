//you cast values from one type to another
public class TypeCasting {
	public static void main(String[] args) {
		int ants = 2000;
		int purchasedBlockOfCheese = 1;
		System.out.println("there are"+ants+", and"+purchasedBlockOfCheese);
		System.out.println((double)purchasedBlockOfCheese/ants);
		double salary = 4567.23;
		int roundSalary = (int)salary;
		System.out.println(salary);
		System.out.println(roundSalary);
	}

}

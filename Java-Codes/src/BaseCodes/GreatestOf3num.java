package BaseCodes;

public class GreatestOf3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =200;
		int n2 = 200;
		int n3 = 200;
		
		if (n1==n2 && n2==n3)
			System.out.println("All numbers are equal");
		else
			if (n1>n2 && n1>n3)
				System.out.println(n1+" is the greatest of 3");
			else if (n2>n1 && n2>n3)
				System.out.println(n2+ " is the greatest of 3");
			else 
				System.out.println(n3+ " is the greatest of 3");

	}

}

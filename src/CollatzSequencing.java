
public class CollatzSequencing {
	public static int CheckingEvenOrOdd(int number) {
		if(number%2==0) {
			number=number/2;
		}
		else {
			number=3*(number)+1;
		}
		return number;
	}
	public static void CollatzSequence(int number) {
		int temp;
		while(number!=1) {
			temp=CheckingEvenOrOdd(number);
			System.out.println(temp+" ");
		}
		System.out.print(number);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=Integer.parseInt(args[0]);
		CollatzSequence(number);
	}
	}


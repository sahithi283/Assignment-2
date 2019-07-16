
public class Divisability {
public static int DivisibleByThreeAndFive(int number) {
	int temp=0;
	if(number%3==0&&number%5==0) {
		System.out.print("FizzBuzz"+" ");
		temp=1;
	}
	return temp;
}
public static int DivisableByThree(int number) {
	int temp=0;
	if(number%3==0) {
		System.out.print("Fizz"+" ");
		temp=1;
	}
	return temp;
}
public static int DivisableByFive(int number) {
	int temp=0;
	if(number%5==0) {
		System.out.print("Buzz"+" ");
		temp=1;
	}
	return temp;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
	for(int i=1;i<=100;i++) {
		temp=0;
		temp=DivisibleByThreeAndFive(i);
		temp=DivisableByThree(i);
		temp=DivisableByFive(i);
		if(temp==0) {
			System.out.print(i+" ");
		}
	 }
	}
}

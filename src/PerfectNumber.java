import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumber pn=new PerfectNumber();
		int number,sum=0,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		number = in.nextInt();
		temp=number;
		sum=pn.PerfectNumberCheck(temp);
				if(number==sum) {
			System.out.println(number+" is a perfect number");
		}
		else {
			System.out.println(number+" is not a perfect number plz try another number");
		}
   }

	private static int PerfectNumberCheck(int temp) {
		int sum=0;
		// TODO Auto-generated method stub
		for(int i=1;i<temp;i++) {
			if(temp%i==0) {
				sum+=i;
			}
		}

		return sum;
	}

}

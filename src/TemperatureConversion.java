
public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int MeasureType=Integer.parseInt(args[0]);
	int Degree=Integer.parseInt(args[1]);
	if(MeasureType==0) {
		System.out.println("Converting CelsiusToFahrenheit :"+CelsiusToFahrenheitConversion(Degree));
	}
	else {
		System.out.println("Converting FahrenheitToCelsius :"+FahrenheitToCelsius(Degree));
	}
}

private static int FahrenheitToCelsius(int degree) {
	// TODO Auto-generated method stub
	int temp;
	temp=((degree-32)*5)/9;
	return temp;
}

private static int CelsiusToFahrenheitConversion(int degree) {
	// TODO Auto-generated method stub
	int temp;
	temp=((degree*9)/5)+32;
	return temp;
	}

}


public class Calculate {
	public static int square(int number){
		return (number * number);
	}
	
	public static int cube(int cubeNum){
		return (cubeNum * cubeNum * cubeNum);
	}
	
	public static double average(double avgNum, double avgNum2){
		return ((avgNum + avgNum2) / 2);
	}
	public static double average(double avgNum, double avgNum2, double avgNum3){
		return ((avgNum + avgNum2 + avgNum3) / 3);
	}
	public static double toDegrees(double rad){
		return (rad * 180 / 3.14159);
	}
	public static double toRadians(double deg){
		return (deg * 3.14159 / 180);
	}
	public static double discriminant(double a, double b, double c){
		return (b*b-4*a*c);
	}
	public static String toImproperFrac(int WholeNumber, int Numerator, int Denominator){
		int ImproperNum = WholeNumber*Denominator+Numerator;
		return(ImproperNum + "/" + Denominator);
	}
	public static String toMixedNum(int Improp, int Denominator){
		int Numerator = (Improp % Denominator);
		int WholeNum = (Improp / Denominator);
		return (WholeNum + "_" + Numerator + "/" + Denominator);
	}
	public static String foil(int a, int b, int c, int d, String n){
		int first = a*c;
		int second = a*d + b*c;
		int third = b*d;
		return (first + ("n^2+") + second + "n" + third);
	}
	public static int isDivisibleBy(int Num1, int Num2){
		if (Num1 % Num2 ==0);
		return (Num1/Num2);
	}
	public static double absValue(double Num1){
		if(Num1 < 0){
			return(Num1 * -1);
		}else{
			return(Num1);
		}
	}
	public static int max(int Num1, int Num2){
		if(Num1 > Num2){
			return(Num1);
		}else{
			return(Num2);
		}
	}
	public static int min(int Num1, int Num2){
		if(Num1 < Num2){
		return (Num1);
		}
		else{
			return(Num2);
		}
	}
	public static double round2(double num1) {
		double roundedNum = (int) num1*100;
		roundedNum = roundedNum + 0.005;
		return (roundedNum/100);
		// TODO Auto-generated method stub
	}
	public static double exponent(int Num2, double Num1){
		double answer = 1;
		for(int i = 1; i <= Num1; i++){
			answer *= Num2;
		}
		return(answer);
	}
	public static int factorial(int Num1){
		int answer = 1;
		for(int i = 1; i <= Num1; i++){
		answer *= i;
		}
		return(answer);
	}
	public static boolean isPrime(int Num1){
		int Num2;
		Calculate.isDivisibleBy(Num1, Num2);
		return(
	}
}

	

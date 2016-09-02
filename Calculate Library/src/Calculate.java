
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
	
		
}
	

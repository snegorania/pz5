package pz;
import java.util.Scanner;



public class pz5 {
	
	static double Func (double x1, double x2, double x3) {
		return Math.pow((x1-3), 2) + Math.pow((x2-5), 2) + Math.pow((x3-7), 2);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double[] arr = new double[3];
		double[] arr1 = new double[3];
		System.out.println("Enter dot:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextFloat(); 
		}
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i]; 
		}
		System.out.println("Enter e");
		double e = in.nextFloat();
		System.out.println("Enter del");
		double del = in.nextFloat();
		double F2, F1;
		double del1;
		for(int i = 0; i < arr.length; i++) {
			del1 = del;
			do {
				F1 = Func (arr[0], arr[1], arr[2]);
				arr1[i] = arr[i] - del1; 
				F2 = Func (arr1[0], arr1[1], arr1[2]);
				if(F2 < F1) {
						arr[i] = arr1[i]; 
				}
				else {
					arr1[i] = arr[i] + del1;
					F2 = Func (arr1[0], arr1[1], arr1[2]);
					if(F2 < F1) {
							arr[i] = arr1[i];
					}
					else {
						del1 = del1 / 2.0;
					}
				}
			}while(del1 > e);
		}
		System.out.println("Optimised");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(String.format("x = %.3f", arr[i]));
		}
	}
	
	
}

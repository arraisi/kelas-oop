package tes1;

import java.util.Scanner;

public class HitungUpah {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("base pay : ");
		double basepay = input.nextDouble();
		System.out.print("working Hours: ");
		double workingHours = input.nextDouble();

		if (basepay < 8000 || workingHours > 60) {
			System.out.println(" error ");

		} else {
			HitungUpah hu = new HitungUpah();
			System.out.print(" Upah : " + hu.upah(basepay, workingHours));
			System.out.println("  ===================  ");
		}

	}

	private Double upah(double basepay, double workingHours) {
		double total = 0.0;
		if (basepay > 8000) {
			total = (40 * basepay);
			if (workingHours > 40) {
				total = total + ((workingHours - 40) * basepay * 1.5);
			}
		} else {
			total = 0.0;
		}
		return total;
	}
}

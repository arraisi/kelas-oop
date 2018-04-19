package tes1;

import java.util.Objects;
import java.util.Scanner;

public class HitungPajak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Status : ");
		String status = input.next();
		System.out.print(" THP : ");
		double thp = input.nextDouble();
		
		HitungPajak hp = new HitungPajak();
		double ptkp = hp.getPkp(status, thp);
		System.out.println(" pajak = "+hp.hitungPajak(ptkp));
		
	}

	private double hitungPajak(double ptkp) {
		double pajak = 0.0;
		if (ptkp > 0.0 && ptkp <= 50000000.0) {
			pajak = ptkp * 0.05;
		} else if (ptkp > 50000000.0 && ptkp <= 250000000.0) {
			double sisa = ptkp - 50000000;
			pajak = (50000000 * 0.05) + (sisa * 0.15);
		} else if (ptkp > 250000000.0 && ptkp <= 500000000.0) {
			double sisa = ptkp - 50000000;
			double sisa2 = sisa - 250000000;
			pajak = (50000000 * 0.05) + (sisa * 0.15) + (sisa2 * 0.25);
		} else if (ptkp > 500000000.0) {
			double sisa = ptkp - 50000000;
			double sisa2 = sisa - 250000000;
			double sisa3 = sisa - 500000000;
			pajak = (50000000 * 0.05) + (sisa * 0.15) + (sisa2 * 0.25) + (sisa3 * 0.3);
		}

		return pajak;
	}

	public double getPkp(String status, double thp) {
		if (Objects.equals(status, "TK0")) {
			return thp - 36000000;

		} else if (Objects.equals(status, "TK1")) {
			return thp - 39000000;

		} else if (Objects.equals(status, "TK2")) {
			return thp - 42000000;

		} else if (Objects.equals(status, "TK3")) {
			return thp - 45000000;

		} else if (Objects.equals(status, "K0")) {
			return thp - 39000000;

		} else if (Objects.equals(status, "K1")) {
			return thp - 42000000;

		} else if (Objects.equals(status, "K2")) {
			return thp - 45000000;

		} else if (Objects.equals(status, "K3")) {
			return thp - 48000000;

		} else {
			return 0.0;
		}
	}

}

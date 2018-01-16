package edu.fju.exam.Niner;

public class Niner {
	
	public static void main(String[] args) {

			for (int b = 1; b < 6; b++) {
				if (b < 6 ) {
					for (int a = 2; a < 6; a++) {
						if ((a * b) < 10) {
							System.out.print(a + "x" + b + "=" + " " + (a * b) + "\t");
						} else {
							System.out.print(a + "x" + b + "=" + (a * b) + "\t");
						}
					}
					System.out.println();
				}
			}
	}
}
			
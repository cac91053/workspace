package edu.fju.exam.VendingMachine;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
			int money = 0;
			System.out.println("餘額:"+money);
			while(true){
			System.out.print("投幣或選擇飲料, 有8種(a、b、c、d、e、f、g、h)輸入0結束:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			switch (line) {
			case "1":
				money = money + 1;
				System.out.println("餘額:"+money);
				break;
			case "5":
				money = money + 5;
				System.out.println("餘額:"+money);
				break;
			case "10":
				money = money + 10;
				System.out.println("餘額:"+money);
				break;
			case "a":
				if(money >= 10){
					money = money -10 ;
				System.out.println("餘額:"+money);
				System.out.println("DON!");}else{
					System.out.println("餘額:"+money);
					System.out.println("BEEP!");
				}
			}
			}
	}
}
	
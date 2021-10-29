package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner = new Scanner(System.in);
		String s;
		do {
			
			s = scanner.nextLine();
			
			if(s.equals("")) {
				continue;
			}
			
			String[] parts = s.split(" ");
			
			if(parts.length != 3)
			{
				if(s.equals("kraj"))
					continue;
				System.out.println("Pogresan format naredbe");
				continue;
			}
				
			
		} while(!s.equals("kraj"));
		
	}

}

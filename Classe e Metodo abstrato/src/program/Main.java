package program;



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		System.out.print("Enter the number of the tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual incoming: ");
			double anualIncoming = sc.nextDouble();
			
			if(ch == 'i') {
				
				System.out.print("Health expenditures: ");
				double healthexpent = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncoming, healthexpent));
				
			} else {
				
				System.out.print("Number of Employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncoming, numberEmployees));
				
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		double sum = 0;
		for(Pessoa p : list) {
			sum += p.impostoPago();
			System.out.println(p.getName() + ": $" + String.format("%.2f", p.impostoPago()));
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
	
		
		sc.close();
	}
}

	


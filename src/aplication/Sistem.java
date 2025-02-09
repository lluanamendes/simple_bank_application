package aplication;

import java.util.Scanner;
import entities.Account;

public class Sistem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Digite o número da conta: ");
		int number=sc.nextInt();
		sc.nextLine();
		System.out.printf("Digite o nome do titular da conta: ");
		String name=sc.nextLine();
		Account data= new Account(number, name);
		double deposit=0;
		
		System.out.println("Deseja realizar um deposito incial?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		char op=sc.next().charAt(0);
		
		if (op=='1') {
			System.out.println("Digite o valor para deposito: ");
			deposit=sc.nextInt();
			data.balanceDeposit(deposit);
		}
		data.print();
		
		System.out.println("Deseja realizar um deposito ou um Saque?");
		System.out.println("1 - Deposito");
		System.out.println("2 - Saque");
		op=sc.next().charAt(0);
		switch (op) {
		case '1':
			System.out.println("Digite o valor para deposito: ");
			deposit=sc.nextInt();
			data.balanceDeposit(deposit);
			break;
			
		case '2':
			System.out.println("Digite o valor para saque: ");
			double Withdraw=sc.nextInt();
			data.balanceWithdraw(Withdraw);
			break;
		}
		System.out.println("Dados atualizados: ");
		data.print();
		
		sc.close();
	}

}

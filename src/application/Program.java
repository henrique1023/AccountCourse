package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(2325, "Miguel", 0.0);
		BusinessAccount bacc = new BusinessAccount(2326, "João", 0.0, 500.0);
		
		//UPCASTING É QUANDO VOCê ATRIBUI UMA SUBCLASSE EM UMA SUPERCLASSE EXEMPLO
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "keia", 0.5, 200.00);
		Account acc3 = new SavingsAccount(1005, "joaquim", 500.0, 0.2);
	}

}

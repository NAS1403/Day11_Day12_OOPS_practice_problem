package com.bridgelabz.stock_acount_management;

import java.util.Scanner;

public class StockManagement {
    public static void main(String[] args) {
        StockPortfolio st = new StockPortfolio();
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        while(exit) {
            System.out.println("Enter \n1)To add stock\n2)to display stock\n3)debit from account\n4)exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    st.stockPortfolio();
                    break;
                case 2:
                    st.display();
                    break;
                case 3:
                    account.debit(st.totalValue);
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    break;
            }
        }
    }
}

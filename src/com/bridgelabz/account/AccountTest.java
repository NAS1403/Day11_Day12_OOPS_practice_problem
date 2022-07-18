package com.bridgelabz.account;

import java.util.Scanner;

public class AccountTest extends Account{
    public static void main(String[] args) {
        AccountTest test = new AccountTest();
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the account balance");
        int accountBalance= scr.nextInt();
        test.debit(accountBalance);
    }
}

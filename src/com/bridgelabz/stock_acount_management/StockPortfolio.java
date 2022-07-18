package com.bridgelabz.stock_acount_management;
import java.util.Scanner;

public class StockPortfolio{
    int noOfStocks;
    Scanner scr = new Scanner(System.in);
    Stock[] arr = new Stock[5];
    Stock stock = new Stock();

    public StockPortfolio() {
    }

    void stockPortfolio() {

        System.out.println("Enter no of stocks");
        noOfStocks = scr.nextInt();

        for (int i = 0; i <noOfStocks; i++) {
            System.out.println("Enter stock name");
            stock.setStockName(scr.next());
            System.out.println("Enter number of shares");
            stock.setNoOfShares(scr.nextInt());
            System.out.println("Enter each share price");
            stock.setSharePrice( scr.nextDouble());

             arr[i] = new Stock(stock.getStockName(), stock.getNoOfShares(), stock.getSharePrice());

        }
    }

    void valueOfStock(){
        double totalValue=0;
        for(int i=0;i<noOfStocks;i++){
            double stockValue = arr[i].getNoOfShares()*arr[i].getSharePrice();
            System.out.println("Stock value of  "+ arr[i].getStockName()+ " is "+ stockValue);
            totalValue+=stockValue;
        }
        System.out.println("Value of total stock is: "+totalValue);

    }

   void display(){
        for (int i=0;i<noOfStocks;i++){
            System.out.println(arr[i]);
        }
   }
}

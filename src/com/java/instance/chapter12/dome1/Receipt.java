package com.java.instance.chapter12.dome1;

import java.util.Formatter;

/**
 * ClassName Receipt
 * Description 用格式修饰符来打印一个收据
 * Author wyv
 * Create Time 2018-11-07 20:08
 */
public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void print(String name, int qty, double price){
        f.format("%-15.15s %5s %10s\n", name, qty, price);
        total+=price;
    }
    public void printTitle(){
        f.format("%-15s %5s %10s\n", "Item", "Qty", "price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }
    public void printTotal(){
        f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Total", "", total*1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge",1,14.29);
        receipt.printTotal();
    }
}

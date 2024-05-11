/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.Scanner;

/**
 *
 * @author tai.tran
 */
public class BankAccount {
    private int mAccNum;
    private String mName;
    private double mBalance;

    public BankAccount() {
    }

    public BankAccount(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }
    public void Input(Scanner obj)
    {
        System.out.print("Account number: ");
        mAccNum = obj.nextInt();
        obj.nextLine();
        System.out.print("Name: ");
        mName =  obj.nextLine();
        System.out.print("Balance: ");
        mBalance = obj.nextDouble();
    }
    public void Print()
    {
        System.out.print("ACCNumber: " + mAccNum + "\nName: " + mName + "\nBalance: " + mBalance);
    }
    public String Tostring()
    {
        return String.valueOf(mBalance);     
    }
    public void Deposit(double money)
    {
        this.mBalance+= money;
    }
    public boolean Withdraw(double money)
    {
        //flase
        if(money<=0) return false;
        if(money>this.mBalance) return false;
        //true
        this.mBalance-=money;
        return true;
    }
    public boolean TranferMoney(BankAccount acc, double money)
    {
        if(money<=0) return false;
        if(money>this.mBalance) return false;
        this.Withdraw(money);
        acc.Deposit(money);
        return true;
    }
    public boolean CompareAccoutNumber(int acc)
    {
        return acc == this.mAccNum;
    }
    
    
}

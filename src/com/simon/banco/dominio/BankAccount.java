package com.simon.banco.dominio;

public class BankAccount {

    public int number;
    public double balance;
    public String type;
    public Person holder;
    public Bank bank;


    public boolean active;


    public boolean deposit(double moneyToDeposit) {
        this.balance += moneyToDeposit;
        if (this.active == true && moneyToDeposit > 0) {
            this.balance += moneyToDeposit;
            return true;
        }
        System.out.printf("  deposit failed, the account is inactive  ");

        return false;
    }


    public boolean withdrawal(double moneyToWithdrawl) {
        if (this.active && this.balance >= moneyToWithdrawl) {
            this.balance -= moneyToWithdrawl;
            return true;
        }
        return false;
    }


    public String getBalance() {
        return this.holder.name + " you balance is: " + this.balance;
    }

    public boolean transfer(BankAccount destinationAccount, double moneyToTransfer) {
        boolean suscesfulWithdraw = this.withdrawal(moneyToTransfer);

        if (suscesfulWithdraw) {
            boolean succesfullyDeposit = destinationAccount.deposit(moneyToTransfer);

            if (succesfullyDeposit) ;
            return true;

            }
        this.deposit(moneyToTransfer);
        return false;
    }


}
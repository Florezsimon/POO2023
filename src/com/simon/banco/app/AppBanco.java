package com.simon.banco.app;

import com.simon.banco.dominio.BankAccount;
import com.simon.banco.dominio.Person;


public class AppBanco {


    public static void main(String[] args) {

        Person diana = new Person();
        diana.id = 357;
        diana.name = "Diana";

        Person alvaro = new Person();
        alvaro.id = 435;
        alvaro.name = "Alvaro";

        BankAccount dianaAccount = new BankAccount();
        dianaAccount.holder = diana;
        dianaAccount.active = true;

        BankAccount alvaroAccount = new BankAccount();
        alvaroAccount.holder = alvaro;
        alvaroAccount.active = true;



        dianaAccount.deposit(150);



        System.out.printf(dianaAccount.getBalance());
        System.out.printf(alvaroAccount.getBalance());

        dianaAccount.transfer(alvaroAccount, 20);
    }

}

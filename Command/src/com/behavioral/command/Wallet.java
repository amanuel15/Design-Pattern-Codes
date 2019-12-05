package com.behavioral.command;

import com.behavioral.command.commands.Transaction;

public class Wallet {
    private Transaction transaction;

    public Wallet(Transaction transaction) {
        this.transaction = transaction;
    }

    public void exchange(int amount){
        transaction.execute(amount);
    }
}

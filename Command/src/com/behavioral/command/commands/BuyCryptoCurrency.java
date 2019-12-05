package com.behavioral.command.commands;

import com.behavioral.command.recievers.CryptoCurrency;

public class BuyCryptoCurrency implements Transaction {

    private CryptoCurrency currency;

    public BuyCryptoCurrency(CryptoCurrency currency) {
        this.currency = currency;
    }

    @Override
    public void execute(int amount) {
        currency.buy(amount);
    }
}

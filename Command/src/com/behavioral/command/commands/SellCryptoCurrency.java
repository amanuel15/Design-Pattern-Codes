package com.behavioral.command.commands;

import com.behavioral.command.recievers.CryptoCurrency;

public class SellCryptoCurrency implements Transaction {

    private CryptoCurrency currency;

    public SellCryptoCurrency(CryptoCurrency currency) {
        this.currency = currency;
    }

    @Override
    public void execute(int amount) {
        currency.sell(amount);
    }

}

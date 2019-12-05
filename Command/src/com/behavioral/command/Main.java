package com.behavioral.command;

import com.behavioral.command.commands.BuyCryptoCurrency;
import com.behavioral.command.commands.SellCryptoCurrency;
import com.behavioral.command.commands.Transaction;
import com.behavioral.command.recievers.BitCoin;
import com.behavioral.command.recievers.CryptoCurrency;
import com.behavioral.command.recievers.Ether;

public class Main {

    public static void main(String[] args) {
        CryptoCurrency bitcoin = new BitCoin();
        Transaction buy = new BuyCryptoCurrency(bitcoin);
        Wallet buyWallet = new Wallet(buy);
        buyWallet.exchange(500);

        CryptoCurrency ETH = new Ether();
        Transaction sell = new SellCryptoCurrency(ETH);
        Wallet sellWallet = new Wallet(sell);

        sellWallet.exchange(100);


    }
}

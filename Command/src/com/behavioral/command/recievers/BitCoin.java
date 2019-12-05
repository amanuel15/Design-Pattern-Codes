package com.behavioral.command.recievers;

public class BitCoin implements CryptoCurrency {



    @Override
    public void sell(int amount ) {
        System.out.println("you have sold "+amount + " BitCoin" );
    }

    @Override
    public void buy(int amount) {
        System.out.println("you have bought "+amount+" BitCoin" );
    }
}

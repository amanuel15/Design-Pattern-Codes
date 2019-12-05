package com.behavioral.command.recievers;

public class Ether implements CryptoCurrency {


    @Override
    public void sell(int amount ) {
        System.out.println("you have sold "+amount + " ETH" );
    }

    @Override
    public void buy(int amount) {
        System.out.println("you have bought "+amount+" ETH" );
    }
}

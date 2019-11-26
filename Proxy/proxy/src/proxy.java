class proxy {

    public static void main(String[] args){
        
        ExpensiveObjectProxy eop = new ExpensiveObjectProxy();
        eop.process();
        eop.process();

    }
}


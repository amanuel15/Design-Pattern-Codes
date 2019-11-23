class proxy {

    public static void main(String[] args){
        System.out.println("Main call");
        ExpensiveObjectProxy eop = new ExpensiveObjectProxy();
        eop.process();

    }
}


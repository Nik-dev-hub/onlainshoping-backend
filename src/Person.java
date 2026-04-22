public abstract class Person implements Finanseble {
    private double wallet;

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    void wallet_paid(double bal){
        this.wallet -= bal;
    }

    @Override
    public double checkBalance() {
        return wallet;
    }

    public double getWallet() {
        return wallet;
    }

    @Override
    public boolean hasEnoughMoney(){
        return false;
    }

    @Override
    public String getFinansleStatus() {
        System.out.printf("Ваш текущий баланс: %s, можете ли вы оплатить покупку(false - нет, true - да): %s ",checkBalance(),hasEnoughMoney());
        return "close";
    }

}

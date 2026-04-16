public abstract interface Payable {
    double getFinalePrice();
    void pay(double money);
    boolean isPaid();
}

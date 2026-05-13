public abstract class Person implements Finanseble {
    private double wallete;

    public void setWallete(double wallete) {
        this.wallete = wallete;
    }

    public void depWallete(double amount){
        this.wallete -= amount;
    }

    @Override
    public double checkBalance(){
        return wallete;
    }

    @Override
    public boolean hasEnoughMoney(double amount){
        return wallete >= amount;
    }
}

public class DebitCard extends Card{
    public DebitCard(String IBAN, int ammount) {
        super(IBAN, ammount);
    }

    @Override
    public void withdraw(int sum) {
        if(this.getAmmount() >= sum){

            System.out.println("Operation was done successfully");
            this.setAmmount(this.getAmmount() - sum);
        }
        else
            System.out.println("Not enough funding!");
    }
}

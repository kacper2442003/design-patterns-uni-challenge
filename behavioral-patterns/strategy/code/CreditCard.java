public class CreditCard implements PaymentStrategy{
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Credit Card: " + cardNumber + ", amount: " + amount);;
    }
}

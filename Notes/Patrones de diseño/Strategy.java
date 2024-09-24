public class Strategy {
  // Strategy Interface
interface PaymentStrategy {
  void pay(int amount);
}

// ConcreteStrategy
class CreditCardPayment implements PaymentStrategy {
  private String cardNumber;

  public CreditCardPayment(String cardNumber) {
      this.cardNumber = cardNumber;
  }

  @Override
  public void pay(int amount) {
      System.out.println("Pagando " + amount + " con tarjeta de crédito: " + cardNumber);
  }
}

// ConcreteStrategy
class PayPalPayment implements PaymentStrategy {
  private String email;

  public PayPalPayment(String email) {
      this.email = email;
  }

  @Override
  public void pay(int amount) {
      System.out.println("Pagando " + amount + " con PayPal: " + email);
  }
}

// ConcreteStrategy
class BitcoinPayment implements PaymentStrategy {
  private String bitcoinAddress;

  public BitcoinPayment(String bitcoinAddress) {
      this.bitcoinAddress = bitcoinAddress;
  }

  @Override
  public void pay(int amount) {
      System.out.println("Pagando " + amount + " con Bitcoin: " + bitcoinAddress);
  }
}

// Context
class ShoppingCart {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
      this.paymentStrategy = paymentStrategy;
  }

  public void checkout(int amount) {
      if (paymentStrategy == null) {
          throw new IllegalStateException("No se ha seleccionado un método de pago.");
      }
      paymentStrategy.pay(amount);
  }
}

// Client
public class Client {
  public static void main(String[] args) {
      ShoppingCart cart = new ShoppingCart();

      // Usar tarjeta de crédito para el pago
      cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9101-1121"));
      cart.checkout(150);

      // Usar PayPal para el pago
      cart.setPaymentStrategy(new PayPalPayment("usuario@example.com"));
      cart.checkout(200);

      // Usar Bitcoin para el pago
      cart.setPaymentStrategy(new BitcoinPayment("1A2B3C4D5E6F7G8H9I0J"));
      cart.checkout(300);
  }
}

}

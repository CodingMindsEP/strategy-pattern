interface Payment {
  pay(): void;
}

class Webpay implements Payment {
  pay(): void {
    console.log("Pay with Webpay");
  }
}

class Paypal implements Payment {
  pay(): void {
    console.log("Pay with Paypal");
  }
}

class WireTransfer implements Payment {
  pay(): void {
    console.log("Pay with WireTransfer");
  }
}

const paymentFactory: PaymentFactory = new PaymentFactory();
const payment: Payment = paymentFactory.getPayment("WireTransfer");
payment.pay();

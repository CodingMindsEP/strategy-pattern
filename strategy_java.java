interface Payment {
    void pay();
}

class Webpay implements Payment {
    public void pay() {
        System.out.println("Pay with Webpay")
    }
}

class Paypal implements Payment {
    public void pay() {
        System.out.println("Pay with Paypal")
    }
}

class WireTransfer implements Payment {
    public void pay() {
        System.out.println("Pay with WireTransfer")
    }
}

public class Main {
    public static void main(String[] args) {
        Payment webpay = new Webpay();
        Payment paypal = new Paypal();
        Payment wireTransfer = new WireTransfer();

        webpay.pay();
        paypal.pay();
        wireTransfer.pay();
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory()
        Payment payment = paymentFactory.getPayment("WireTransfer");
        payment.pay();
    }
}

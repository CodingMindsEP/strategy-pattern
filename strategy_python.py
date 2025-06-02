from abc import ABC, abstractmethod

class Payment(ABC):
    @abstractmethod
    def pay(self):
        pass

class Webpay(Payment):
    def pay(self):
        print("Pay with Webpay")

class Paypal(Payment):
    def pay(self):
        print("Pay with Paypal")

class WireTransfer(Payment):
    def pay(self):
        print("Pay with WireTransfer")

paymentFactory = PaymentFactory()
payment = paymentFactory.getPayment('WireTransfer');
payment.pay();

#include <iostream>
using namespace std;

class Payment {
public:
    virtual void pay() = 0;
    virtual ~Payment() {}
};

class Webpay : public Payment {
public:
    void pay() override {
        cout << "Pay with Webpay" << endl;
    }
};

class Paypal : public Payment {
public:
    void pay() override {
        cout << "Pay with Paypal" << endl;
    }
};

class WireTransfer : public Payment {
public:
    void pay() override {
        cout << "Pay with WireTransfer" << endl;
    }
};

int main() {
    PaymentFactory* paymentFactory = new PaymentFactory();
    Payment* payment = paymentFactory.getPayment('WireTransfer');
    payment->pay();

    return 0;
}

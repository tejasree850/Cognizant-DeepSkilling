public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor paytm =
                new PaytmAdapter(new PaytmGateway());

        PaymentProcessor googlePay =
                new GooglePayAdapter(new GooglePayGateway());

        paytm.processPayment(1000);

        googlePay.processPayment(2000);
    }
}
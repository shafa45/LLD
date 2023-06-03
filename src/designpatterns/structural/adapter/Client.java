package designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart1 = new Flipkart(new RazorpayPaymentGatewayAdapter());
        Flipkart flipkart2 = new Flipkart(new JuspayPaymentGatewayAdapter());
    }
}

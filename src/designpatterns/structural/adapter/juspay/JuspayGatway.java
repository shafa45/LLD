package designpatterns.structural.adapter.juspay;


public class JuspayGatway {

    public  String payByCreditCard(String creditCard,
                                   String cvv,
                                   String expiry) {
        System.out.println("Payment done by Juspay");
        return "123";
    }

    public String PayByAirtelMoneyWallet(String phone) {
        System.out.println("Payment done by Juspay (Airtel wallet)");
        // logic for handle payment via wallet
        return "123";
    }

    public boolean checkTranscationStatus(String id) {
       return true;
    }
}


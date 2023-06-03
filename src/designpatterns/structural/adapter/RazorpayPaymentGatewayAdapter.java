package designpatterns.structural.adapter;

import designpatterns.structural.adapter.razorpay.RazorpayGateway;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway {
    private RazorpayGateway razorpayGateway = new RazorpayGateway();
    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiryMonthString = String.valueOf(expiryMonth);
        String expiryYearString = String.valueOf(expiryYear);
        String expiryString = expiryMonthString + "/" + expiryYearString;

        String transactionId = razorpayGateway.payByCreditCard(cardNumber, cvvString, expiryString);

        return Long.valueOf(transactionId);

    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorpayGateway.checkPaymentStatus(String.valueOf(id));
        if(status) {
            return PaymentStatus.SUCCESS;
        }

        return PaymentStatus.FAILURE;
    }
}

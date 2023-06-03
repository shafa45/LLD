package designpatterns.structural.adapter;

import designpatterns.structural.adapter.juspay.JuspayGatway;

public class JuspayPaymentGatewayAdapter implements PaymentGateway {
    private JuspayGatway juspayGateway = new JuspayGatway();
    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiryMonthString = String.valueOf(expiryMonth);
        String expiryYearString = String.valueOf(expiryYear);
        String expiryString = expiryMonthString + "/" + expiryYearString;

        String transactionId = juspayGateway.payByCreditCard(cardNumber, cvvString, expiryString);

        return Long.valueOf(transactionId);

    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = juspayGateway.checkTranscationStatus(String.valueOf(id));
        if(status) {
            return PaymentStatus.SUCCESS;
        }

        return PaymentStatus.FAILURE;
    }
}

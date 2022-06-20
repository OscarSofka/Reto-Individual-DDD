package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class AmountLikesSend implements ValueObject<AmountLikesSend> {
    private final AmountLikesSend amountLikesSendValue;

    public AmountLikesSend(AmountLikesSend amountLikesSendValue) {
        this.amountLikesSendValue = amountLikesSendValue;
    }


    @Override
    public AmountLikesSend value() {
        return null;
    }
}

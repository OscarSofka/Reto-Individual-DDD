package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class AmountLikesRecieved implements ValueObject<AmountLikesSend> {
    private final AmountLikesRecieved amountLikesRecievedValue;

    public AmountLikesRecieved(AmountLikesRecieved amountLikesRecievedValue) {
        this.amountLikesRecievedValue = amountLikesRecievedValue;
    }


    @Override
    public AmountLikesSend value() {
        return null;
    }
}

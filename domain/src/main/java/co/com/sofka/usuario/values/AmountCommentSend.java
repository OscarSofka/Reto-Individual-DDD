package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class AmountCommentSend implements ValueObject<AmountCommentSend> {
    private final AmountCommentSend amountCommentSendValue;

    public AmountCommentSend(AmountCommentSend amountCommentSendValue) {
        this.amountCommentSendValue = amountCommentSendValue;
    }


    @Override
    public AmountCommentSend value() {
        return null;
    }
}

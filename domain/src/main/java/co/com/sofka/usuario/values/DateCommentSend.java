package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class DateCommentSend implements ValueObject<DateCommentSend> {
    private final DateCommentSend dateCommentSendValue;

    public DateCommentSend(DateCommentSend dateCommentSendValue) {
        this.dateCommentSendValue = dateCommentSendValue;
    }

    @Override
    public DateCommentSend value() {
        return null;
    }
}

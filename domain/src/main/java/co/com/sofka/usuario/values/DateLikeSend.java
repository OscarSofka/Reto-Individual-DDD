package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class DateLikeSend implements ValueObject<DateLikeSend> {
    private final String dateLikeSendValue;

    public DateLikeSend(DateLikeSend dateLikeSendValue) {
        this.dateLikeSendValue = String.valueOf(dateLikeSendValue);
    }

    @Override
    public DateLikeSend value() {
        return null;
    }

    public String getDateLikeSendValue() {
        return dateLikeSendValue;
    }
}

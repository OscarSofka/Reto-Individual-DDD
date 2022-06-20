package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class DateCommentRecieved implements ValueObject<DateCommentRecieved> {
    private final DateCommentRecieved dateCommentRecievedValue;

    public DateCommentRecieved(DateCommentRecieved dateCommentRecievedValue) {
        this.dateCommentRecievedValue = dateCommentRecievedValue;
    }

    @Override
    public DateCommentRecieved value() {
        return null;
    }
}

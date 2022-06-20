package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class DateLikeRecived implements ValueObject<DateLikeRecived> {
    private final DateLikeRecived dateLikeRecivedValue;

    public DateLikeRecived(DateLikeRecived dateLikeRecivedValue) {
        this.dateLikeRecivedValue = dateLikeRecivedValue;
    }

    @Override
    public DateLikeRecived value() {
        return null;
    }
}

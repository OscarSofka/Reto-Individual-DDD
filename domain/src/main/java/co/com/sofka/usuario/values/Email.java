package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class Email  implements ValueObject<Email> {
    private final Email emailValue;

    public Email(Email emailValue) {
        this.emailValue = emailValue;
    }

    @Override
    public Email value() {
        return null;
    }
}

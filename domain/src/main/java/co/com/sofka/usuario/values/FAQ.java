package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class FAQ implements ValueObject<FAQ> {
    private final FAQ faqValue;

    public FAQ(FAQ faqValue) {
        this.faqValue = faqValue;
    }

    @Override
    public FAQ value() {
        return null;
    }
}

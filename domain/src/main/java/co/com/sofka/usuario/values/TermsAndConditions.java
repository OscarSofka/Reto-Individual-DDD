package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class TermsAndConditions implements ValueObject<TermsAndConditions> {
    private final TermsAndConditions termsAndConditionsValue;

    public TermsAndConditions(TermsAndConditions termsAndConditionsValue) {
        this.termsAndConditionsValue = termsAndConditionsValue;
    }

    @Override
    public TermsAndConditions value() {
        return null;
    }
}

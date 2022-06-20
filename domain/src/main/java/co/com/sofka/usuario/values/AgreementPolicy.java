package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class AgreementPolicy implements ValueObject<AgreementPolicy> {
    private final AgreementPolicy agreementPolicyValue;

    public AgreementPolicy(AgreementPolicy agreementPolicyValue) {
        this.agreementPolicyValue = agreementPolicyValue;
    }


    @Override
    public AgreementPolicy value() {
        return null;
    }
}

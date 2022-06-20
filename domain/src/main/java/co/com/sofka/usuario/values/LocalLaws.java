package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class LocalLaws implements ValueObject<LocalLaws> {
    private final LocalLaws localLawsValue;

    public LocalLaws(LocalLaws localLawsValue) {
        this.localLawsValue = localLawsValue;
    }

    @Override
    public LocalLaws value() {
        return null;
    }
}

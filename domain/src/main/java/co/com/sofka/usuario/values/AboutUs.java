package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class AboutUs  implements ValueObject<AboutUs> {
    private final AboutUs aboutUsValue;

    public AboutUs(AboutUs aboutUsValue) {
        this.aboutUsValue = aboutUsValue;
    }


    @Override
    public AboutUs value() {
        return null;
    }
}

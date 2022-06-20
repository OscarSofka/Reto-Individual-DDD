package co.com.sofka.usuario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.values.Country;
import co.com.sofka.usuario.values.GPS;

public class ChangeCountry extends Command {
    private final Country country;
    private final GPS gps;

    public ChangeCountry(Country country, GPS gps) {
        this.country = country;
        this.gps = gps;
    }

    public Country getCountry() {
        return country;
    }

    public GPS getGps() {
        return gps;
    }
}

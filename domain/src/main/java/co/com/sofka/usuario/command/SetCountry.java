package co.com.sofka.usuario.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.usuario.values.Country;
import co.com.sofka.usuario.values.GPS;

public class SetCountry extends Command {
    private final Country country;
    private final GPS gps;

    public SetCountry(Country country, GPS gps) {
        this.country = country;
        this.gps = gps;
    }
}

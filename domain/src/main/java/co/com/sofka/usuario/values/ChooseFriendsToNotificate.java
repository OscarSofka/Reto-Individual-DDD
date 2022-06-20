package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class ChooseFriendsToNotificate implements ValueObject<ChooseFriendsToNotificate> {
    private final ChooseFriendsToNotificate chooseFriendsToNotificateValue;

    public ChooseFriendsToNotificate(ChooseFriendsToNotificate chooseFriendsToNotificateValue) {
        this.chooseFriendsToNotificateValue = chooseFriendsToNotificateValue;
    }

    @Override
    public ChooseFriendsToNotificate value() {
        return null;
    }
}

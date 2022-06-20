package co.com.sofka.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

public class AccountDateOfCreation implements ValueObject<AccountDateOfCreation> {
    private final AccountDateOfCreation accountDateOfCreationValue;

    public AccountDateOfCreation(AccountDateOfCreation accountDateOfCreationValue) {
        this.accountDateOfCreationValue = accountDateOfCreationValue;
    }


    @Override
    public AccountDateOfCreation value() {
        return null;
    }
}

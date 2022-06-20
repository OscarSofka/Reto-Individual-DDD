package co.com.sofka.usuario;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.usuario.events.OwnerProfileCreated;
import co.com.sofka.usuario.usecases.CreateUserUseCase;
import co.com.sofka.usuario.values.EmailAddress;
import co.com.sofka.usuario.values.UserName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreateUserUseCaseTest {
    @Test
    void CreateUser(){
        //arrange
        UserName userName = new UserName("OscarMartin");
        EmailAddress emailAddress = new EmailAddress("oscar@sofka.com.co");
        var command = new CreateUserCommand(userName,emailAddress);
        var usecase = new CreateUserUseCase();

        //act
        var events = UseCaseHandler.getInstance().
                syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event =(OwnerProfileCreated)events.get(0);
        Assertions.assertEquals("OscarMartin", event.getUserName().value());
        Assertions.assertEquals("oscar@sofka.com.co",event.getEmailAddress().value());
    }

}

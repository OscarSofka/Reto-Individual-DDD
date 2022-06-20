package co.com.sofka.Account.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.usuario.command.AddFriend;
import co.com.sofka.usuario.events.OwnerProfileCreated;
import co.com.sofka.usuario.values.EmailAddress;
import co.com.sofka.usuario.values.UserName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddFriendUseCaseTest {
    @Test
    void AddFriend(){
        //arrange
        UserName sendUserName = new UserName("oscar");
        UserName recieveUserName = new UserName("julian");
        EmailAddress sendEmailAddress= new EmailAddress("oscar@sofka.com.co");
        EmailAddress recieveEmailAddress= new EmailAddress("julian@sofka.com.co");
        var command = new AddFriendCommand(sendEmailAddress,recieveEmailAddress,sendUserName,recieveUserName);
        var usecase = new AddFriendUseCase();

        //act
        var events = UseCaseHandler.getInstance().
                syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event =(OwnerProfileCreated)events.get(0);
        Assertions.assertEquals("Oscar", event.getUserName().value());
        Assertions.assertEquals("julian", event.getUserName().value());
        Assertions.assertEquals("oscar@sofka.com.co", event.getEmailAddress().value());
        Assertions.assertEquals("julian@sofka.com.co", event.getEmailAddress().value());

    }
}

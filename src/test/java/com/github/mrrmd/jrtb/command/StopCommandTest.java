package com.github.mrrmd.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.mrrmd.jrtb.command.CommandName.STOP;
import static com.github.mrrmd.jrtb.command.StopCommand.STOP_MESSAGE;

@DisplayName("Unit-level testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
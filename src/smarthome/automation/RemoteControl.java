package smarthome.automation;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command[] increaseCommands;
    private Command[] decreaseCommands;

    public RemoteControl(int numSlots) {
        onCommands = new Command[numSlots];
        offCommands = new Command[numSlots];
        increaseCommands = new Command[numSlots];
        decreaseCommands = new Command[numSlots];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void setIncreaseDecreaseCommands(int slot, Command increaseCommand, Command decreaseCommand) {
        increaseCommands[slot] = increaseCommand;
        decreaseCommands[slot] = decreaseCommand;
    }

    public void onButtonPressed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
        }
    }

    public void offButtonPressed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
        }
    }

    public void increaseButtonPressed(int slot) {
        if (increaseCommands[slot] != null) {
            increaseCommands[slot].execute();
        }
    }

    public void decreaseButtonPressed(int slot) {
        if (decreaseCommands[slot] != null) {
            decreaseCommands[slot].execute();
        }
    }
}

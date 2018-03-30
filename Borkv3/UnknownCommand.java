
package zeitz_borkv3;

class UnknownCommand extends Command {

    private String bogusCommand;

    UnknownCommand(String bogusCommand) {
        this.bogusCommand = bogusCommand;
    }

    String execute() {
        return "I'm not sure what you mean by \"" + bogusCommand + "\".\n";
    }
}

public class OpenCommand implements Command {
    private Account account;
    
    public OpenCommand(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.open();
    }
}


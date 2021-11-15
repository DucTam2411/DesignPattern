public class DeleteCommand implements Command {

    private Account account;

    public DeleteCommand(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.delete();
    }
}
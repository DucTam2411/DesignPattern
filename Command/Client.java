public class Client {
    public static void main(String[] args) {
        Account account = new Account("sieunhan");

        Command open = new OpenCommand(account);
        Command close = new DeleteCommand(account);
        BankApp bankApp = new BankApp(open, close);
        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
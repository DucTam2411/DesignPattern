public class Client {
    public static void main(String[] args) {
        User user = new User("hels@gmail.com", "sieunhan");
        Subscriber logger = new Logger();
        AccountService accountService = new AccountService(user);

        accountService.addSubscriber(logger);
        accountService.changeEmail("sieunhand@gmai.com");
    }
}

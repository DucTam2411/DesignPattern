public class Logger implements Subscriber {

    @Override
    public void update(User user) {
        System.out.println("Logger: " + user.getName() + "\n" + user.getEmail());
    }
}

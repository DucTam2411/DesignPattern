import java.util.ArrayList;
import java.util.List;

public class AccountService implements Publisher {

    List<Subscriber> subscribers  = new ArrayList<>();
    User user;
    

    public AccountService(User user){
        this.user = user;
    }



    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubsribers() {
        for( Subscriber subscriber : subscribers){
            subscriber.update(user);
        }
        
    }

    void changeEmail(String email){
        user.setEmail(email);
        notifySubsribers();
    }
    
}

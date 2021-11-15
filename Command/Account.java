
public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Account [" + name + "] Opened\n");
    }
    
    
    public void delete() {
        System.out.println("Account [" + name + "] Deleted\n");
    }
}



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Description> list = new ArrayList<>();
        list.add(new User("user1"));
        list.add(new Account(1));
        list.add(new User("user2"));
        list.add(new Account(2));
        for(Description description:list){
            description.printDescription();
        }
    }
}

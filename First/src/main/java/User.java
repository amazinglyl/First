public class User implements Description {
    private String name;
    public User(String name_){
        name=name_;
    }
    public void printDescription(){
        System.out.println(name);
    }
}

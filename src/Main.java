public class Main {
    static MyName myName = new MyName();
    public static void main(String[] args) {
        String a="ketimi";
        String b="ketimi";
        myName.printMyName("Madina");
        myName.makeSound();

        User user = new User("Madina@gmail.com","dina");
        System.out.println("user.toString() = " + user.toString());

    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}
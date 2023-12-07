public class Main {
    static MyName myName = new MyName();
    public static void main(String[] args) {
        String a="ketimi";
        String b="ketimi";
        myName.printMyName("Madina");
        User user=new User("kamoliddin@gmail.com","123456");
        System.out.println(user.toString());
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}
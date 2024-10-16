package school;

public class UserTest {
    public static void main(String[] args){
        User user = new User();
        Student student = new Student();

        user.setId(1);
        System.out.println(user.getId());

        user.setName("Carlos");
        String name = user.getName();
        System.out.println(name);

        user.setMail("carlosfranco63.cf@gmail.com");
        System.out.println(user.getMail());

    }
}

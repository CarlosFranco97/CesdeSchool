package school;

public class User {
    private int id;
    private String name;
    private String mail;

    //Constructores:
    public User(){

    }

    //Getters and Setters;

    public int getId(){
        return this.id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void createUser() {
        System.out.println("Metodo creacion de usuario");
    }

    public void listUser() {
        System.out.println("Metodo listado de usuario");
    }
}

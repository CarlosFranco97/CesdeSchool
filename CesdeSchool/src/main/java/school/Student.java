package school;

public class Student extends User{
    String type;

    public void createUser() {
        super.createUser();
    }

    public void listUser(){
        super.listUser();
    }

    //polimorfismo por sobrecarga de metodos (Method Overload)
    public boolean indedityUser(){
        boolean identified = true;
        return identified;
    }

    public boolean indentified(String qr){
        boolean identified = true;
        return identified;
    }
}

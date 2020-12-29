package inheritance.exercises;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen() {
        return !(this.age < 13 || this.age > 19);
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return this.firstName + " " + this.lastName;
        } else if( this.firstName.isEmpty()) {
            return this.firstName;
        } else if (this.lastName.isEmpty()) {
            return this.lastName;
        } else {
            return "";
        }
    }
}

class Main {
    public static void main(String[] args) {
        Person john = new Person();

//        john.setFirstName("John");
//        john.setLastName("Lahem");
        john.getFullName();
        System.out.println(john.getFullName());
    }
}

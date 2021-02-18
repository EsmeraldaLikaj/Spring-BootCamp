package ExcerciseThree;

public class Admin extends Person{

    private Role role;

    public Admin(String firstName, String lastName, int age, Role role) {
        super(firstName, lastName, age);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

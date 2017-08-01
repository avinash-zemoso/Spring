package demo;
import javax.persistence.*;


/**
 * Created by zemoso on 1/8/17.
 */
@Entity
@Table(name = "customer")
public class Customer {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "age")
    private int age;

    protected Customer() {
    }

    public Customer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "id:" + id + "," +
                "firstName:"+ firstName + "," +
                "lastName:"+ lastName + ","+
                "age:"+ age;
    }

}

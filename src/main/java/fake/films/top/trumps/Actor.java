package fake.films.top.trumps;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "actor")
public class Actor {
    //Attributes--------------------------------------------------------

    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;


    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @ManyToMany(mappedBy = "actors")
    Set<Film> films;

    //Constructors----------------------------------------------------------------------------------------

    public Actor(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor() {

    }


    //Methods-----------------------------------------------------------------------------------------------
    public int getActorId() {
        return this.actorId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Actor id = ");
        output.append(this.actorId);
        output.append(" first name = ");
        output.append(this.firstName);
        output.append(" last name = ");
        output.append(this.lastName);
        return output.toString();
    }

}

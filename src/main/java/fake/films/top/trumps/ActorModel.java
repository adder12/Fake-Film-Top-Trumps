package fake.films.top.trumps;
import java.util.Set;
public class ActorModel {

int actorId;

String firstName;

String lastName;

Set<Film> films;

//Constructors----------------------------------------------------------------------------------------

    public ActorModel(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ActorModel() {

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

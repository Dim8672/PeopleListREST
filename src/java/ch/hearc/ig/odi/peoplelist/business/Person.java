package ch.hearc.ig.odi.peoplelist.business;

import java.util.Date;
import java.util.Properties;
import javax.validation.constraints.NotNull;

/**
 *
 * @author dimitri.mella
 */
public class Person {

    private Long id;
    private String gender;
    private String firstName;
    private String lastName;
    //@NotNull(message=...) pour interdire le null
    private Boolean married;
    private Date birthDate;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}

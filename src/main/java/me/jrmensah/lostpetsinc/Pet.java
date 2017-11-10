package me.jrmensah.lostpetsinc;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Size(min=2, message = "Please enter at least {min} characters")
    private String name;

    @NotNull
    @Size(min=3, message = "Please enter the age of your lost pet")
    private String age;

    @NotNull
    @Size(min=3, message = "Please enter the type of animal of your lost pet")
    private String type;

    @NotNull
    @Size(min=3, message = "Please enter the breed of your lost pet or type N/A")
    private String breed;

    @NotNull
    @Size(min=3, message = "Please enter the color of your lost pet")
    private String colour;

    @NotNull
    @Size(min=3, message = "Please enter any distinguishing features of your lost pet or type N/A")
    private String features;

    @NotNull
    @Size(min=3, max=10, message= "Please enter phone number")
    private String phoneNum;

    @NotNull
    @Size(min=4, message = "Please indicate whether pet is lost or found")
    private String status;


    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age) {

        this.age = age;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed) {

        this.breed = breed;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getFeatures()
    {
        return features;
    }

    public void setFeatures(String features)
    {
        this.features = features;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {

        this.phoneNum = phoneNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


public class Pet {

    private String petName;
    private int petAge;
    private String petLocation;
    private String petType;

//empty constructor
    public Pet(){
    }

//constructor all attributes
    public Pet(String petName, int petAge, String petLocation, String petType) {
        this.petName = petName;
        this.petAge = petAge;
        this.petLocation = petLocation;
        this.petType = petType;
    }

    //get method
    public String getPetName() {
        return petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public String getPetType() {
        return petType;
    }

    //set methods
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void setPetLocation(String petLocation) {
        this.petLocation = petLocation;
    }
}


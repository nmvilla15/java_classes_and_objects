
public class MariahCarey {

    private String nickName;
    private String occupation;
    private int age;
    private boolean fiveOctaveRange;


    //empty constructor
    public MariahCarey(){
    }

    //constructor that uses 2 variables
    public MariahCarey(String nickName, String occupation) {
        this.nickName = nickName;
        this.occupation = occupation;
    }

    //constructor that uses all of the variables
    public MariahCarey(String nickName, String occupation, int age) {
        this.nickName = nickName;
        this.occupation = occupation;
        this.age = age;
    }


    //get methods
    public String getNickName() {
        return nickName;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAge() {
        return age;
    }


    //set methods
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //a method to return a string
    public void allDis(String nickName, String occupation, int age){
        System.out.println("The worlds greatest " + occupation + ", otherwise known as " + nickName + ", is " + age + " this year.");
    }

    //a method to return a boolean
    public boolean isFiveOctaveRange(){
        return true;
    }
}

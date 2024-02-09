//Programmers: Molly Kyle
//Course: CS 212 Mr. Nweke
//Due Date: 2/8/24
//Lab Assignment: Class Assignment
//Problem Statement:
//Input:
//Output:
//Credits:
public class marioKart { //Start of class
   //public static void main(String[] args) {

        //System.out.println("Mario Kart!");
    //Data fields
    private String playerName;
    private String character;
    private int speed;

    //General Constructor (parameterized)

    public marioKart(String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    //Default Constructor with default values
    public marioKart() {
        this.playerName = "Unknown";
        this.character = "Mario";
        this.speed = 100;
    }

//METHODS
    //Boost speed method
    public int boostSpeed(){
        speed += 50;
        System.out.println("Now your character " + character + " has a speed of " + speed);
        return speed;
    }

    //Output info method
    public void outputInfo() {
        System.out.println("Hi " + playerName + "! You're playing with the character " + character + " who has a speed of " + speed);
    }


    //MAIN METHOD
    public static void main (String [] args) {
        //Create FunkyKong
        marioKart funkykong = new marioKart("Gabe", "FunkyKong", 100);

        //Outputs for FunkyKong
        funkykong.outputInfo();

        //Boost speed
        System.out.println("Let's boost your speed!");
        funkykong.boostSpeed();
        System.out.println();



        //Create Daisie
        marioKart toad = new marioKart("Molly", "Toad", 100);

        //Outputs for Toad
        toad.outputInfo();


        System.out.println("Let's boost your speed!");
        //Boost speed
        toad.boostSpeed();
        System.out.println();




    }

}

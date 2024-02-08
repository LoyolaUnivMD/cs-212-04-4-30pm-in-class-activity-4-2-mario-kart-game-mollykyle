//Programmers: Molly Kyle
//Course: CS 212 Mr. Nweke
//Due Date: 2/8/24
//Lab Assignment: Class Assignment
//Problem Statement:
//Input:
//Output:
//Credits:
public class MarioKartPlayer { //Start of class
   // public static void main(String[] args) {

        System.out.println("Mario Kart!");
    //Data fields
    private String playerName;
    private String character;
    private int speed;

    //General Constructor (parameterized)

    public MarioKartPlayer(String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    //Default Constructor with default values
    public MarioKartPlayer() {
        this.playerName = "Mario";
    }
}

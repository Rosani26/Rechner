
import java.util.Scanner;
public class Herzschlag {

    private int heartBeatsPerMin;
    private int heartBeatsTotal;
    private final double minperYear = 365.25 * 24 * 60;
    private int age;
    private String output;
    public Herzschlag() {

        this.heartBeatsPerMin = 0;
        this.age = 0;
    }

    public Herzschlag(int heartbeatsPerMin, int age) {

        this.heartBeatsPerMin = heartbeatsPerMin;
        this.age = age;
    }

    public void readin() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your heartbeats per minute: ");
        heartBeatsPerMin = keyboard.nextInt();
        System.out.println("Enter your age: ");
        age = keyboard.nextInt();
        keyboard.close();
    }


    public void calculate() {
        heartBeatsTotal = (int) (heartBeatsPerMin * minperYear * age);
    }

    public String toString() {

        return output = "Your total heartbeats: " + (int) heartBeatsTotal;
    }

    public static void main(String[] args) {
        // objekt intanzieren
        Herzschlag heartbeats = new Herzschlag();
        // Einlesen
        heartbeats.readin();
        //System.out.println(" Enter your Heartbeats Per Min");
        //heartBeatsPerMin = keyboard.nextInt();
        // Verarbeitung
        heartbeats.calculate();
        //System.out.println("Please enter an age in years:");
        //age = keyboard.nextInt();
        // Ausgabe
        System.out.println(heartbeats.toString());
    }

}



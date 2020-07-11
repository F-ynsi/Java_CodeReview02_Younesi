import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String pushUpdes = "Place your hands on the floor. Raise up onto your toes so " +
                "that all of your body weight is on your hands and your feet." +
                " Bend your elbows and lower your chest down toward the floor." +
                " Then, push off the floor and extend them so that you return to starting position";

        String planksDes = "Start on the floor on your hands and knees. Lower your forearms to the " +
                "floor with elbows positioned under your shoulders and your hands shoulder-width" +
                " apart. Maintain a straight line from heels through the top of your head, looking" +
                " down at the floor. Now, tighten your abs and hold.";

        String squatsDes = "Stand with feet a little wider than shoulder-width apart, hips stacked over" +
                " knees, and knees over ankles. Extend arms out straight so they are parallel with the" +
                " ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, " +
                "driving through heels.";

        String backWardKickdes = "Get in an all-fours position with your knees and hands on the floor. " +
                "Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in " +
                "the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree" +
                " angle in between the legs. Return to the starting position and repeat.";

        String legCurldes = "Stand up on, shift your weight to  one feet and pull another heel toward your " +
                "buttocks. Stay for 15 seconds, then repeat with your other leg.";

        String backstretchdes = "Go into standing position, put your hands on your hips and then " +
                "stretch with one hand over your head to the opposite side. Repeat with other hand.";



        //6 objects
        Exercise pushUps = new Exercise("Push-ups", pushUpdes, 30, "floor");
        Exercise planks = new Exercise("Planks", planksDes, 90, "floor");
        Exercise squats = new Exercise("Squats", squatsDes, 45, "standup");
        Exercise backwardKick = new Exercise("Backward Kick", backWardKickdes, 60, "floor");
        Exercise legCurl = new Exercise("Leg Curl", legCurldes, 90, "standup");
        Exercise backstretch = new Exercise("Back Stretch", backstretchdes, 60,"standup");

        //objects into an array and called my printing method in the loop
        ArrayList <Exercise> myExercises = new ArrayList<Exercise>(Arrays.asList(pushUps, planks, squats, backwardKick,
                legCurl, backstretch));


        //print method (using formatting)
        for (Exercise element: myExercises) {
            System.out.printf("%-30s DURATION: %d seconds.%n------------------------------------------------- %nDESCRIPTION: %s%n%n%n",
                    element.name, element.duration, element.description);
        }


        //Create a new loop and print only:
        System.out.println("Exercises on the floor: ");
        for (Exercise element: myExercises) {
            if (element.position=="floor") {
                System.out.println(element.name);

            }
        }

        System.out.println("Exercises on the floor and longer than a minute: ");
        for (Exercise element: myExercises) {
            if (element.position=="floor" && element.duration>60) {
                System.out.println(element.name);

            }
        }


    }
}

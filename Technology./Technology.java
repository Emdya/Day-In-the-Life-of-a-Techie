import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class Technology {
    public static void main (String[]args) { //Main method will use switch case statements, to display a menu of options.
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n** Day in the Life of a Tech Enthusiast");
            System.out.println("1 - Morning: Preparing for a Hackathon");
            System.out.println("2 - Afternoon: Debugging Code");
            System.out.println("3 - Evening: Planning Hackathon Travel");
            System.out.println("4 - Late-Night: Post-Coding Workout");
            System.out.println("5 - Contacting Programmers");
            System.out.println("6 - Weekend: 3D-Printing Polygons");
            System.out.println("0 - Exit");

            System.out.print("Choose an activity: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    morningRoutine();
                    break;
                case 2:
                    DeBuggingAlgorithm();
                    break;
                case 3:
                    travelCostsForHackathon();
                    break;
                case 4:
                    lateNightWorkouts();
                    break;
                case 5:
                    phoneNumbers();
                    break;
                case 6:
                    weekendProject();
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
            }
        } while (choice != 0) ;
    }
    public static void morningRoutine(){  //Method for preparing for a hackathon, presumably in the morning.
        /* The following code asks the user for input, utilizing the scanner class, to type in the number of items
        , as well as the type of technologies they will need for an upcoming hackathon.
         */
        Scanner input = new Scanner(System.in);
        //Declaration of variables
        ArrayList<String> items = new ArrayList <>();
        String firstName;
        int numberOfItems;
        String techItem;
        String store;

        System.out.println("Enter your name:"); //Prompting the user to enter their first name
        firstName = input.next(); //Using next() instead of nextLine(), assuming user will enter one word.

        System.out.println("How many items do you need to buy?");//Prompting the user to enter number of items.
        numberOfItems = input.nextInt();

        System.out.println("Enter the tech tools needed for your upcoming projects: ");
        for (int i = 0; i< numberOfItems; i++){
            techItem = input.next();
            items.add(techItem);
        }
        //techItem = input.next(); //Prompting the user to enter the specific name of a tool for their hackathon projects.

        System.out.println("Where are you shopping today?");
        store = input.next(); //Stores the user's response in the String variable store.

        System.out.println(firstName + " buys " + numberOfItems + " different types of tech items at " + store + " for the upcoming hackathon ");
        //Prints out a concatenated print statement, of the user's responses.
    }
    public static void DeBuggingAlgorithm () { //Method for debugging one's code for a hackathon project.
        Scanner input = new Scanner(System.in);
        int initialBugs, bugsPerFix;
        System.out.println("Enter the number of bugs found within the code: ");
        initialBugs = input.nextInt();
        System.out.println("Enter the average number of bugs you fix (per iteration");
        bugsPerFix = input.nextInt();

        initialBugs /= bugsPerFix;
        int iteration1 = initialBugs; //Will store the value of the number of bugs found within the code, into iteration 1.
        int iteration2 = iteration1/ bugsPerFix; //Based on the average number of bugs fixed per iteration, we can find the number of bugs left for debugging.
        int iteration3 = iteration2/ bugsPerFix;//Similar to iteration2.

        System.out.println("After debugging: " + iteration1 + "bugs left after first round, " + iteration2 + " after second, and " + iteration3 + " after third. ");
        //Will print to console, the number of bugs per each iteration.

    }
    public static void travelCostsForHackathon() { //Code to plan for a hackathon for you and friends, while also calculating cost in terms of distance.
        Scanner input = new Scanner(System.in);
        double milesPerGallon, gasCost;
        double[] distances = {20,75,500}; //Array of distances
        System.out.println("Enter your car's miles per gallon: ");
        milesPerGallon = input.nextDouble();
        System.out.println("Enter the cost of gas per function: ");
        gasCost = input.nextDouble();
        //Calculations: Gas cost = (miles/milesPerGallon) * gasCost
        for (double distance: distances){
            System.out.printf("Gas cost for traveling %.0f miles: $%.2f\n", distance, (distance/milesPerGallon) * gasCost);
        }
        //System.out.printf("Gas cost for traveling to the hackathon when 20 miles away: $%.2f\n",(20/milesPerGallon) * gasCost);
        //System.out.printf("Gas cost for traveling to the hackathon when 75 miles away: $%.2f\n",(75/milesPerGallon) * gasCost);
        //System.out.printf("Gas cost for traveling to the hackathon if 500 miles away; $%.2f\n",(500/milesPerGallon) * gasCost);
    }
    public static void lateNightWorkouts(){ //Roughly calculates calories burned after working out.
        Scanner input = new Scanner(System.in);
        int age;
        double weight, heartRate, exerciseDuration;
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Enter your weight in pounds: ");
        weight = input.nextDouble();
        System.out.println("Enter your average heart rate during exercise");
        heartRate = input.nextDouble();
        System.out.println("Enter the exercise duration in minutes");
        exerciseDuration = input.nextDouble();
        //Calories Burned calculation
        double caloriesBurned = ((age * 0.2757 + weight * 0.03295 + heartRate * 1.0781 - 75.4991) * exerciseDuration)/8.368;
        System.out.printf("You burned %.2f calories after a late-night coding session.\n", caloriesBurned);
    }
    public static void phoneNumbers(){ //Method for formatting a phone number to " xxx xxx-xxxx"
        Scanner input = new Scanner(System.in);
        HashMap <Long, String> areaCodeMap = new HashMap<>();
        long phoneNumber, lineNumber, prefix, areaCode;
        //A map with example area codes and descriptions
        areaCodeMap.put(305L, "Miami, Florida");
        areaCodeMap.put(212L, "New York City, New York");
        areaCodeMap.put(702L, "Las Vegas, Nevada");
        areaCodeMap.put(202L, "Washington, DC");
        areaCodeMap.put(310L, "Los Angeles, California");
        areaCodeMap.put(949L, "Irvine, California");
        areaCodeMap.put(727L, "Boca Raton, Florida");
        areaCodeMap.put(321L, "Cocoa, Florida");
        areaCodeMap.put(386L, "Daytona");
        areaCodeMap.put(863L, "Avon Park, Florida");
        areaCodeMap.put(561L, "Boynton Beach, Florida");

        System.out.println("Enter your phone number(10 digits)");
        phoneNumber = input.nextLong();
        lineNumber = phoneNumber % 10000;
        phoneNumber/= 10000;
        prefix = phoneNumber % 1000;
        phoneNumber /= 1000;
        areaCode = phoneNumber;

        System.out.println("You can contact the hacker at: (" + areaCode + ")" + prefix + "-" + lineNumber);
        if(areaCodeMap.containsKey(areaCode)){
            System.out.println("Area Code " + areaCode + " corresponds to " + areaCodeMap.get(areaCode));
        }
        else{
            System.out.println("Area Code " + areaCode + " not found in the map");
        }
    }
    public static void weekendProject(){ //Method for a 3D-printed Polygon design. Method provides the area measurements, utilizing the formula for the area of a polygon.
        Scanner input = new Scanner(System.in);
        int numSides;
        double sideLength;

        System.out.println("Enter the number of sides for your 3D design: ");
        numSides = input.nextInt();

        System.out.println("Enter the length of the side: ");
        sideLength = input.nextInt();

        double area = (numSides * Math.pow(sideLength, 2)/ (4 * Math.tan(Math.PI/numSides)));
        System.out.printf("The area of your 3D polygon design is: %.2f square units\n", area);
    }
}

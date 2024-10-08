/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modifications by S. Ramos 2024
    
*/

public class TestFanApp {
    public static void main(String[] args) {
        // Create a fan using the no-argument constructor
        Fan defaultFan = new Fan();

        // Create a fan using the argument constructor
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");

        // Display the fans' states using the toString method
        System.out.println("Default Fan:");
        System.out.println(defaultFan.toString());

        System.out.println("\nCustom Fan:");
        System.out.println(customFan.toString());
    }
}

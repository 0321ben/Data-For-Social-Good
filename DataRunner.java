public class DataRunner {
    public static void main(String[] args) {
        // Create a UserStory object to describe the user's needs
        UserStory userStory = new UserStory("a car salesman", "analyze which type of vehicles are sold more", "increase sales performance");

        // Print the user story
        System.out.println(userStory);

        // Create a VehicleData object to load the preferences from the file
        VehicleData vehicleData = new VehicleData("Preferences.txt");

        // Count occurrences of "Car" and "Truck" in the dataset
        int carCount = vehicleData.countVehicles("Car");
        int truckCount = vehicleData.countVehicles("Truck");

        // Print out the general information about the dataset
        System.out.println(vehicleData);

        // Print the count of Cars and Trucks
        System.out.println("Cars Sold: " + carCount);
        System.out.println("Trucks Sold: " + truckCount);

        // Compare the counts and print which was sold more
        if (carCount > truckCount) {
            System.out.println("More cars were sold.");
        } else if (truckCount > carCount) {
            System.out.println("More trucks were sold.");
        } else {
            System.out.println("Cars and trucks were sold in equal amounts.");
        }
    }
}
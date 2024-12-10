public class VehicleData {
    private String[] vehiclePreferences;  // 1D array to store vehicle preferences (Car/Truck)
    private int[] vehicleCount;           // 1D array to store counts of "Car" and "Truck"

    // No-argument constructor
    public VehicleData() {
        vehiclePreferences = new String[0];  // Empty array for default
        vehicleCount = new int[2];  // Default count for Car and Truck
    }

    // Parameterized constructor
    public VehicleData(String Preferences) {
        vehiclePreferences = toStringArray(Preferences);  // Read from file
        vehicleCount = new int[2];  // Default count for Car and Truck

        // Count occurrences of Car and Truck
        for (String vehicle : vehiclePreferences) {
            if (vehicle.equalsIgnoreCase("Car")) {
                vehicleCount[0]++;  // Increment car count
            } else if (vehicle.equalsIgnoreCase("Truck")) {
                vehicleCount[1]++;  // Increment truck count
            }
        }
    }

    // Method to count how many times a specific vehicle type appears in the dataset (e.g., "Car" or "Truck")
    public int countVehicles(String vehicleType) {
        int count = 0;
        for (String vehicle : vehiclePreferences) {
            if (vehicle.equalsIgnoreCase(vehicleType)) {
                count++;
            }
        }
        return count;
    }

    // Method to get the most chosen vehicle (either "Car" or "Truck")
    public String mostChosenVehicle() {
        if (vehicleCount[0] > vehicleCount[1]) {
            return "Car";  // If Car count is greater
        } else if (vehicleCount[1] > vehicleCount[0]) {
            return "Truck";  // If Truck count is greater
        } else {
            return "Equal";  // If both counts are the same
        }
    }

    // Method to provide a suggestion based on the data
    public String salesPromotionSuggestion() {
        // If Trucks are chosen more, suggest promotions for Cars
        if (vehicleCount[0] < vehicleCount[1]) {
            return "With this information, as car salespeople, we can implement more deals, advertisements, and promotions to boost car sales since they have fewer sales than trucks.";
        } else {
            return "Sales are balanced. No immediate promotional action is needed.";
        }
    }

    // toString method to provide detailed information about the dataset
    public String toString() {
        return "Dataset contains " + vehiclePreferences.length + " vehicle preferences. Most chosen vehicle: " + mostChosenVehicle();
    }

    // FileReader method to read data from a file and return it as a 1D array of Strings
    public static String[] toStringArray(String Preferences) {
        return new FileReader().toStringArray(Preferences);  // Reads file and returns array
    }
}
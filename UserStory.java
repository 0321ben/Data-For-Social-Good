public class UserStory {
    private String role;  // Role description
    private String objective;  // Goal to accomplish
    private String outcome;  // Desired benefit

    // Initializes UserStory with role, objective, and outcome
    public UserStory(String role, String objective, String outcome) {
        this.role = role;
        this.objective = objective;
        this.outcome = outcome;
    }

    // Produces a descriptive sentence of the user story
    public String toString() {
        return "As " + role + ", we want to " + objective + " so that we can " + outcome + ".";
    }
}
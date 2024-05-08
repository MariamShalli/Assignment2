package assignment2.organizations.party;

/**
 * Represents an election.
 */
public class Election {
    private int votersNumber; // Number of voters participating in the election
    private boolean fair; // Indicates whether the election is fair or not
    private String description; // Description of the election

    /**
     * Constructs an Election object with default values.
     */
    public Election() {
        // Default constructor
    }

    /**
     * Constructs an Election object with specified parameters.
     * @param votersNumber Number of voters participating in the election
     * @param fair Indicates whether the election is fair or not
     * @param description Description of the election
     */
    public Election(int votersNumber, boolean fair, String description) {
        this.votersNumber = votersNumber;
        this.fair = fair;
        this.description = description;
    }

    /**
     * Get the number of voters participating in the election.
     * @return Number of voters
     */
    public int getVotersNumber() {
        return votersNumber;
    }

    /**
     * Set the number of voters participating in the election.
     * @param votersNumber Number of voters
     */
    public void setVotersNumber(int votersNumber) {
        this.votersNumber = votersNumber;
    }

    /**
     * Check if the election is fair.
     * @return True if fair, false otherwise
     */
    public boolean isFair() {
        return fair;
    }

    /**
     * Set the fairness of the election.
     * @param fair True if fair, false otherwise
     */
    public void setFair(boolean fair) {
        this.fair = fair;
    }

    /**
     * Get the description of the election.
     * @return Description of the election
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the election.
     * @param description Description of the election
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

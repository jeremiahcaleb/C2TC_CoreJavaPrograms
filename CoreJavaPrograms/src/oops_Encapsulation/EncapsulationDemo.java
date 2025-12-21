package oops_Encapsulation;

public class EncapsulationDemo {

    // Instance variables (data hiding using private access)
    private String playerName;
    private int playerAge;
    private int jerseyNumber;

    // Getter and Setter for playerName
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Getter and Setter for playerAge
    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    // Getter and Setter for jerseyNumber
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    // toString() method to display object data
    @Override
    public String toString() {
        return "IPL Player Details [Name=" + playerName +
               ", Age=" + playerAge +
               ", Jersey No=" + jerseyNumber + "]";
    }
}

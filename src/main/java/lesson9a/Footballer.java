package lesson9a;

/**
 * @author dgorbachenko
 */
public class Footballer extends People {
    private String team;
    private int playerNumber;

    public Footballer(String team, int playerNumber ) {
        this.team = team;
        this.playerNumber = playerNumber;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getInfo(){
        return name + " " + surname + " " + getTeam() + getPlayerNumber();
    }
}

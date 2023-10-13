public class Player implements Information{
    public String nameOfPlayer;
    public String sportType;
    public int numberPosition;
    public String teamName;

    public Player(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }

    @Override
    public void getInfo() {

    }

    @Override
    public void getTeamName() {

    }
}

public class VolleyballPlayer extends Player{
    private int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.numberOfPoints = numberOfPoints;
    }

    public VolleyballPlayer(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }
}

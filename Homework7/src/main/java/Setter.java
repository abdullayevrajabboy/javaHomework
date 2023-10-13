public class Setter extends VolleyballPlayer{
    private int countOfSets;

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfSets = countOfSets;
    }

    public Setter(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }
}

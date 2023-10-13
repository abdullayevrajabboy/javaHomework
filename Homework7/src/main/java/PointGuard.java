public class PointGuard extends BasketballPlayer{
    private int countOfGuard;

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int numberOfGoals, int countOfGuard) {
        super(nameOfPlayer, sportType, numberPosition, teamName, numberOfGoals);
        this.countOfGuard = countOfGuard;
    }

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfGuard) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfGuard = countOfGuard;
    }

    public PointGuard(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }
}

public class GoalKeeper extends FootballPlayer{

    private int countOfSaves;

    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfSaves) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
        this.countOfSaves = countOfSaves;
    }

    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName, int countOfRedCard, int countOfYellowCard, int countOfGoals, int countOfSaves) {
        super(nameOfPlayer, sportType, numberPosition, teamName, countOfRedCard, countOfYellowCard, countOfGoals);
        this.countOfSaves = countOfSaves;
    }

    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, String teamName) {
        super(nameOfPlayer, sportType, numberPosition, teamName);
    }
}

package Player;

public class PlayerStatsTest {
    public static void main(String[] args) {
        FootballStats Aman = new FootballStats("Aman kumar", 900, 1000);
        CricketStats Biswas = new CricketStats("biswas kumar", 600, 25000);

        Aman.showFootballStats();
        Biswas.showCricketStats();
    }
}



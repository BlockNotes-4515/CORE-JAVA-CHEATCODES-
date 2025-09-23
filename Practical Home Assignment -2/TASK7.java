import java.util.Scanner;

// Base Team class
class Team {
    String name;
    int matchesPlayed;
    int wins;
    int draws;

    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    // Method to calculate points (to be overridden)
    int calculatePoints() {
        return 0; // Default
    }

    void displayPoints(String sport) {
        System.out.println("Team: " + name + " (" + sport + ") Points: " + calculatePoints());
    }
}

// CricketTeam class
class CricketTeam extends Team {
    CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return wins * 2 + draws * 1; // Cricket: win=2, draw=1
    }
}

// FootballTeam class
class FootballTeam extends Team {
    FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    int calculatePoints() {
        return wins * 3 + draws * 1; // Football: win=3, draw=1
    }
}

// Main class
public class TASK7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first team
        System.out.println("Enter first team details (Sport,Name,MatchesPlayed,Wins,Draws):");
        String[] team1 = sc.nextLine().split(",");
        String sport1 = team1[0];
        String name1 = team1[1];
        int matches1 = Integer.parseInt(team1[2]);
        int wins1 = Integer.parseInt(team1[3]);
        int draws1 = Integer.parseInt(team1[4]);

        // Input second team
        System.out.println("Enter second team details (Sport,Name,MatchesPlayed,Wins,Draws):");
        String[] team2 = sc.nextLine().split(",");
        String sport2 = team2[0];
        String name2 = team2[1];
        int matches2 = Integer.parseInt(team2[2]);
        int wins2 = Integer.parseInt(team2[3]);
        int draws2 = Integer.parseInt(team2[4]);

        Team t1 = null;
        Team t2 = null;

        // Create objects based on sport
        if (sport1.equalsIgnoreCase("Cricket")) {
            t1 = new CricketTeam(name1, matches1, wins1, draws1);
        } else if (sport1.equalsIgnoreCase("Football")) {
            t1 = new FootballTeam(name1, matches1, wins1, draws1);
        }

        if (sport2.equalsIgnoreCase("Cricket")) {
            t2 = new CricketTeam(name2, matches2, wins2, draws2);
        } else if (sport2.equalsIgnoreCase("Football")) {
            t2 = new FootballTeam(name2, matches2, wins2, draws2);
        }

        // Display points
        if (t1 != null) t1.displayPoints(sport1);
        if (t2 != null) t2.displayPoints(sport2);

        sc.close();
    }
}

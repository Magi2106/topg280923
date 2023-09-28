public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("De kolde krigere", 4);
        Team team2 = new Team("De Varmeste banditter", 4);
        Team team3 = new Team("kold krig part 2", 1);
        Team team4 = new Team("de kristne krigere", 2);
        Team team5 = new Team("Jesus and Co.", 4);
        Team team6 = new Team("knud og hans kollegaer", 3);
        Team team7 = new Team("Paludans disciple", 1);
       
        String[] team1PlayerNames = { "kurt", "bodil", "kenneth", "Maxibong"};
        team1.setPlayerNames(team1PlayerNames);

    
        String[] team2PlayerNames = { "pia", "bodil", "cruella", "dennis"};
        team2.setPlayerNames(team2PlayerNames);

         String[] team3PlayerNames = { "Kingkong"};
        team3.setPlayerNames(team3PlayerNames);

         String[] team4PlayerNames = { "jakob","Christian den hellige"};
        team4.setPlayerNames(team4PlayerNames);

         String[] team5PlayerNames = { "helligånden", "Maria", "Jesis", "Jesus"};
        team5.setPlayerNames(team5PlayerNames);

         String[] team6PlayerNames = { "bo", "olla", "Knud"};
        team6.setPlayerNames(team6PlayerNames);

         String[] team7PlayerNames = { "Rasmus"};
        team7.setPlayerNames(team7PlayerNames);

        System.out.println("Team 1: " + team1.getName() + " (" + team1.getNumberOfPlayers() + " players)");
        System.out.println("Players in Team 1:");
        for (String playerName : team1.getPlayerNames()) {
            System.out.println("- " + playerName);
        }

        System.out.println("\nTeam 2: " + team2.getName() + " (" + team2.getNumberOfPlayers() + " players)");
        System.out.println("Players in Team 2:");
        for (String playerName : team2.getPlayerNames()) {
            System.out.println("- " + playerName);
        }
         System.out.println("Team 3: " + team3.getName() + " (" + team3.getNumberOfPlayers() + " players)");
        System.out.println("Players in Team 3:");
        for (String playerName : team3.getPlayerNames()) {
            System.out.println("- " + playerName);
        }
         System.out.println("Team 4: " + team4.getName() + " (" + team4.getNumberOfPlayers() + " players)");
        System.out.println("Players in Team 4:");
        for (String playerName : team4.getPlayerNames()) {
            System.out.println("- " + playerName);
        }
         System.out.println("Team 5: " + team5.getName() + " (" + team5.getNumberOfPlayers() + " players)");
        System.out.println("Players in Team 5:");
        for (String playerName : team5.getPlayerNames()) {
            System.out.println("- " + playerName);
        }
         System.out.println("Team 6: " + team6.getName() + " (" + team6.getNumberOfPlayers() + " players)");
        System.out.println("Players in Team 6:");
        for (String playerName : team6.getPlayerNames()) {
            System.out.println("- " + playerName);
        }
         System.out.println("Team 7: " + team7.getName() + " (" + team7.getNumberOfPlayers() + " players)");
        System.out.println("Players in Team 7:");
        for (String playerName : team7.getPlayerNames()) {
            System.out.println("- " + playerName);
        }
    }
}






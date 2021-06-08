package logic.inner_classes;

import logic.inheritance.Player;
import logic.inheritance.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author Serhiy Dubovenko
 */
public class MethodLocalInnerClasses {


    protected void  printTeam(List<Player> listOfPlayer){
        class Team{
            private String name;
            private int yearOfFoundation;
            private List<Player> playerList;
            private String manager;
            private String coach;

            public Team() {
            }

            public Team(String name, int yearOfFoundation, List<Player> playerList, String manager, String coach) {
                this.name = name;
                this.yearOfFoundation = yearOfFoundation;
                this.playerList = playerList;
                this.manager = manager;
                this.coach = coach;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getYearOfFoundation() {
                return yearOfFoundation;
            }

            public void setYearOfFoundation(int yearOfFoundation) {
                this.yearOfFoundation = yearOfFoundation;
            }

            public List<Player> getPlayerList() {
                return playerList;
            }

            public void setPlayerList(List<Player> playerList) {
                this.playerList = playerList;
            }

            public String getManager() {
                return manager;
            }

            public void setManager(String manager) {
                this.manager = manager;
            }

            public String getCoach() {
                return coach;
            }

            public void setCoach(String coach) {
                this.coach = coach;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Team)) return false;
                Team team = (Team) o;
                return getYearOfFoundation() == team.getYearOfFoundation() && Objects.equals(getName(), team.getName()) && Objects.equals(getPlayerList(), team.getPlayerList()) && Objects.equals(getManager(), team.getManager()) && Objects.equals(getCoach(), team.getCoach());
            }

            @Override
            public int hashCode() {
                return Objects.hash(getName(), getYearOfFoundation(), getPlayerList(), getManager(), getCoach());
            }
        }

        Team t = new Team();
    }

    public static void main(String[] args) {
        List<Player> listOfPlayer = new ArrayList<>();
        listOfPlayer.add(new Player("Name1", "String1 lastName", 1989, null, null, 7, 1, true, null));
        listOfPlayer.add(new Player("Name2", "String2 lastName", 2005, null, null, 1, 2, true, null));
        listOfPlayer.add(new Player("Name3", "String3 lastName", 1910, null, null, 12, 5, true, null));

        MethodLocalInnerClasses lliClass = new MethodLocalInnerClasses();
        lliClass.printTeam(listOfPlayer);

    }
}

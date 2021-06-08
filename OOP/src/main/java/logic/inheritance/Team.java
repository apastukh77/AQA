package logic.inheritance;

import java.util.List;
import java.util.Objects;

/**
 * @author Serhiy Dubovenko
 */
public class Team  {

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
        return yearOfFoundation == team.yearOfFoundation && Objects.equals(name, team.name) && Objects.equals(playerList, team.playerList) && Objects.equals(manager, team.manager) && Objects.equals(coach, team.coach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFoundation, playerList, manager, coach);
    }

    public void printTeam(String path, Team team){
        System.out.println("print Team");
    }

    public static Team getTeamSquad(String path){
        return null;
    }



}

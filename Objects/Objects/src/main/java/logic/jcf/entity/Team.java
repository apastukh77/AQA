package logic.jcf.entity;

import java.util.Objects;

/**
 * @author Serhiy Dubovenko
 */
public class Team {

    private String teamName;
    private int mp;
    private int w;
    private int d;
    private int l;
    private int g;
    private int points;

    public Team() {
    }

    public Team(String teamName, int mp, int w, int d, int l, int g, int points) {
        this.teamName = teamName;
        this.mp = mp;
        this.w = w;
        this.d = d;
        this.l = l;
        this.g = g;
        this.points = points;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", mp=" + mp +
                ", w=" + w +
                ", d=" + d +
                ", l=" + l +
                ", g=" + g +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team team = (Team) o;
        return getMp() == team.getMp() && getW() == team.getW() && getD() == team.getD() && getL() == team.getL() && getG() == team.getG() && getPoints() == team.getPoints() && Objects.equals(getTeamName(), team.getTeamName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeamName(), getMp(), getW(), getD(), getL(), getG(), getPoints());
    }
}

package logic.jcf.comparators;

import logic.jcf.entity.Team;

import java.util.Comparator;

/**
 * @author Serhiy Dubovenko
 */
public class TeamCompareRuleByPointsDesc implements Comparator<Team> {

    @Override
    public int compare(Team obj1, Team obj2) {
        if(obj1.getPoints()>obj2.getPoints()){
            return -1;
        }else if(obj1.getPoints()<obj2.getPoints()){
            return 1;
        }else{
            return 0;
        }
    }

}

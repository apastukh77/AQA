package logic.inner_classes;

import logic.inheritance.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Serhiy Dubovenko
 */
public class AnonymousInnerClasses {



    public static void main(String[] args) {
        List<Player> listOfPlayer = new ArrayList<>();
        listOfPlayer.add(new Player("Name1", "String1 lastName", 1989, null, null, 7, 1, true, null));
        listOfPlayer.add(new Player("Name2", "String2 lastName", 2005, null, null, 1, 2, true, null));
        listOfPlayer.add(new Player("Name3", "String3 lastName", 1910, null, null, 12, 5, true, null));

        Collections.sort(listOfPlayer, new Comparator<Player>() {
            @Override
            public int compare(Player player, Player t1) {
                return 0;
            }
        });

    }
}

package LearnStructures;

import java.util.EnumSet;

public class Set {
    private enum color {black, red, yellow};
    public static void main(String[] args) {
        java.util.HashSet<String> games = new java.util.HashSet<>();
        games.add("dmc");
        games.add("far cry");
        games.add("far cry");
        System.out.println(games);


        java.util.EnumSet c = EnumSet.of(color.black, color.red);
        System.out.println(c);
    }
}

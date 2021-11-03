package Data;

import java.util.ArrayList;

public class Idea {
    public static ArrayList <Idea> ideas = new ArrayList<>();

    private String ideaName;
    private String description;

    public Idea(String ideaName, String description) {
        this.ideaName = ideaName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" + ideaName + ", " + description + "}";
    }
}

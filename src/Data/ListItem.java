package Data;

import java.util.ArrayList;

public class ListItem {
    public static ArrayList <ListItem> items = new ArrayList<>();

    private String ideaName;
    private String description;

    public ListItem (String ideaName, String description) {
        this.ideaName = ideaName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" + ideaName + ", " + description + "}";
    }
}

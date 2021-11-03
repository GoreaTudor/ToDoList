package GUI.MainWindow.ListPart;

import Data.Idea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListItem implements ActionListener {

    public static ArrayList <ListItem> listItems = new ArrayList<>();

    private Idea idea;
    private JButton deleteButton;

    public ListItem (Idea idea) {
        this.idea = idea;

        deleteButton = new JButton();
        deleteButton.setIcon(new ImageIcon("src/Images/delete.png"));
        deleteButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ;
    }

    public Idea getIdea() {
        return idea;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }
}

package GUI.MainWindow;

import Data.Idea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowList_TestClass extends JButton implements ActionListener {

    ShowList_TestClass() {
        this.setText("display all");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Idea.ideas);
    }
}

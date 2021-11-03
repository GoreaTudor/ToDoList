package GUI.MainWindow;

import Data.ListItem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowList extends JButton implements ActionListener {

    ShowList() {
        this.setText("display all");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(ListItem.items);
    }
}

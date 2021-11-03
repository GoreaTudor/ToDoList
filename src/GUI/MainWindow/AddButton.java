package GUI.MainWindow;

import GUI.AddNewIdeaWindow.AddNewIdeaFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton implements ActionListener {

    ImageIcon icon = new ImageIcon("src/Images/plus.png");

    public AddButton () {
        this.setIcon(icon);
        this.setFocusable(false);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("AddButton pressed");
        AddNewIdeaFrame.viewFrame();
    }
}

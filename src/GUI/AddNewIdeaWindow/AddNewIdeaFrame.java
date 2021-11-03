package GUI.AddNewIdeaWindow;

import javax.swing.*;
import java.awt.*;

public class AddNewIdeaFrame extends JFrame {

    private static AddNewIdeaFrame frame = new AddNewIdeaFrame();

    private JLabel ideaNameLabel;
    private JTextField ideaNameField;
    private JLabel ideaDescriptionLabel;
    private JTextField ideaDescriptionField;
    private SubmitAddNewIdeaButton submitButton;

    private AddNewIdeaFrame() {
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Add new idea");
        this.setSize(new Dimension(300, 300));
        this.setLayout(new GridLayout(6, 0));

        ideaNameLabel = new JLabel("Idea:");
        ideaNameField = new JTextField();
        ideaDescriptionLabel = new JLabel("Some description:");
        ideaDescriptionField = new JTextField();
        submitButton = new SubmitAddNewIdeaButton();

        this.add(ideaNameLabel);
        this.add(ideaNameField);
        this.add(ideaDescriptionLabel);
        this.add(ideaDescriptionField);
        this.add(submitButton);

        this.setVisible(false);
    }


    public static AddNewIdeaFrame getFrame () {
        return frame;
    }

    public static void viewFrame () {
        frame.setVisible(true);
    }

    public static void hideFrame () {
        frame.setVisible(false);
    }


    public JTextField getIdeaNameField() {
        return ideaNameField;
    }

    public JTextField getIdeaDescriptionField() {
        return ideaDescriptionField;
    }
}

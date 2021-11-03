package GUI.AddNewIdeaWindow;

import Data.Idea;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitAddNewIdeaButton extends JButton implements ActionListener {

    public SubmitAddNewIdeaButton () {
        this.setText("Submit");
        this.setFocusable(false);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String idea = AddNewIdeaFrame.getFrame().getIdeaNameField().getText();
            String description = AddNewIdeaFrame.getFrame().getIdeaDescriptionField().getText();

            if (idea.equals("")) // the idea can not be empty
                throw new InvalidIdeaException();

            // Add the new idea to the list
            Idea.ideas.add(new Idea(idea, description));

            // reset the fields
            AddNewIdeaFrame.getFrame().getIdeaNameField().setText("");
            AddNewIdeaFrame.getFrame().getIdeaDescriptionField().setText("");

            System.out.println("New idea saved");
            AddNewIdeaFrame.hideFrame();

        } catch (InvalidIdeaException exception) {
            JOptionPane.showMessageDialog(null, "The idea field can not be empty!", "Idea not valid", JOptionPane.ERROR_MESSAGE);

        } catch (Exception exception) {
            exception.printStackTrace();
        }



    }
}

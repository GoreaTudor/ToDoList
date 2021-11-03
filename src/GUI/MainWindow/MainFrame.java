package GUI.MainWindow;

import GUI.MainWindow.ListPart.ListPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    private static MainFrame frame = new MainFrame();

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem saveItem;
    private JMenuItem loadItem;
    private JMenuItem exitItem;
    private JMenu helpMenu;
    private JMenuItem helpItem;

    private AddButton addButton;
    private ShowList_TestClass showListTestClass;
    private JPanel northPanel;
    private ListPanel centerPanel;


    private MainFrame () {

        /// SETTING UP MAIN FRAME ///
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("TO-DO List");
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());


        /// MENU BAR ///
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        saveItem = new JMenuItem("Save");
        loadItem = new JMenuItem("Load");
        exitItem = new JMenuItem("Exit");
        helpItem = new JMenuItem("Help");

        saveItem.setIcon(new ImageIcon("src/Images/save.png"));
        loadItem.setIcon(new ImageIcon("src/Images/load.png"));
        exitItem.setIcon(new ImageIcon("src/Images/exit.png"));
        helpItem.setIcon(new ImageIcon("src/Images/help.png"));

        saveItem.addActionListener(this);
        loadItem.addActionListener(this);
        exitItem.addActionListener(this);
        helpItem.addActionListener(this);

        fileMenu.add(saveItem);
        fileMenu.add(loadItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        helpMenu.add(helpItem);
        menuBar.add(helpMenu);


        /// NORTH PART ///
        northPanel = new JPanel();
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.LINE_AXIS));
        northPanel.setBackground(Color.DARK_GRAY);

        addButton = new AddButton();
        northPanel.add(addButton);

        showListTestClass = new ShowList_TestClass();
        northPanel.add(showListTestClass);


        /// CENTER PART ///
        centerPanel = new ListPanel();


        /// ADDING EVERYTHING TO MAIN FRAME ///
        this.setJMenuBar(menuBar);
        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.setVisible(true);

    }

    public static MainFrame getFrame () {
        return frame;
    }

    public static AddButton getAddButton () {
        return frame.addButton;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveItem) {        // saves data
            System.out.println("Save menu item");

        } else if (e.getSource() == loadItem) { // loads saved data
            System.out.println("Load menu item");

        } else if (e.getSource() == exitItem) { // exits the program
            System.out.println("Exit menu item");
            System.exit(0);

        } else if (e.getSource() == helpItem) { // opens help window
            System.out.println("Help menu item");

        }
    }
}

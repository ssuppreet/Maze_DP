import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends JFrame {
    JPanel panel = new JPanel();

    public Main() {
        initUI();
        quitButton();
        menu();
        fileChooser();
    }

    private void initUI() {
        JLabel label1 = new JLabel(
            "Selct the .csv file contaning the addresses to be geocoded...");
        label1.setBounds(0, 0, 500, 50);
        panel.add(label1); 
        getContentPane().add(panel);
        setSize(1000, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void quitButton() {

        // Quit Button

        panel.setLayout(null);
        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(0, 50, 80, 30);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        panel.add(quitButton);
        setTitle("Quit Button");
    }

    private void menu() {
        // Menu Bar

        // "File"
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Exit"); // eMenuItem
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        file.add(menuItem);
        menuBar.add(file);

        // "Credits"
        JMenu credits = new JMenu("Credits");
        JMenuItem about = new JMenuItem("About...");
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0); // TODO - New window, showing credits for
                        // project
            }
        });

        credits.add(about);
        menuBar.add(credits);
        setJMenuBar(menuBar);
    }

    private void fileChooser() {
        // FileChooser

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "CSV Files", "csv");
        chooser.setFileFilter(filter);
        chooser.setBounds(0, 75, 500, 300);
        panel.add(chooser);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Main ex = new Main();
        ex.setVisible(true);
    }
}
package ray1024.caverngenerator.gui;

import javax.swing.*;
import java.awt.*;

public class CavernGeneratorJFrame extends JFrame {
    private final CellularAutomatonJPanel cellularAutomatonJPanel = new CellularAutomatonJPanel();

    public CavernGeneratorJFrame(int width, int height) throws HeadlessException {
        super("Cavern Generator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setLayout(new BorderLayout());
        this.add(cellularAutomatonJPanel);
        GenerateJButton generateJButton = new GenerateJButton();
        generateJButton.addActionListener(actionEvent -> cellularAutomatonJPanel.getCellularAutomaton().refresh());
        this.add(generateJButton);
    }
}

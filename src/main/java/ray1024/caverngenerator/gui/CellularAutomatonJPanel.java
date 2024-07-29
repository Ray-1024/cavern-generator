package ray1024.caverngenerator.gui;

import ray1024.caverngenerator.celllular.CellularAutomaton;

import javax.swing.*;
import java.awt.*;

public class CellularAutomatonJPanel extends JPanel {
    private CellularAutomaton cellularAutomaton;

    public CellularAutomatonJPanel() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }

    public CellularAutomaton getCellularAutomaton() {
        return cellularAutomaton;
    }
}

package ray1024.caverngenerator.gui;

import javax.swing.*;
import java.awt.*;

public class CavernGeneratorJFrame extends JFrame {
    public CavernGeneratorJFrame(int width, int height) throws HeadlessException {
        super("Cavern Generator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
    }
}

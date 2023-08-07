package malinowski;

import javax.swing.*;
import java.awt.*;

public class CMainFrame extends JFrame {
    private JPanel panelmain;
    private JTextField textField1;
    private JTextField textField2;

    public CMainFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelmain);
        this.pack();
        this.setLocationRelativeTo(null);

    }
}


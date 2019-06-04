import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.FIRST_LINE_START;
import static java.awt.GridBagConstraints.NONE;

public class AdminOkno extends JFrame {
    private AdminGuziki lewa;
    private JScrollPane prawa;
    AdminOkno()
    {
        super("Panel admina");

        setLayout(new GridBagLayout());

        lewa = new AdminGuziki();
        prawa = new JScrollPane(new JTextArea("aaaaa"));
        prawa.setPreferredSize(new Dimension(400,400));
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill= NONE;

        gc.anchor=FIRST_LINE_START;
        gc.gridx=0;
        gc.gridy=0;
        gc.weightx=1;
        gc.weighty=1;
        Insets ins = new Insets(10,10,5,20);
        gc.insets=ins;
        add(lewa,gc);

        gc.insets = new Insets(10,5,10,10);
        gc.gridx=1;
        gc.weightx=3;
        add(prawa, gc);

        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

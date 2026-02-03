import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SmartHomeApplet extends Applet implements ActionListener {

    Button on, off;

    public void init() {
        on = new Button("ON");
        off = new Button("OFF");

        add(on);
        add(off);

        on.addActionListener(this);
        off.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == on)
            setBackground(Color.yellow);
        else
            setBackground(Color.black);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    PlannerFrame frame;

    CardLayout main_layout;
    JPanel main_panel;

    JPanel task_panel;
    JButton task_button;

    JPanel settings_panel;
    JButton settings_button;

    JPanel navigation_panel;

    public Main() {
        frame = new PlannerFrame(512, 512, "Planner");

        main_layout = new CardLayout();
        main_panel = new JPanel(main_layout);

        task_panel = new JPanel();
        PlannerGUI.TaskGUI(task_panel);
        task_button = new JButton("Planner");

        settings_panel = new JPanel();
        PlannerGUI.SettingsGUI(settings_panel);
        settings_button = new JButton("Settings");

        main_panel.add(task_panel, "task");
        main_panel.add(settings_panel, "settings");

        navigation_panel = new JPanel();
        navigation_panel.add(task_button);
        navigation_panel.add(settings_button);

        task_button.addActionListener(this);
        settings_button.addActionListener(this);

        frame.add(navigation_panel, BorderLayout.NORTH);
        frame.add(main_panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == task_button)
            main_layout.show(main_panel, "task");
        else if(e.getSource() == settings_button)
            main_layout.show(main_panel, "settings");
    }
}
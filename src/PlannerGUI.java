import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class PlannerGUI {
    public static void TaskGUI(JPanel panel) {
        String[] columns = {"Task", "Date", "Time", "Location", "Edit"};
        Object[][] task_data = {
                {"Task 1", "1/23", "12:00am", "Wherever", "Edit"},
                {"Task 2", "2/11", "3:00pm", "Somewhere", "Edit"},
                {"Task 3", "12/25", "8:00am", "Here", "Edit"}
        };

        DefaultTableModel table_model = new DefaultTableModel(task_data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 4;
            }
        };

        JTable task_table = new JTable(table_model);
        task_table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        TableColumnModel column_model = task_table.getColumnModel();

        task_table.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        task_table.getColumnModel().getColumn(4).setCellEditor(
                new ButtonEditor(new JButton("Edit"))
        );

        JScrollPane scroll_pane = new JScrollPane(task_table);
        panel.add(scroll_pane);

        panel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                GUIUtils.resize_columns(task_table);
            }
        });

    }

    public static void SettingsGUI(JPanel panel) {
        panel.add(new JLabel("Settings Panel"));
    }
}

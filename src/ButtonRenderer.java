
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
public class ButtonRenderer extends JButton implements TableCellRenderer {
    public ButtonRenderer() {
        setOpaque(true);
    }
    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean selected, boolean focus,
            int row, int column
    ) {
        setText((value == null)? "" : value.toString());
        return this;
    }
}
import javax.swing.*;
import javax.swing.table.TableColumnModel;

public class GUIUtils {
    public static void resize_columns(JTable table)  {
        int table_width = table.getParent().getWidth();
        if (table_width == 0) return;

        TableColumnModel table_cols = table.getColumnModel();
        table_cols.getColumn(0).setPreferredWidth((int)(table_width * 0.3));
        table_cols.getColumn(1).setPreferredWidth((int)(table_width * 0.2));
        table_cols.getColumn(2).setPreferredWidth((int)(table_width * 0.2));
        table_cols.getColumn(3).setPreferredWidth((int)(table_width * 0.2));
        table_cols.getColumn(4).setPreferredWidth((int)(table_width * 0.1));

        table.repaint();
    }
}

package JTable;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class PersonTableModel extends AbstractTableModel {
    private String[] columnNames = {"Name","Date of Birth","Type"};
    private ArrayList<Person> list;

    public PersonTableModel(ArrayList<Person> personList){
        list = personList;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        if (columnIndex == 0) {
            temp = list.get(rowIndex).getName(); }
        else if (columnIndex == 1) {
            temp = list.get(rowIndex).getDob().getDate();
        }
        else if (columnIndex == 2) {
            if(list.get(rowIndex) instanceof Teacher)
                temp = "Teacher";
            else
                temp = "Student";
        }
        return temp;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public ArrayList<Person> getList() {
        return list;
    }
}

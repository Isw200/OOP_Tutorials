package JTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frame extends JFrame implements ActionListener {
    Font font1 = new Font("Arial", Font.PLAIN, 20);
    ArrayList<Person> personList = new ArrayList<>();
    PersonTableModel personTableModel = new PersonTableModel(personList);
    JPanel p1 = new JPanel(new GridLayout(5,2,5,5));
    JPanel p2 = new JPanel(new GridLayout(5,2,5,5));
//    JPanel p3 = new JPanel(new GridLayout(3,1,5,5));
    JTable table = new JTable();
//    TableModel model = new DefaultTableModel(personTableModel.getColumnNames())
    JTextField sName,sDob,sID,sCourse,tName,tDob,tSalary,tYear;
    JLabel sNameLabel,sDobLabel,sIDLabel,sCourseLabel,tNameLabel,tDobLabel,tSalaryLabel, tYearLabel;

    JButton addTeacher, addStudent;

    public Frame(){
        setLayout(new FlowLayout());

        sName = new JTextField();
        sDob = new JTextField();
        sID = new JTextField();
        sCourse = new JTextField();
        tName = new JTextField();
        tDob = new JTextField();
        tSalary = new JTextField();
        tYear = new JTextField();

        sNameLabel = new JLabel("Name");

        addTeacher = new JButton("Add Teacher");
        addTeacher.addActionListener(this);
        addTeacher.setFont(font1);
        addTeacher.setFocusable(false);

        addStudent = new JButton("Add Teacher");
        addStudent.addActionListener(this);
        addStudent.setFont(font1);
        addStudent.setFocusable(false);


        p1.add(sName);
        p1.add(sDob);
        p1.add(sID);
        p1.add(sCourse);
        p1.add(addStudent);


        p2.add(tName);
        p2.add(tDob);
        p2.add(tSalary);
        p2.add(tYear);
        p2.add(addTeacher);


        add(p1);
        add(p2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

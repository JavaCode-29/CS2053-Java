import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab12 extends JFrame {
    JTextField nameField, idField;
    JTextArea displayArea;
    
    Lab12() {
        setTitle("Student Records");
        setSize(400, 400);
        setLayout(new FlowLayout());
        
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField(20);
        
        JButton addButton = new JButton("Add Student");
        JButton clearButton = new JButton("Clear");
        
        displayArea = new JTextArea(15, 30);
        JScrollPane scroll = new JScrollPane(displayArea);
        
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                displayArea.append(name + " - " + id + "\n");
                nameField.setText("");
                idField.setText("");
            }
        });
        
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                idField.setText("");
                displayArea.setText("");
            }
        });
        
        add(nameLabel);
        add(nameField);
        add(idLabel);
        add(idField);
        add(addButton);
        add(clearButton);
        add(scroll);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Lab12();
    }
}

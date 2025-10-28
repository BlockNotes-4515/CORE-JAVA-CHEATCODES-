import java.awt.*;
import java.awt.event.*;

class StudentRegistrationForm extends Frame implements ActionListener {
    Label lblName, lblRoll, lblCourse;
    TextField txtName, txtRoll, txtCourse;
    Button btnSubmit, btnClear;

    StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(400, 250);
        setLayout(new FlowLayout());

        // Create labels and text fields
        lblName = new Label("Name:");
        txtName = new TextField(25);

        lblRoll = new Label("Roll No:");
        txtRoll = new TextField(25);

        lblCourse = new Label("Course:");
        txtCourse = new TextField(25);

        // Create buttons
        btnSubmit = new Button("Submit");
        btnClear = new Button("Clear");

        // Add components to frame
        add(lblName);
        add(txtName);

        add(lblRoll);
        add(txtRoll);

        add(lblCourse);
        add(txtCourse);

        add(btnSubmit);
        add(btnClear);

        // Register action listeners
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            // Collect data and display in dialog box
            String name = txtName.getText();
            String roll = txtRoll.getText();
            String course = txtCourse.getText();

            String info = "Student Details:\n"
                        + "Name: " + name + "\n"
                        + "Roll No: " + roll + "\n"
                        + "Course: " + course;

            // Display dialog box with data
            Dialog d = new Dialog(this, "Submitted Details", true);
            d.setLayout(new FlowLayout());
            Label msg = new Label(info);
            d.add(msg);
            Button ok = new Button("OK");
            ok.addActionListener(ae -> d.setVisible(false));
            d.add(ok);
            d.setSize(300, 200);
            d.setVisible(true);
        } 
        else if (e.getSource() == btnClear) {
            txtName.setText("");
            txtRoll.setText("");
            txtCourse.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}

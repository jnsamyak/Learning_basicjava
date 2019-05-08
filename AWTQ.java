package awtq;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AWTQ extends Frame {

public static void main(String[] args) {

    Frame frame = new Frame("Admission Entry");
frame.setSize(600, 400);
frame.setVisible(true);
frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
System.exit(0);}});
    Panel p = new Panel();
    Panel p1 = new Panel();
    Label Admission = new Label("Application For Admission");
Admission.setAlignment(Label.CENTER);
    Label FirstName = new Label("Name");
TextFieldtfFName = new TextField(20);
    Label DateOfBirth = new Label("DOB");
TextFieldtfDob = new TextField(20);
p.setLayout(new GridLayout(6, 1));
p1.add(Admission);
p.add(FirstName);
p.add(tfFName);
p.add(DateOfBirth);
p.add(tfDob);
CheckboxGroupcbg = new CheckboxGroup();
    Checkbox Male = new Checkbox("Male", cbg, true);
    Checkbox Female = new Checkbox("Female", cbg, true);
p.add(Male);
p.add(Female);
    Button Submit = new Button("Submit");
p.add(Submit);
    p1.add(p);
frame.add(p1, BorderLayout.NORTH);
    }
}
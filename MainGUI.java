/*
 * Jayden Rodriguez Lugo
 * 6/12/25
 */

package cop2805;

/**
 * This code creates a GUI that contains a JTextField, JLabel for instructions, 
 * JList, and multiple JButtons each with a different function 
 */

//librarys
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

//main class
public class MainGUI extends JFrame {
    //allows the list to be acsessed anywhere within the code
    //the lists
    public DefaultListModel<String> listmodel = new DefaultListModel<String>();
    public JList<String> list = new JList<String>(listmodel);
    public JTextField tField; //text field
    //constructor
    public MainGUI(){
        super();
        init();
    }
    //the GUI
    private void init(){
        //setting up the JFrame 
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Homework 5 Solutions");//frame itself
        JLabel label = new JLabel("Enter Name");//label
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //panels
        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        tField = new JTextField(); // text field
       
        //adds the buttons
        JButton nameBtn = new JButton("Add Name");
        nameBtn.addActionListener(new myButtonListener());
        JButton removeBtn = new JButton("Remove Name");
        removeBtn.addActionListener(new myButtonListener());
        JButton clearListBtn = new JButton("Clear List");
        clearListBtn.addActionListener(new myButtonListener());
        //makes the layout
        frame.setLayout(new GridLayout(2,1));
        Panel1.setLayout(new GridLayout(1,3));
        //adds items to panels 1 and 2
        Panel1.add(label);
        Panel1.add(tField);
        Panel1.add(list);
        Panel2.add(nameBtn);
        Panel2.add(removeBtn);
        Panel2.add(clearListBtn);
        //adds the panels to the frame, displays to user
        frame.add(Panel1);
        frame.add(Panel2);
        frame.pack();
        frame.setVisible(true);
    }
    //constucts the GUI
    private static void constructGUI(){
        MainGUI GUI = new MainGUI();
    }
    
    //main function
    public static void main(String[] args) {
        //runs the GUI
        SwingUtilities.invokeLater(new Runnable(){ 
            public void run(){ constructGUI();}});
    }
    //class for the button
    class myButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent eventData){
            //gets users input
            JButton source = (JButton) eventData.getSource();
            //checks to see whitch button was pressed
            if(source.getText() == "Add Name"){
                //adds the text from the JTextField
                listmodel.addElement(tField.getText());
            } else if(source.getText() == "Remove Name"){
                //checks to see if somthing is selected
                if(list.getSelectedIndex() != -1){
                    listmodel.remove(list.getSelectedIndex());
                }
                
            } else if(source.getText() == "Clear List"){
                //clears the list
                listmodel.removeAllElements();
            }
        }
    }
    
    
    
}//MainGUI Ends



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginInterface {
   private JFrame Frame;
   private JLabel headerLabel;
   private JPanel Panel;
   private JButton adminButton;
   private JButton librarianButton;

   public LoginInterface(){
      prepareGUI();
   }

   public static void main(String[] args){
      LoginInterface loginInterface = new LoginInterface();      
      loginInterface.showEventDemo();       

      
   }

   private void prepareGUI(){
      Frame = new JFrame();
      Frame.setSize(400,350);
      Frame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER);
      Panel = new JPanel();
      Panel.setLayout(null);

      Frame.add(headerLabel);
      Frame.add(Panel);
      Frame.setVisible(true);  
   }

   private void showEventDemo(){
      headerLabel.setText("Library Management - JavaTpoint"); 

      adminButton = new JButton("Admin");
      adminButton.setBounds(130, 0, 120, 40);

      librarianButton = new JButton("Librarian");
      librarianButton.setBounds(130, 60, 120, 40);

      adminButton.setActionCommand("Admin");
      librarianButton.setActionCommand("Librarian");

      adminButton.addActionListener(new ButtonClickListener()); 
      librarianButton.addActionListener(new ButtonClickListener()); 

      Panel.add(adminButton);
      Panel.add(librarianButton);       

      Frame.setVisible(true);  
      Frame.setLocationRelativeTo(null);
   }

   private class ButtonClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) { 
         if(e.getActionCommand().equals("Admin")){
            JPanel adlogPanel = new JPanel();
            JFrame adminLoginFrame = new JFrame("Admin Login");
            adminLoginFrame.add(adlogPanel);
            adlogPanel.setLayout(null);

            // Set size and location of adminloginframe
            adminLoginFrame.setSize(300, 250);
            adminLoginFrame.setLocationRelativeTo(null);

            // Add components to adminloginframe
            JLabel title = new JLabel("Admin Login");
            title.setBounds(110, 30, 80, 35);
            adlogPanel.add(title);

            JLabel userLabel = new JLabel("User:");
            userLabel.setBounds(55, 70, 80, 35);
            adlogPanel.add(userLabel);

            JTextField userText = new JTextField(20);
            userText.setBounds(125, 78, 100, 20);
            adlogPanel.add(userText);

            
            JLabel passwordLabel = new JLabel("Password:");
            passwordLabel.setBounds(55, 100, 80, 35);
            adlogPanel.add(passwordLabel);

            JPasswordField passwordText = new JPasswordField(20);
            passwordText.setBounds(125, 108, 100, 20);
            adlogPanel.add(passwordText);

            JButton loginbutton = new JButton("Login");
            loginbutton.setBounds(105, 145, 80, 25);
            loginbutton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  String enteredUsername = userText.getText();
                  String enteredPassword = new String(passwordText.getPassword());
                  if ((enteredUsername.equals("Admin_01") && enteredPassword.equals("AdminOne")) ||
                  (enteredUsername.equals("Admin_02") && enteredPassword.equals("AdminTwo")) ||
                  (enteredUsername.equals("Admin_03") && enteredPassword.equals("AdminThree"))) {
                     JOptionPane.showMessageDialog(null, "Login Successful!");
                     JFrame AdminFrame = new JFrame("Admin");
                     JPanel AdminPanel = new JPanel();
                     AdminPanel.setLayout(null);
                     JLabel AdminMessage = new JLabel("Welcome to NU Library System",JLabel.CENTER);
                     AdminMessage.setFont(new Font("Times Roman", Font.BOLD, 24));
                     AdminFrame.add(AdminMessage);
                     AdminFrame.setSize(600, 300);
                     AdminMessage.setBounds(100, 30, 200, 35);
                     AdminFrame.setLocationRelativeTo(null);
                     adminLoginFrame.setVisible(false);
                     AdminFrame.setVisible(true);
        
                 } else if ((enteredUsername.equals("Admin_01") && !enteredPassword.equals("AdminOne")) ||
                 (enteredUsername.equals("Admin_02") && !enteredPassword.equals("AdminTwo")) ||
                 (enteredUsername.equals("Admin_03") && !enteredPassword.equals("AdminThree"))) {
                     JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
                 } else if ((!enteredUsername.equals("Admin_01") && !enteredUsername.equals("Admin_02") && !enteredUsername.equals("Admin_03")) 
                 && (enteredPassword.equals("AdminOne") || enteredPassword.equals("AdminTwo") || enteredPassword.equals("AdminThree"))) {
                  JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
                 } else {
                     JOptionPane.showMessageDialog(null, "INCORRECT USERNAME AND PASSWORD");
                 }
             }
         });
            
            adlogPanel.add(loginbutton);

            // Display admin login frame and hide 1st frame
            adminLoginFrame.setVisible(true);
            Frame.setVisible(false);

            
        }
        else if(e.getActionCommand().equals("Librarian")){
         JFrame librarianLoginFrame = new JFrame("Librarian Login");
         JPanel librarylogPanel = new JPanel();
         librarylogPanel.setLayout(null);
         librarianLoginFrame.add(librarylogPanel);
     
         // Set size and location of librarianLoginFrame
         librarianLoginFrame.setSize(300, 250);
         librarianLoginFrame.setLocationRelativeTo(null);
     
         // Add components to librarianLoginFrame
         JLabel librarianLoginLabel = new JLabel("Librarian Login", JLabel.CENTER);
         librarianLoginLabel.setBounds(85, 30, 120, 35);
         librarylogPanel.add(librarianLoginLabel);
     
         JLabel libUserLabel = new JLabel("User:");
         libUserLabel.setBounds(55, 70, 80, 35);
         librarylogPanel.add(libUserLabel);
     
         JTextField libUserText = new JTextField(20);
         libUserText.setBounds(125, 78, 100, 20);
         librarylogPanel.add(libUserText);
     
         JLabel libPasswordLabel = new JLabel("Password:");
         libPasswordLabel.setBounds(55, 100, 80, 35);
         librarylogPanel.add(libPasswordLabel);
     
         JPasswordField libPasswordText = new JPasswordField(20);
         libPasswordText.setBounds(125, 108, 100, 20);
         librarylogPanel.add(libPasswordText);
     
         JButton libLoginbutton = new JButton("Login");
         libLoginbutton.setBounds(105, 145, 80, 25);
         libLoginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String enteredUsername = libUserText.getText();
               String enteredPassword = new String(libPasswordText.getPassword());
               if ((enteredUsername.equals("Librarian_01") && enteredPassword.equals("LibOne")) ||
                  (enteredUsername.equals("Librarian_02") && enteredPassword.equals("LibTwo")) ||
                  (enteredUsername.equals("Librarian_03") && enteredPassword.equals("LibThree"))) {
                  JOptionPane.showMessageDialog(null, "Login Successful!");
                  JFrame LibrarianFrame = new JFrame("Librarian");
                  JPanel LibrarianPanel = new JPanel();
                  LibrarianPanel.setLayout(null);
                  

                  // Add the message label
                  JLabel LibrarianMessage = new JLabel("Welcome to NU Library System");
                  LibrarianMessage.setVerticalAlignment(JLabel.TOP);
                  LibrarianMessage.setHorizontalAlignment(JLabel.CENTER);
                  LibrarianMessage.setBounds(100, 10, 600, 35);
                  LibrarianMessage.setFont(new Font("Times Roman", Font.BOLD, 24));
                  LibrarianPanel.add(LibrarianMessage);

                  // Create the table
                  String[] columnNames = {"Book Number", "Book Title", "Author", "Copies Left"};
                  Object[][] data = {
                        {"0","System Analysis and Design", "Garry B. Shelly", "2"},
                        {"1","Android Application", "Corrine Hoisington", "3"},
                        {"2","Programming Concepts and Logic Formulation", "Rosauro E. Manuel", "4"}
                  };
                  JTable table = new JTable(data, columnNames);
                  table.setBounds(50, 50, 300, 100);
                  JScrollPane scrollPane = new JScrollPane(table);
                  table.setRowHeight(30);
                  scrollPane.setBounds(50, 50, 700, 112);
                  LibrarianPanel.add(scrollPane);

                  JLabel chooseLabel = new JLabel("Choose a book number:");
                  chooseLabel.setBounds(240, 170, 150, 35);
                  LibrarianPanel.add(chooseLabel);

                  JTextField chooseField = new JTextField();
                  chooseField.setBounds(chooseLabel.getX() + chooseLabel.getWidth() + 10, 180, 150, 20);
                  LibrarianPanel.add(chooseField);

                  JButton confirmButton = new JButton("Confirm");
                  confirmButton.setBounds(345, 210, 80, 25);
                  confirmButton.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                        // Get the entered book number
                        int enteredbookNumber = Integer.parseInt(chooseField.getText());

                        // Check if the book number is valid
                        if (enteredbookNumber >= 0 && enteredbookNumber < data.length) {
                              // Get the selected book and its number of copies left
                              Object[] selectedBook = data[enteredbookNumber];
                              int copiesLeft = Integer.parseInt((String) selectedBook[3]);

                              if (copiesLeft > 0) {
                                 // Decrement the number of copies left and update the table
                                 selectedBook[3] = Integer.toString(copiesLeft - 1);
                                 table.setValueAt(selectedBook[3], enteredbookNumber, 3);

                                 JOptionPane.showMessageDialog(null, "Successfully Rented!");
                              } else {
                                 JOptionPane.showMessageDialog(null, "No Copies Available");
                              }
                        } else {
                              JOptionPane.showMessageDialog(null, "INDEX DOES NOT EXIST, Try Again!");
                        }
                     }
                  });
                  LibrarianPanel.add(confirmButton);

                  // Add the panel to the frame and set its properties
                  LibrarianFrame.add(LibrarianPanel);
                  LibrarianFrame.setSize(800, 300);
                  LibrarianFrame.setLocationRelativeTo(null);
                  librarianLoginFrame.setVisible(false);
                  LibrarianFrame.setVisible(true);
                  
               } else if ((enteredUsername.equals("Librarian_01") && !enteredPassword.equals("LibOne")) ||
                        (enteredUsername.equals("Librarian_02") && !enteredPassword.equals("LibTwo")) ||
                        (enteredUsername.equals("Librarian_03") && !enteredPassword.equals("LibThree"))) {
                  JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD");
               } else if ((!enteredUsername.equals("Librarian_01") && !enteredUsername.equals("Librarian_02") && !enteredUsername.equals("Librarian_03")) 
                        && (enteredPassword.equals("LibOne") || enteredPassword.equals("LibTwo") || enteredPassword.equals("LibThree"))) {
                  JOptionPane.showMessageDialog(null, "INCORRECT USERNAME");
               } else {
                  JOptionPane.showMessageDialog(null, "INCORRECT USERNAME AND PASSWORD");
               }

      // Display librarianLoginFrame and hide 1st frame
      librarianLoginFrame.setVisible(false);
   }
});
librarylogPanel.add(libLoginbutton);
         

            // Display librarianLoginFrame and hide 1st frame
            librarianLoginFrame.setVisible(true);
            Frame.setVisible(false);
        }
    }
   }
}

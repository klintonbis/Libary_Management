import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Libary{
    private JFrame frame1,frame2,frame3,frame,framebr,framedb,framelog;
    private JButton bookdetails,adminpanel,borrowreturn,userdashboard,filemanagement,back,
            adminupdate,adminadd,borrow,returnb,jb,jb1,backbd,backud,backbr;
    private JLabel bookbd,book2,bbok3,book4,adminlabel1,adminlabel2,adminlabel3,adminlabel4,details1,
            detail2,details3,labelbr,labeldb1,labeldb2,labeldb3,userLabel,passLabel;
    private JTextField admint1,admint2,admint3,admint4,detailst1,detailst2,detailst3;
   private JTextArea detailsar1,detailsar2,detailsr3,deshboard1,deshboard2,deshboard3;
  private JPasswordField pf;
  private ImageIcon img;
   private ArrayList<String[]> fields=new ArrayList<String[]>();
   public final List<String> availableBooks;
    public final List<String> borrowedBooks;

    public final JList<String> availableBooksList;
    public final DefaultListModel<String> availableListModel;

    public final JList<String> borrowedBooksList;
    public final DefaultListModel<String> borrowedListModel;
    private JPanel panel,leftPanel,rightPanel;
     private Font font;
        private JTable table;
        private JScrollPane scroll;
        private String[] cols={"Book","Author","Price","Ratings"};
       
        private String[][] rows={
       
                                  {  "Misir Ali","Humayun Ahmed","350","4.3"},
                                  {  "Jogajog","Rabindranath Tagore","330","4"},
                                  {  "Deyal","Humayun Ahmed","300","4.5"},
       
                                   {  "Kabuliwala","Rabindranath Tagore","450","4.9"},
                                   {  "Discrete Mathematics","DSU","550","5"},
                                  {  "Dipu no 2","Zafor Iqbal","323","4.8"},
                                  {  "Chader Pahar","Shottojit Roy","399","3.8"},
                                  {  "Ekattorer Dinguli","Jahanara Imam","394","4.3"},
                                 {  "Tukunjil","Zafor Iqbal","300","3.5"},
                                  {  "Time Machine","H.G. Wells","350","4.3"},
                                  {  "A passage to India","E.M.Forster","330","3.4"},
                                  {  "Agni Veena","Kazi Nasrul Islam","300","4.5"},
                                    {  "Mein Kampf","Adolf Hitler","350","4.1"},
                                  {  "Utopia","Sir Thomas Moor","330","3.4"},
                                  {  "Bisarjan","Rabindranath Tagore","300","4.2"},
                                 
                                  {  "Chitra","Rabindranath Tagore","450","4.9"},
                                   {  "Dui Bon","Shatyajit Roy","550","5"},
                                  {  "Ghore Baire","Rabindranath Tagore","323","4.8"},
                                 
                                 
                                 
                                 

        };
       
    public Libary(){
        loginframe();
       
       availableBooks = new ArrayList<>();
        availableBooks.add("Misir Ali");
        availableBooks.add("Jogajog");
        availableBooks.add("Deyal");
        availableBooks.add("Chitra");
        availableBooks.add("Ghore Bhire");
        availableBooks.add("Utopiya");
        borrowedBooks = new ArrayList<>();

        availableListModel = new DefaultListModel<>();
        for (String book : availableBooks) {
            availableListModel.addElement(book);
        }

        borrowedListModel = new DefaultListModel<>();

        availableBooksList = new JList<>(availableListModel);
        borrowedBooksList = new JList<>(borrowedListModel);
           
           
   
    }
    public void loginframe(){
       JFrame framelog=new JFrame("Login Frame");
        framelog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framelog.setBounds(100, 100, 800, 450);
        framelog.setVisible(true);
        
        
       
      
        JLabel userLabel=new JLabel("Username:");
        JLabel passLabel=new JLabel("Password:");
        JButton jb=new JButton("Login");
        JButton jb1=new JButton("Close");
        
        userLabel.setBounds(110, 70, 110, 30);
        passLabel.setBounds(110, 110, 110, 30);
        jb.setBounds(140, 180, 70, 30);
        jb1.setBounds(230, 180, 70, 30);
        
        framelog.add(userLabel);
        framelog.add(passLabel);
        framelog.add(jb);
        framelog.add(jb1);
        
        JTextField tf=new JTextField();
        JPasswordField pf=new JPasswordField();
        
        tf.setBounds(200, 70, 120, 30);
        pf.setBounds(200, 110, 120, 30);
        framelog.add(tf);
        framelog.add(pf);
        
        jb.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                String username=tf.getText();
                String password=pf.getText();
                
                if(username.equals("panda")&&password.equals("1234"))
                    
                {
                    JOptionPane.showMessageDialog(null, "You are Wellcome");
                    framelog.setVisible(false);
                    mainframe();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            }
        });
        
        
    }
    
    
    
    public void mainframe()
    {
       JFrame frame1=new JFrame("Library Management System");
       frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame1.setSize(800, 500);
       frame1.setLayout(new GridLayout(2,3));
       JButton bookdetails=new JButton("Book Details");
       
        bookdetails.setLocation(0, 0);
       frame1.add(bookdetails);
       frame1.setVisible(true);
       bookdetails.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
             
          frame1.setVisible(false);
         
           bookdetailsubframe();
       
       }    
          public void bookdetailsubframe(){
          JFrame frame2=new JFrame("Book Details");
              frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame2.setBounds(100,100,750,450);
          frame2.setTitle("Table Demo");
         
          frame2.setLayout(null);
          font=new Font("Arial",Font.BOLD,20);
         JLabel labelbd=new JLabel("Book Details");
          labelbd.setFont(font);
          labelbd.setBounds(100,20,140,50);
          frame2.add(labelbd);
          table=new JTable(rows,cols);
          table.setSelectionBackground(Color.lightGray);
            JButton backbd=new JButton("Back");
            backbd.setBounds(500, 380, 100, 30);
            frame2.add(backbd);
          scroll=new JScrollPane(table);
             scroll.setBounds(50,80,670,300);
             frame2.add(scroll);
             frame2.setVisible(true);
             
      
          backbd.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
          
          frame2.setVisible(false);
          frame1.setVisible(true);
          }

          });
          
          }
       
       });
       
       JButton adminpanel=new JButton("Admin Panel");
       adminpanel.setSize(100, 50);
        adminpanel.setLocation(40, 40);
       frame1.add(adminpanel);
       frame1.setVisible(true);
       adminpanel.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
             
          frame1.setVisible(false);
         
           adminsubframe();
       
       }  
       public void adminsubframe(){
           JFrame frame3=new JFrame("Admin Frame");
           frame3.setLayout(new GridLayout(6,2));
           frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame3.setSize(800,500);
           frame3.setVisible(true);
         
        JLabel  adminlabel1 = new JLabel("Book Name:");
       
        JLabel adminlabel2 = new JLabel("Author:");
       
        JLabel adminlabel3 = new JLabel("Number of Copies:");
       
        JLabel adminlabel4 = new JLabel("Type of Book:");
        JTextField  admint1 = new JTextField(20);
       JTextField  admint2= new JTextField(20);
      JTextField  admint3 = new JTextField(20);
       JTextField  admint4= new JTextField(20);
       
       JButton adminadd = new JButton("AddBook");
       JButton adminview = new JButton("View");
       JButton adminupdate = new JButton("Update");
       JButton back=new JButton("Back");
       adminpanel.addActionListener(this);
       frame3.add(adminlabel1);
      frame3.add(admint1);
       frame3.add(adminlabel2);
       frame3.add(admint2);
       frame3.add(adminlabel3);
       frame3.add(admint3);
       frame3.add(adminlabel4);
       frame3.add(admint4);
        frame3.add(adminadd);
       frame3.add(adminview);
       frame3.add(adminupdate);
        frame3.add(back);
        adminadd.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
             String[] field= new String[4];
            field[0] = admint1.getText();
            field[1] = admint2.getText();
            field[2] = admint3.getText();
            field[3] = admint4.getText();
           
           
            fields.add(field);
            JOptionPane.showMessageDialog(adminpanel, "Books added Successfuly");
           
            }
         
        });
       
         adminview.addActionListener(new ActionListener(){
           
         
               public void actionPerformed(ActionEvent e) {
             String[] columns = {"Book Name","Author","Number of Copies","Type of Book"};
            Object[][] data = new Object[fields.size()][4];
            for (int i = 0; i < fields.size(); i++) {
                data[i][0] = fields.get(i)[0];
                data[i][1] = fields.get(i)[1];
                data[i][2] = fields.get(i)[2];
                data[i][3] = fields.get(i)[3];
           
               
               
            }
              JTable table = new JTable(data, columns);
          JScrollPane scrollPane = new JScrollPane(table);
        JFrame frame = new JFrame("View Books");
         frame.add(scrollPane);
            frame.setSize(800, 450);
         
            frame.setVisible(true);
             
               }
               
         });
         
     
         
      back.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
             
            frame3.setVisible(false);
           frame1.setVisible(true);
               }
        });
           
           
            
               
       
       
       }
       });


          JButton userdeshboard=new JButton("User DeshBoard ");
       userdeshboard.setSize(100, 50);
        userdeshboard.setLocation(40, 40);
       frame1.add(userdeshboard);
       frame1.setVisible(true);
       userdeshboard.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
             
          frame1.setVisible(false);
         
           userdeshboardsubframe();
       
       }  
       public void userdeshboardsubframe(){
           JFrame framedb =new JFrame("User DeshBoard");
          framedb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          framedb.setSize(800, 500);    
          framedb.setVisible(true);
         framedb.setLayout(new GridLayout(4,1));
         
         JLabel labeldb1=new JLabel("Personal Information");
            framedb.add(labeldb1);
            JTextArea deshboard1=new JTextArea("Name:Mateo Fimo;\nID:2021-2-60-010\nDepartment:CSE\nSamester:Summer-23");
            deshboard1.setRows(4);
        deshboard1.setColumns(5);
        deshboard1.setLineWrap(true);
        deshboard1.setWrapStyleWord(true);
        deshboard1.setCaretPosition(0);
           framedb.add(deshboard1);
           
           JLabel labeldb2=new JLabel(" Borrowed History ");
            framedb.add(labeldb2);
            JTextArea deshboard2=new JTextArea("Book:Java Programing;\nNumber of Book:3\nTaken Date:7-07-2023\nReturn Date:17-08-2023");
            deshboard2.setRows(4);
        deshboard2.setColumns(5);
        deshboard2.setLineWrap(true);
        deshboard2.setWrapStyleWord(true);
        deshboard2.setCaretPosition(0);
           framedb.add(deshboard2);
           
            JLabel labeldb3=new JLabel(" Return History ");
            framedb.add(labeldb3);
            JTextArea deshboard3=new JTextArea("Return Status:Yes;\nReturn Date:17-08-2023\nMaintainace:OK\nOverallReviews:(Rating:4.5)");
            deshboard1.setRows(4);
        deshboard3.setColumns(5);
        deshboard3.setLineWrap(true);
        deshboard3.setWrapStyleWord(true);
        deshboard3.setCaretPosition(0);
           framedb.add(deshboard3);
           JButton backud=new JButton("Back");
           backud.setBounds(300,350,100,30);
           framedb.add(backud);
           framedb.setVisible(true);
             
      
          backud.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
          
          framedb.setVisible(false);
          frame1.setVisible(true);
          }

          });
       }
       });
       JButton borrowreturn=new JButton("Borrow&ReturnB ");
       borrowreturn.setSize(100, 50);
        borrowreturn.setLocation(40, 40);
       frame1.add(borrowreturn);
       frame1.setVisible(true);
       borrowreturn.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
             
          frame1.setVisible(false);
         
           borrowreturnsubframe();
       
       }  
       public void borrowreturnsubframe(){
         JFrame framebr=new JFrame("Borrow REturn");
           framebr.setBounds(10,10,800,450);

        JButton borrowButton = new JButton("Borrow");
        JButton returnButton = new JButton("Return");

        borrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedBook = availableBooksList.getSelectedValue();
                if (selectedBook != null) {
                    availableListModel.removeElement(selectedBook);
                    borrowedListModel.addElement(selectedBook);
                }
            }
        });
       
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedBook = borrowedBooksList.getSelectedValue();
                if (selectedBook != null) {
                    borrowedListModel.removeElement(selectedBook);
                    availableListModel.addElement(selectedBook);
                }
            }
        });
       
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(new JLabel("Available Books"), BorderLayout.NORTH);
        leftPanel.add(new JScrollPane(availableBooksList), BorderLayout.CENTER);
        leftPanel.add(borrowButton, BorderLayout.SOUTH);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(new JLabel("Borrowed Books"), BorderLayout.NORTH);
        rightPanel.add(new JScrollPane(borrowedBooksList), BorderLayout.CENTER);
        rightPanel.add(returnButton, BorderLayout.SOUTH);
       
        framebr.setLayout(new GridLayout(3, 2));
       framebr.add(leftPanel);
        framebr.add(rightPanel);

        framebr.setTitle("Book Borrowing System");
        framebr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framebr.pack();
        framebr.setLocationRelativeTo(null);
       JButton backbr=new JButton("Back");
        backbr.setBounds(300,300,100,30);
        framebr.add(backbr);
        framebr.setVisible(true);
        
        backbr.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
          
          framebr.setVisible(false);
          frame1.setVisible(true);
          }

          });
        
    }
 
         
         
             
           
       
       });
       JButton filemanagement=new JButton("File ManageMent ");
       filemanagement.setSize(100, 50);
        filemanagement.setLocation(100, 40);
       frame1.add(filemanagement);
       frame1.setVisible(true);
       filemanagement.addActionListener(new ActionListener (){
           
         
               public void actionPerformed(ActionEvent e) {
             
          frame1.setVisible(false);
         
           filemanagementsubframe();
       
       }  
       public void filemanagementsubframe(){
           
       }
       });
     
       
       }
       
 private void clearFields() {
    admint1.setText("");
    admint2.setText("");
    admint3.setText("");
    admint4.setText("");
   
 }
    public static void main(String[] args) {
        new Libary();
       
       
       
   
       
    }
       }

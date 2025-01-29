import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame f =new JFrame("Register");

        ImageIcon icon = new ImageIcon("\u202AC:\\Users\\Sinem\\IdeaProjects\\PatientRegister\\src\\resources\\icon.png");

        // Eğer simge düzgün yüklenmişse, simgeyi ayarlıyoruz
        if (icon != null) {
            f.setIconImage(icon.getImage()); // Uygulamanın simgesini ayarlayın
        } else {
            System.out.println("Simge dosyası bulunamadı!");
        }


        JLabel lb1 =new JLabel();
        lb1.setText("Patient Register Area");
        lb1.setBounds(50,10,600,40);
        lb1.setFont(new Font("Arial",Font.BOLD,20));
        lb1.setForeground(Color.GRAY);

        JLabel name =new JLabel();
        name.setText("Name:");
        name.setBounds(50,45,600,40);
        name.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel surN =new JLabel();
        surN.setText("Surname:");
        surN.setBounds(48,95,600,40);
        surN.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel gender =new JLabel();
        gender.setText("Gender:");
        gender.setBounds(48,148,200,40);
        gender.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel ıd =new JLabel();
        ıd.setText("ID:");
        ıd.setBounds(50,195,200,40);
        ıd.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel  height=new JLabel();
        height.setText("Height:");
        height.setBounds(50,245,200,40);
        height.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel weight =new JLabel();
        weight.setText("Weight:");
        weight.setBounds(50,295,200,40);
        weight.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel bornPlace =new JLabel();
        bornPlace.setText("Born Place(Country/Town):");
        bornPlace.setBounds(50,345,200,40);
        bornPlace.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel bornDate =new JLabel();
        bornDate.setText("Born Date:");
        bornDate.setBounds(50,395,200,40);
        bornDate.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel bloodType =new JLabel();
        bloodType.setText("Blood Type:");
        bloodType.setBounds(50,445,200,40);
        bloodType.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel job =new JLabel();
        job.setText("Job:");
        job.setBounds(50,495,200,40);
        job.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel phone =new JLabel();
        phone.setText("Phone:");
        phone.setBounds(50,545,200,40);
        phone.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel mail =new JLabel();
        mail.setText("E-mail:");
        mail.setBounds(50,595,150,40);
        mail.setFont(new Font("Arial",Font.ITALIC,12));

        JLabel cm =new JLabel();
        cm.setText("cm");
        cm.setBounds(205,245,150,40);
        cm.setFont(new Font("Arial",Font.PLAIN,12));

        JLabel kg =new JLabel();
        kg.setText("kg");
        kg.setBounds(205,295,150,40);
        kg.setFont(new Font("Arial",Font.ITALIC,12));

        JTextField name1=new JTextField();
        JTextField surName=new JTextField();
        JTextField ıd1=new JTextField();
        JTextField height1=new JTextField();
        JTextField weight1=new JTextField();
        JTextField bornP=new JTextField();
        JTextField bornD=new JTextField();
        JTextField blood=new JTextField();
        JTextField job1=new JTextField();
        JTextField phone1=new JTextField();
        JTextField email=new JTextField();

        JRadioButton male= new JRadioButton("Man");
        JRadioButton female= new JRadioButton("Woman");
        JRadioButton other= new JRadioButton("Other");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        radioPanel.setBounds(100, 150, 300, 30);
        radioPanel.add(male);
        radioPanel.add(female);
        radioPanel.add(other);

        JButton btn =new JButton("Register");
        btn.setBounds(160,650,150,30);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(100,149,237));
            }
            public void mouseExited(MouseEvent e){
                btn.setBackground(new Color(255,182,193));
            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (surName.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Surname cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (ıd1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "ID cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (height1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Height cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (weight1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Weight cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (bornP.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Born Place cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (bornD.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Born Date cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (blood.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Blood Type cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (job1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Job cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (phone1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "Phone Number cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (email.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(f, "E-mail cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String nameRegex = "^[a-zA-ZçÇğĞıİöÖşŞüÜ]+$";
                String idRegex = "^[0-9]{11}$";
                String heightRegex = "^[0-9]+$";
                String weightRegex = "^[0-9]+$";
                String phoneRegex = "^\\+?[0-9]{10,15}$";
                String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

                if (!name1.getText().matches(nameRegex)) {
                    JOptionPane.showMessageDialog(f, "Invalid Name! Only letters are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!surName.getText().matches(nameRegex)) {
                    JOptionPane.showMessageDialog(f, "Invalid Surname! Only letters are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!ıd1.getText().matches(idRegex)) {
                    JOptionPane.showMessageDialog(f, "Invalid ID! Must be 11 digits.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!height1.getText().matches(heightRegex)) {
                    JOptionPane.showMessageDialog(f, "Invalid Height! Only numbers are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!weight1.getText().matches(weightRegex)) {
                    JOptionPane.showMessageDialog(f, "Invalid Weight! Only numbers are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!phone1.getText().matches(phoneRegex)) {
                    JOptionPane.showMessageDialog(f, "Invalid Phone Number! Must be 10-15 digits and only numbers are allowed.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!email.getText().matches(emailRegex)) {
                    JOptionPane.showMessageDialog(f, "Invalid Email! Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }



                System.out.println("Name: " +name1.getText()+ "\nSurname: "+ surName.getText() +"\nID: "+ ıd1.getText());
                if(male.isSelected()){
                    System.out.println("Gender: "+ male.getText());
                } else if (female.isSelected()) {
                    System.out.println("Gender: "+ female.getText());
                }else{
                    System.out.println("Gender: "+ other.getText());
                }
                System.out.println("Height: "+ height1.getText()+ "cm" +"\nWeight: "+ weight1.getText()+ "kg"+ "\nBorn Place: "+
                                   bornP.getText()+ "\nBorn Date: "+ bornD.getText() + "\nBlood Type: "+ blood.getText()+
                                   "\nJob: "+ job1.getText()+ "\nPhone Number: "+ phone1.getText()+ "\ne-mail: "+ email.getText());


                secondFrame();
                f.dispose();
            }
        });


        name1.setBounds(100,50,200,30);
        surName.setBounds(105,100,200,30);
        ıd1.setBounds(100,200,200,30);
        height1.setBounds(100,250,100,30);
        weight1.setBounds(100,300,100,30);
        bornP.setBounds(200,350,200,30);
        bornD.setBounds(120,400,200,30);
        blood.setBounds(120,450,200,30);
        job1.setBounds(100,500,200,30);
        phone1.setBounds(100,550,200,30);
        email.setBounds(100,600,200,30);

        f.setLayout(null);
        f.add(lb1);
        f.add(name);
        f.add(surN);
        f.add(gender);
        f.add(ıd);
        f.add(height);
        f.add(weight);
        f.add(bornPlace);
        f.add(bornDate);
        f.add(bloodType);
        f.add(job);
        f.add(phone);
        f.add(mail);
        f.add(cm);
        f.add(kg);

        f.add(radioPanel);
        f.add(name1);
        f.add(surName);
        f.add(ıd1);
        f.add(height1);
        f.add(weight1);
        f.add(bornP);
        f.add(bornD);
        f.add(blood);
        f.add(job1);
        f.add(phone1);
        f.add(email);
        f.add(btn);

        f.setSize(500,800);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void secondFrame(){
        JFrame f2=new JFrame("Creating Password and UserName");
        JLabel lb2 = new JLabel();
        lb2.setText("Please Create a Password and UserName");
        lb2.setBounds(26,10,600,20);
        lb2.setFont(new Font("Arial",Font.BOLD,12));

        JLabel userN = new JLabel();
        userN.setText("User Name");
        userN.setBounds(10,45,200,10);
        userN.setFont(new Font("Arial",Font.PLAIN,12));

        JLabel pw = new JLabel();
        pw.setText("Password");
        pw.setBounds(10,100,200,10);
        pw.setFont(new Font("Arial",Font.PLAIN,12));

        JTextField user =new JTextField();
        user.setBounds(10,60,150,30);
        user.setBackground(new Color(230,230,250));
        user.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(100,100,255),2),
                new EmptyBorder(5,5,5,5)
        ));

        JPasswordField pass =new JPasswordField();
        pass.setBounds(10,115,150,30);
        pass.setBackground(new Color(230,230,250));
        pass.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(100,100,255),2),
                new EmptyBorder(5,5,5,5)
        ));

        JButton reg =new JButton("SUBMIT");
        reg.setBounds(90,170,100,20);
        reg.setFont(new Font("Segoe UI", Font.BOLD, 14));
        reg.setBackground(new Color(255,182,193));

        reg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                reg.setBackground(new Color(100,149,237));
            }
            public void mouseExited(MouseEvent e){
                reg.setBackground(new Color(255,182,193));
            }
        });


        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password=new String(pass.getPassword());
                if (!validatePass(password)){
                    if(!password.matches(".*[A-Z].*")){
                        JOptionPane.showMessageDialog(f2,"Password must contain at least one upperCase letter","Error,Please Try Again", JOptionPane.ERROR_MESSAGE);
                    } else if (!password.matches(".*[a-z]+")){
                        JOptionPane.showMessageDialog(f2,"Password must contain at least one lowercase letter","Error,Please Try Again", JOptionPane.ERROR_MESSAGE);
                    } else if (!password.matches(".*\\d")) {
                        JOptionPane.showMessageDialog(f2,"Password must contain at least one digit","Error,Please Try Again", JOptionPane.ERROR_MESSAGE);
                    } else if (!password.matches(".*[@$!%*?&.,+]")) {
                        JOptionPane.showMessageDialog(f2,"Password must contain at least one special character","Error,Please Try Again", JOptionPane.ERROR_MESSAGE);
                    } else if (!password.matches("[A-Za-z\\d@$!%*?&.,+]{8,}$")) {
                        JOptionPane.showMessageDialog(f2,"Password must contain at 8 character.","Error,Please Try Again", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    System.out.println("User Name: "+ user.getText()+ "\nPassword: "+ password);
                    JFrame tnx= new JFrame("Completed");
                    tnx.setSize(300,150);
                    tnx.setLocationRelativeTo(null);
                    tnx.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    JLabel tnxlb= new JLabel("Thank you for filling the blanks.", SwingConstants.CENTER);
                    tnx.add(tnxlb);
                    tnx.setVisible(true);

                    new Thread(() -> {
                        try {
                            Thread.sleep(2000);
                        }catch (InterruptedException ex){
                            ex.printStackTrace();
                        }
                        tnx.dispose();
                        f2.dispose();
                        System.exit(0);
                    }).start();
                }
            }
        });

        f2.setLayout(null);
        f2.add(lb2);
        f2.add(user);
        f2.add(pass);
        f2.add(userN);
        f2.add(pw);
        f2.add(reg);
        f2.setSize(300,250);
        f2.setLocationRelativeTo(null);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setVisible(true);
    }

    public static boolean validatePass(String passW){
        String regex=  "^(?=.*[A-Z].*)(?=.*[a-z]+)(?=.*\\d)(?=.*[@$!%*?&.,+])[A-Za-z\\d@$!%*?&.,+]{8,}$";
        return passW.matches(regex);
    }
}
package project;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
public class projectswing implements ActionListener
{JButton bu= new JButton("SUBMIT");
JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
        JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
        JComboBox yr,d,m,y,st,gn,cat,br;
        Font fn=new Font("ALGERIAN",Font.BOLD,80);
        Font lfn=new Font("ALGERIAN",Font.TYPE1_FONT,30);
        Font tfn=new Font("ARIAL",Font.PLAIN,20);
    public static void main(String args[]) throws Exception
    {
        projectswing pr=new projectswing();
        
    }
        public projectswing(){
        JFrame jf=new JFrame();
        jf.setTitle("NITESH SHAHU project");
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setSize(2000,1500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container n=jf.getContentPane();
        String year[]={" ---SELECT---","|","||","|||","|V"};
        String date[]=new String[32];
        date[0]="dd";
        for(int i=01;i<=31;i++)
            date[i]=Integer.toString(i);
        String month[]=new String[13];
        month[0]="mm";
        for(int i=1;i<=12;i++)
            month[i]=Integer.toString(i);
        String dyear[]=new String[31];
        dyear[0]="yyyy";
        for(int i=1990;i<=2019;i++)
            dyear[i-1989]=Integer.toString(i);
        String gander[]={" ---SELECT---","Male","Female","Other"};
        String cast[]={" ---SELECT---","General","OBC","SC","ST"};
        String branch[]={" ---SELECT---","CSE","ECE","ME","EE","CHE","BCE"};
        String state[]={" ---SELECT---","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Delhi","Goa","Gujrat","Haryana","Himachal Pardesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Manipur","Meghalya","Mizoram","Nagaland","Odisha","Punjab","Rajisthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
        yr=new JComboBox(year);
        d=new JComboBox(date);
        m=new JComboBox(month);
        y=new JComboBox(dyear);
        gn=new JComboBox(gander);
        cat=new JComboBox(cast);
        br=new JComboBox(branch);
        st=new JComboBox(state);
        l=new JLabel("Registration  Form");
        l1=new JLabel("Student name :");
        l2=new JLabel("Date Of Birth :");
        l3=new JLabel("Gender :");
        l4=new JLabel("Branch :");
        l5=new JLabel("Father's name :");
        l6=new JLabel("Mother's name :");
        l7=new JLabel("Category :");
        l8=new JLabel("Relegion :");
        l9=new JLabel("Mobile no :");
        l10=new JLabel("Email ID :");
        l11=new JLabel("Year :");
        l12=new JLabel("Address :");
        l13=new JLabel("State :");
        l14=new JLabel("Pincode :");
        l15=new JLabel("City :");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
        t7=new JTextField();
        t8=new JTextField();
        t9=new JTextField();
        l.setFont(fn);
        l1.setFont(lfn);
        l2.setFont(lfn);
        l3.setFont(lfn);
        l4.setFont(lfn);
        l5.setFont(lfn);
        l6.setFont(lfn);
        l7.setFont(lfn);
        l8.setFont(lfn);
        l9.setFont(lfn);
        l10.setFont(lfn);
        l11.setFont(lfn);
        l12.setFont(lfn);
        l13.setFont(lfn);
        l14.setFont(lfn);
        l15.setFont(lfn);
        t1.setFont(tfn);
        t2.setFont(tfn);
        t3.setFont(tfn);
        t4.setFont(tfn);
        t5.setFont(tfn);
        t6.setFont(tfn);
        t7.setFont(tfn);
        t8.setFont(tfn);
        t9.setFont(tfn);
        yr.setFont(tfn);
        d.setFont(tfn);
        m.setFont(tfn);
        y.setFont(tfn);
        st.setFont(tfn);
        cat.setFont(tfn);
        gn.setFont(tfn);
        br.setFont(tfn);
        bu.setFont(fn);
        l.setBounds(500, 100, 1100, 150);
        l1.setBounds(150, 300, 300, 30);
        t1.setBounds(500, 300,200, 30);
        l2.setBounds(1100, 300, 300, 30);
        d.setBounds(1500, 300, 80, 30);
        m.setBounds(1590, 300, 80, 30);
        y.setBounds(1680, 300, 80, 30);
        l3.setBounds(150, 370, 300, 30);
        gn.setBounds(500, 370, 150, 30);
        l4.setBounds(1100, 370, 300, 30);
        br.setBounds(1500, 370, 150, 30);
        l5.setBounds(150, 440, 300, 30);
        t2.setBounds(500, 440, 300, 30);
        l6.setBounds(1100, 440, 300, 30);
        t3.setBounds(1500, 440, 200, 30);
        l7.setBounds(150, 510, 300, 30);
        cat.setBounds(500,510,150,30);
        l8.setBounds(1100, 510, 300, 30);
        t4.setBounds(1500, 510, 200, 30);
        l9.setBounds(150, 580, 300, 30);
        t5.setBounds(500, 580, 200, 30);
        l10.setBounds(150, 650, 300, 30);
        t6.setBounds(500, 650, 300, 30);
        l11.setBounds(150, 720, 300, 30);
        yr.setBounds(500, 720, 150, 30);
        l12.setBounds(150, 790, 300, 30);
        t7.setBounds(500, 790, 500, 30);
        l13.setBounds(150, 850, 300, 30);
        st.setBounds(500, 850, 300, 30);
        l14.setBounds(1100, 850, 300, 30);
        t8.setBounds(1500, 850, 200, 30);
        l.setForeground(Color.BLUE);
        l15.setBounds(1100, 790, 300, 30);
        t9.setBounds(1500, 790, 200, 30);
        bu.setBounds(800, 920, 400, 100);
        bu.setForeground(Color.white);
        bu.setBackground(Color.red);
        bu.addActionListener(this);
        n.add(l);
        n.add(l1);
        n.add(t1);
        n.add((l2));
        n.add(d);
        n.add(m);
        n.add(y);
        n.add(l3);
        n.add(gn);
        n.add(l4);
        n.add(br);
        n.add(l5);
        n.add(t2);
        n.add(l6);
        n.add(t3);
        n.add(l7);
        n.add(cat);
        n.add(l8);
        n.add(t4);
        n.add(l9);
        n.add(t5);
        n.add(l10);
        n.add(t6);
        n.add(l11);
        n.add(yr);
        n.add(l12);
        n.add(t7);
        n.add(l13);
        n.add(st);
        n.add(l14);
        n.add(t8);
        n.add(l15);
        n.add(t9);
        n.add(bu);
     }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bu)
        {
            String nam  = t1.getText();
             String  dat = d.getSelectedItem().toString();
             String  mon = m.getSelectedItem().toString();
             String  yea = y.getSelectedItem().toString();
             String gen = gn.getSelectedItem().toString();
             String bra = br.getSelectedItem().toString();
             String fat = t2.getText();
             String mom = t3.getText();
             String cate = cat.getSelectedItem().toString();
             String rel = t4.getText();
             String mob = t5.getText();
             String ema = t6.getText();
             String year = yr.getSelectedItem().toString();
             String add = t7.getText();
             String cit = t9.getText();
             String pin = t8.getText();
             String stat = st.getSelectedItem().toString();
             
             
             
             
             BufferedWriter bw;
             File aFile  = new File("C:\\Users\\Dell\\Desktop\\shahu.txt");
             if(!aFile.exists()){
                 try{
                 aFile.createNewFile();
                 }catch(IOException ev){
                     ev.printStackTrace();
                 }
             }
             try{
                 
 
             bw = new BufferedWriter(new FileWriter(aFile,true));
             
             bw.write("Name : ");
             bw.write(nam);
             bw.newLine();
             bw.write("Father's name : ");
             bw.write(fat);
             bw.newLine();
             bw.write("Mother's name : ");
             bw.write(mom);
             bw.newLine();
             bw.write("Date of birth : ");
             bw.write(dat+" - "+mon+" - "+yea);
             bw.newLine();
             bw.write("Gender : ");
             bw.write(gen);
             bw.newLine();
             bw.write("Branch : ");
             bw.write(bra);
             bw.newLine();
             bw.write("Year : ");
             bw.write(year);
             bw.newLine();
             bw.write("Religion : ");
             bw.write(rel);
             bw.newLine();
             bw.write("Category : ");
             bw.write(cate);
             bw.newLine();
             bw.write("Mobile no. : ");
             bw.write(mob);
             bw.newLine();
             bw.write("Email id : ");
             bw.write(ema);
             bw.newLine();
             bw.write("Adress : ");
             bw.write(add);
             bw.newLine();
             bw.write("City : ");
             bw.write(cit);
             bw.newLine();
             bw.write("State : ");
             bw.write(stat);
             bw.newLine();
             bw.write("pincode : ");
             bw.write(pin);
             bw.newLine();
             bw.newLine();
             bw.write("********************************************************************************************************");
             bw.newLine();
             bw.newLine();
             
             bw.flush();
             bw.close();
             
             }catch(Exception ev){
                 ev.printStackTrace();
             }
             
            
             t1.setText(" ");
             t2.setText(" ");
             t3.setText(" ");
             t4.setText(" ");
             t5.setText(" ");
             t6.setText(" ");
             t7.setText(" ");
             t8.setText(" ");
             t9.setText(" ");
             yr.setSelectedItem("---SELECT---");
             gn.setSelectedItem("---SELECT---");
             cat.setSelectedItem("---SELECT---");
             st.setSelectedItem("---SELECT---");
             br.setSelectedItem("---SELECT---");
             d.setSelectedItem("dd");
             m.setSelectedItem("mm");
             y.setSelectedItem("yyyy"); 
             JOptionPane.showMessageDialog(bu, "YOUR FORM IS SUSSESFULLY SUBMITTED");
             frame2();
        }
    }
    void frame2()
        {
            JFrame j=new JFrame();
             Container cont=j.getContentPane();
             j.setTitle("NITESH SHAHU project exit");
             j.setVisible(true);
            j.setLayout(null);
            j.setSize(2000,1500);
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           l=new JLabel("your form is sussesfully submitted");
           l.setFont(fn);
           l.setBounds(100, 100, 2000, 150);
           cont.add(l);
        
        }
    
    
}


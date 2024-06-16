package Simple;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CurrencyConvertor extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Label l1,l2,l3,l4,l5,l6;
Choice ch1,ch2;
TextField tf1,tf2;
Button b1;
public CurrencyConvertor()
{
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBackground(Color.gray);
getContentPane().setLayout(new GridBagLayout());
GridBagConstraints gbc=new GridBagConstraints ();
l1=new Label("Currency Converter");
gbc.gridy=0;
gbc.gridx=2;
gbc.ipadx=40;
gbc.ipady=40;
getContentPane().add(l1,gbc);
l1.setFont(new Font("Algerian",Font.BOLD,30));
l2=new Label("From");
gbc.gridy=1;
gbc.gridx=0;
getContentPane().add(l2,gbc);
l2.setFont(new Font("Algerian",Font.BOLD,20));
ch1=new Choice();
ch1.add("Rupees");
ch1.add("Doller");
ch1.add("Euro");
ch1.add("Yen");
gbc.gridy=1;
gbc.gridx=1;
getContentPane().add(ch1,gbc);
l3=new Label("To");
gbc.gridy=1;
gbc.gridx=2;
getContentPane().add(l3,gbc);
l3.setFont(new Font("Algerian",Font.BOLD,20));
ch2=new Choice();
ch2.add("Rupees");
ch2.add("Doller");
ch2.add("Euro");
ch2.add("Yen");
gbc.gridy=1;
gbc.gridx=3;
getContentPane().add(ch2,gbc);
tf1=new TextField(10);
gbc.gridy=2;
gbc.gridx=1;
getContentPane().add(tf1,gbc);
l5=new Label("In");
gbc.gridy=3;
gbc.gridx=1;
getContentPane().add(l5,gbc);
l5.setFont(new Font("algerian",Font.BOLD,12));
tf2=new TextField(10);
gbc.gridy=2;
gbc.gridx=3;
getContentPane().add(tf2,gbc);
l6=new Label("In");
gbc.gridy=3;
gbc.gridx=3;
getContentPane().add(l6,gbc);
l6.setFont(new Font("algerian",Font.BOLD,12));
b1=new Button("convert");
gbc.gridy=4;
gbc.gridx=2;
getContentPane().add(b1,gbc);
b1.setBackground(Color.cyan);
b1.setFont(new Font("algerian",Font.ROMAN_BASELINE,20));
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String form=ch1.getSelectedItem();
String to=ch2.getSelectedItem();
l5.setText("In "+form);
l6.setText("In "+to);
int amt=Integer.parseInt(tf1.getText());
if(form.equals("Rupees"))
{
switch(to)
{
case "Rupees":
tf2.setText(amt+"");
break;
case "Doller":
double doller=amt/70;
tf2.setText(doller+"");
break;
case "Euro":
double euro=amt/80;
tf2.setText(euro+"");
break;
case "Yen":
double Yen=amt/0.63;
tf2.setText(Yen+"");
break;
default:
tf2.setText("");
break;
}
}
if(form.equals("Doller"))
{
switch(to)
{
case "Rupees":
double rupees=amt*70;
tf2.setText(rupees+"");
break;
case "Doller":
tf2.setText(amt+"");
break;
case "Euro":
double euro=amt*0.80;
tf2.setText(euro+"");
break;
case "Yen":
double Yen=amt*111.087;
tf2.setText(Yen+"");
break;
default:
tf2.setText("");
break;
}
}
if(form.equals("Euro"))
{
switch(to)
{
case "Rupees":
double rupees=amt*80;
tf2.setText(rupees+"");
break;
case "Doller":
double doller=amt*1.14;
tf2.setText(amt+"");
break;
case "Euro":
tf2.setText(amt+"");
break;
case "Yen":
double Yen=amt*127.32;
tf2.setText(Yen+"");
break;
default:
tf2.setText("");
break;
}
}
if(form.equals("yen"))
{
switch(to)
{
case "Rupees":
double rupees=amt*0.63;
tf2.setText(rupees+"");
break;
case "Doller":
double doller=amt*0.008;
tf2.setText(amt+"");
break;
case "Euro":
double euro=amt*0.007;
tf2.setText(euro+"");
break;
case "Yen":
tf2.setText(amt+"");
break;
default:
tf2.setText("");
break;
}
}
}
public static void main(String args[]) {
	CurrencyConvertor cc=new CurrencyConvertor();
	cc.setVisible(true);
	cc.setSize(1400,1200);
}
}


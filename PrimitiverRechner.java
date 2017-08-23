import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;
import javax.swing.*;

public class PrimitiverRechner extends JFrame implements ActionListener
{
	//Attribute
	private JButton button_1 = new JButton("AUSRECHNEN");
	private JButton button_2 = new JButton("LÖSCHEN");
	private JComboBox combobox_1 = new JComboBox();
	private JLabel label_1 = new JLabel("+");
	private JPanel panel_1  = new JPanel();
	private JPanel panel_2 = new JPanel();
	private JTextField textfield_1 = new JTextField(10);
	private JTextField textfield_2 = new JTextField(10);
	private JTextField textfield_3 = new JTextField(10);
	private GridLayout grid = new GridLayout(2,1);
	private Close close_1 = new Close();
	
	public PrimitiverRechner()
	{
		//Panel
		this.add(panel_1); 
		this.add(panel_2); 
		
		//Panel 1
		this.panel_1.add(textfield_1);
		this.panel_1.add(combobox_1);
		this.panel_1.add(textfield_2);
			
		//Panel 2
		this.panel_2.setBackground(Color.darkGray);
		this.panel_2.add(button_1);
		this.panel_2.add(textfield_3);
		this.panel_2.add(button_2);
		
		//ComboBox
		this.combobox_1.addItem("+");
		this.combobox_1.addItem("-");
		this.combobox_1.addItem("*");
		this.combobox_1.addItem("/");
		
		//Grid (Tabelle)
		this.setLayout(grid); 
				
		//PrimitiverRechner (JFrame) / Hauptcontainer
		this.setSize(350,100); 
		this.setResizable(false); 
		this.setVisible(true); 
		this.setTitle("PrimitiverRechner"); 
		
		//WindowListener
		this.addWindowListener(close_1);
		
		//ActionListener
		this.button_1.addActionListener(this);
		this.button_2.addActionListener(this);
		this.combobox_1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt)
	{
		String addieren_1, addieren_2, summestrg;
		int a1, a2, summe;
		String subtrahieren_1, subtrahieren_2, differenzstrg;
		int s1, s2, differenz;
		String multiplizieren_1, multiplizieren_2, produktstrg;
		int m1, m2, produkt;
		String dividieren_1, dividieren_2, quotientstrg;
		int d1, d2, quotient;
		
		if (button_1==evt.getSource())
		{
			if (combobox_1.getSelectedItem()=="+")
			{
				addieren_1 = textfield_1.getText();
				a1 = Integer.parseInt(addieren_1);
				addieren_2 = textfield_2.getText();
				a2 = Integer.parseInt(addieren_2);
				
				summe = a1+a2;
				summestrg = Integer.toString(summe);
				textfield_3.setText(summestrg);
			}
			
			if (combobox_1.getSelectedItem()=="-")
			{
				subtrahieren_1 = textfield_1.getText();
				s1 = Integer.parseInt(subtrahieren_1);
				subtrahieren_2 = textfield_2.getText();
				s2 = Integer.parseInt(subtrahieren_2);
				
				differenz = s1-s2;
				differenzstrg = Integer.toString(differenz);
				textfield_3.setText(differenzstrg);
			}
			
			if (combobox_1.getSelectedItem()=="*")
			{
				multiplizieren_1 = textfield_1.getText();
				m1 = Integer.parseInt(multiplizieren_1);
				multiplizieren_2 = textfield_2.getText();
				m2 = Integer.parseInt(multiplizieren_2);
				
				produkt = m1*m2;
				produktstrg = Integer.toString(produkt);
				textfield_3.setText(produktstrg);
			}
			
			if (combobox_1.getSelectedItem()=="/")
			{
				dividieren_1 = textfield_1.getText();
				d1 = Integer.parseInt(dividieren_1);
				dividieren_2 = textfield_2.getText();
				d2 = Integer.parseInt(dividieren_2);
				
				quotient = d1/d2;
				quotientstrg = Integer.toString(quotient);
				textfield_3.setText(quotientstrg);
			}
		}
		
		if (button_2==evt.getSource())
		{
			this.textfield_1.setText("");
			this.textfield_2.setText("");
			this.textfield_3.setText("");
		}
	}
}

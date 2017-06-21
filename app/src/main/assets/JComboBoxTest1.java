package com.ocean.java.swing;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class  JComboBoxTest1  implements  ItemListener
{
	JComboBox<String> cb;
	JLabel lbl;
	public JComboBoxTest1()
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout(FlowLayout.CENTER));	
		cb = new JComboBox<String>();
		lbl = new JLabel("Select an Item.");	
		cb.addItem("AAA");
		cb.addItem("BBB");
		cb.addItem("CCC");
		cb.addItem("DDD");		
		f.add(cb);
		f.add(lbl);		
		cb.addItemListener(this);
		f.setSize(300, 200);
		f.setVisible(true);
	}

	public void itemStateChanged(ItemEvent  ie) 
	{
        Object item = cb.getSelectedItem();
		lbl.setText("Selected Item : " + item);
    }
	public static void main(String[ ] args) 
	{
		new JComboBoxTest1();
	}
}


package com.ardublock.ui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.w3c.dom.Element;

import com.ardublock.ui.listener.GenerateCodeButtonListener;
import com.ardublock.ui.listener.OpenButtonListener;
import com.ardublock.ui.listener.SaveButtonListener;

import edu.mit.blocks.controller.WorkspaceController;

public class ConsoleFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4057010070646255290L;

	private WorkspaceController wc;
	public ConsoleFrame(WorkspaceController wc, Element lang)
	{
		this.wc = wc;
		
		this.setLayout(new FlowLayout());
		
		JButton generateButton = new JButton("generate code");
		generateButton.addActionListener(new GenerateCodeButtonListener());
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new SaveButtonListener(wc));
		
		JButton openButton = new JButton("open");
		openButton.addActionListener(new OpenButtonListener(wc, lang));
		
		this.add(generateButton);
		this.add(saveButton);
		this.add(openButton);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 100);
	}
}
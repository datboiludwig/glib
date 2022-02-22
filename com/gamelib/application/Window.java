package com.gamelib.application;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import com.gamelib.input.Input;

public class Window extends Canvas {

	private static final long serialVersionUID = 4468509268171970692L;
	
	private JFrame window;
	private BufferStrategy bs;
	
	public Graphics2D g;
	
	private Color bg;
	
	public Window(int width, int height, String title, boolean resizable) {
		setPreferredSize(new Dimension(width, height));
		setMaximumSize(new Dimension(width, height));
		setMinimumSize(new Dimension(width, height));
		
		window = new JFrame(title);
		window.add(this);
		window.pack();
		window.setResizable(resizable);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		createBufferStrategy(2);
		
		bg = new Color(0, 0, 0, 255);
	}
	
	public Window(int width, int height, String title, boolean resizable, KeyListener keyListener) {
		addKeyListener(keyListener);
		
		setPreferredSize(new Dimension(width, height));
		setMaximumSize(new Dimension(width, height));
		setMinimumSize(new Dimension(width, height));
		
		window = new JFrame(title);
		window.add(this);
		window.pack();
		window.setResizable(resizable);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		createBufferStrategy(2);
		
		bg = new Color(0, 0, 0, 255);
	}

	public Graphics2D prepare() {
		bs = getBufferStrategy();
		
		g = (Graphics2D) bs.getDrawGraphics();
		
		g.setColor(bg);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		return g;
	}
	
	public boolean shouldClose() {
		return !window.isShowing();
	}
	
	public void setBackGround(Color c) {
		bg = c;
	}
	
	public void swapBuffers() {
		g.dispose();
		bs.show();
	}
}

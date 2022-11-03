package com.gamelib.object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.List;

public abstract class GameObject {
	
	protected int x, y;
	protected float hsp, vsp;
	
	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void tick(List<GameObject> objects);
	public abstract void render(Graphics2D g);
	public abstract Rectangle getBounds();
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	
	public float getHsp() { return hsp; }
	public float getVsp() { return vsp; }
	
	public void setHsp(float hsp) { this.hsp = hsp; }
	public void setVsp(float vsp) { this.vsp = vsp; }
}

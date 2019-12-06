package com.gamelib.object;

import java.awt.Graphics2D;
import java.util.LinkedList;

public class Handler {
	
	public LinkedList<GameObject> objects = new LinkedList<GameObject>();
	
	public void tick() {
		for(GameObject obj : objects) {
			obj.tick(objects);
		}
	}
	
	public void render(Graphics2D g) {
		for(GameObject obj : objects) {
			obj.render(g);
		}
	}
	
	public void addObject(GameObject object) {
		objects.add(object);
	}
	
	public void removeObject(GameObject object) {
		objects.remove(object);
	}
}

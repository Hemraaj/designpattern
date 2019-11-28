package com.hemu.designpattern.decorator;

/**
 * @author hemchand.mahto
 */
public interface Shape {
	void draw();
	void resize();
	String description();
	boolean isHide();
}

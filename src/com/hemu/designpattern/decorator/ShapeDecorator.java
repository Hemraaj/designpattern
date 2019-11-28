package com.hemu.designpattern.decorator;

/**
 * @author hemchand.mahto
 */

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}
}
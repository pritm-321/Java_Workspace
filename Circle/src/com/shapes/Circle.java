package com.shapes;

public class Circle {
	private float radius;
	float pi = 3.5f;

	public Circle() {
		radius = 1.5f;
	}

	Circle(float radius) {
		this.radius = radius;
		Circle o2 = new Circle(this.radius, 3.5f);
	}

	Circle(float radius, float pi) {
		this.radius = radius;
		this.pi = pi;
	}

	double calculateCircleArea(float r) {
		double area;
		area = pi * r * r;
		return area;
	}

	double calculateCircumference(float r) {
		double circum;
		circum = pi * r * r;
		return circum;
	}

}

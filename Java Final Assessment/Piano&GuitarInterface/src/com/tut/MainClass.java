package com.tut;

public class MainClass {
	public static void main(String[] args) {
		Guitar guitar;
		Piano piano;
		guitar = new Instrument();
		piano = new Instrument();
		System.out.print("Guitar\n");
		guitar.play();
		System.out.print("Piano");
		piano.play();
	}
}

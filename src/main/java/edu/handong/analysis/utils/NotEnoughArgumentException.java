package edu.handong.analysis.utils;

public class NotEnoughArgumentException extends Exception{
	public NotEnoughArgumentException() {
		super("Not Enough Argument! Please try again..\n");
	}
	public NotEnoughArgumentException(String message) {
		super(message);
	}

}

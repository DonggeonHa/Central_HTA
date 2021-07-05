package com.sample.board.exception;

public class CommonException extends RuntimeException {

	private static final long serialVersionUID = -3259486090723904403L;

	public CommonException(String message) {
		super(message);
	}
	
	public CommonException(Throwable cause) {
		super(cause);
	}
	
	public CommonException(String message, Throwable cause) {
		super(message, cause);
	}
}

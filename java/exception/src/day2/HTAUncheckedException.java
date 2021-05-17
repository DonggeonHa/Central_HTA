package day2;

public class HTAUncheckedException extends RuntimeException {

	public HTAUncheckedException(String msg) {
		super(msg);
	}
	
	public HTAUncheckedException(String msg, Throwable couse) {
		super(msg, couse);
	}
}

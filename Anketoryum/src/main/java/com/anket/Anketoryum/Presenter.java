package com.anket.Anketoryum;

public class Presenter {
	private int code;
	private String message;
	private Object result;

	
	public Presenter(int code, String message, Object result){
		this.code = code;
		this.message = message;
		this.result = result;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}

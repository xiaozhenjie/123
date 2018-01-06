package com.try_catch;

public class LogicException extends RuntimeException{

	private static final long serialVersionUID = -7606039630237051804L;

	public LogicException() {
		super();
	}
	/*
	 * 表示当前异常的原因/信息
	 * 表示当前异常的根本原因
	 */
	public LogicException(String message, Throwable cause) {
		super(message, cause);
	}

	public LogicException(String message) {
		super(message);
	}
	
	

}

package com.try_catch;

public class LogicException extends RuntimeException{

	private static final long serialVersionUID = -7606039630237051804L;

	public LogicException() {
		super();
	}
	/*
	 * ��ʾ��ǰ�쳣��ԭ��/��Ϣ
	 * ��ʾ��ǰ�쳣�ĸ���ԭ��
	 */
	public LogicException(String message, Throwable cause) {
		super(message, cause);
	}

	public LogicException(String message) {
		super(message);
	}
	
	

}

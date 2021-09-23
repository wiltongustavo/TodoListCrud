package cap.com.br.handler;

import lombok.Data;

@Data
public class HandlerException extends Exception {
	
	
	private String message;
	
	
	public HandlerException(String message) {
		this.message = message;
	}
	

}

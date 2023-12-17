package architecture.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class BusinessException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 에러 분류
	private String type;
	// 에러 코드
	private String errorCode;
	// 에러 메시지
	private String message;
	
	public BusinessException() {
	}
	
	@Builder
	public BusinessException(String type, String errorCode, String message) {
		this.type = type;
		this.errorCode = errorCode;
		this.message = message;
	}
	
}

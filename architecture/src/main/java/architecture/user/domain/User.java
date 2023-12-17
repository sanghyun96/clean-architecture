package architecture.user.domain;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {	
	
	// 고유번호
	private String userId;
	// 사용자 그룹 고유번호
	private Integer userGroupId;
	// 사용자 그룹명(화면용)
	private String userGroupName;
	// 이름
	private String userName;
	// 비밀번호
	private String password;
	
	// 핸드폰 번호
	private String phoneNumber;
	// 이메일
	private String email;
	// 주소
	private String address;
	// 로그인 횟수
	private Long loginCount;
	// 로그인 실패 횟수
	private Integer failLoginCount;
	// 마지막 로그인 비밀번호 변경 날짜
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime lastPasswordChangeDate;
	// 마지막 로그인 날짜
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime lastLoginDate;
	// 사용자 상태. USE:사용중, PERMISSION_DENIED:사용중지, EXCEEDED_RETRIES:비밀번호 실패 횟수 초과, UNUSED:휴먼 상태, EXPIRED:사용기간 종료, 
	// LOGICAL_DELETE:삭제(화면 비표시), PASSWORD_EXPIRATION:비밀번호 유효기간 만료, TEMP_PASSWORD:임시 비밀번호, WAITING_APPROVAL:승인대기
	private String status;

	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime modifiedDate;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdDate;
}

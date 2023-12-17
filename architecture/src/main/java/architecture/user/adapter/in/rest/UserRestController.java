package architecture.user.adapter.in.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import architecture.common.ResultResponse;
import architecture.common.SessionKey;
import architecture.common.UserSession;
import architecture.user.application.port.in.UserService;
import architecture.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserRestController {
	
	private final UserService userService;
	
	/**
	 * 
	 * @param userSession
	 * @param user
	 * @return
	 */
	@PutMapping
	public ResultResponse<Integer> save(@SessionAttribute(name = SessionKey.USER_SESSION, required = false) UserSession userSession, @RequestBody User user) {									
		
		userService.save(user);
		
		return ResultResponse.<Integer>builder()
				.status(HttpStatus.OK.value())
				.build();
	}	
}

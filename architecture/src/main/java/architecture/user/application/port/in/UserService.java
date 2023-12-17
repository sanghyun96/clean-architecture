package architecture.user.application.port.in;

import architecture.user.domain.User;

public interface UserService {

	/**
	 * 사용자 등록
	 * @param user
	 * @return
	 */
	int save(User user);
	
}

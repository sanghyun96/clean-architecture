package architecture.user.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import architecture.user.adapter.out.persistence.UserEntity;
import architecture.user.adapter.out.persistence.UserRepository;
import architecture.user.application.port.in.UserService;
import architecture.user.domain.User;
import architecture.util.ModelMapperWrapper;

@Service
public class UserServiceImpl implements UserService {	
	
	@Autowired UserRepository userRepository;	
	
	/**
	 * 사용자 등록
	 * @param user
	 * @return
	 */
	public int save(User user) {	
		
        // User를 UserEntity로 변환
        UserEntity userEntity = ModelMapperWrapper.map(user, UserEntity.class);
        
        UserEntity savedUserEntity = userRepository.save(userEntity);
        
        Integer userId = Integer.parseInt(savedUserEntity.getUserId());
        
        return userId;
	}

}

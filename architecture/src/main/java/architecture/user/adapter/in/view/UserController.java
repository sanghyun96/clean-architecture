package architecture.user.adapter.in.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller
@RequestMapping("/login")
public class UserController {
		
	/**
	 * 로그인 페이지 이동
	 * @param request
	 * @param model
	 * @return
	 */
	@GetMapping
	public String login(HttpServletRequest request, Model model) {

		return "/login/login";
	}	
}

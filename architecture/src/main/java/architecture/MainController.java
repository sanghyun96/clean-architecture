package architecture;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import architecture.common.SessionKey;
import architecture.common.UserSession;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller
@RequestMapping("/main")
public class MainController {
	
	/**
	 * 메인 화면
	 * @param request
	 * @param model
	 * @param userSession
	 * @return
	 */
	@GetMapping
	public String index(HttpServletRequest request, Model model, @SessionAttribute(name = SessionKey.USER_SESSION, required = false) UserSession userSession) {
		
		return "/main/index";
	}

}

package login.login.home;

import login.login.ForbiddenException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class HomeService {
   public String checkAuthentication(Authentication authentication, Model model)
   {
       if(authentication == null)
       {
           throw new ForbiddenException("Forbidden");
       }
       String user = authentication.getName();
       model.addAttribute("message", user);
       return "home";
   }
}

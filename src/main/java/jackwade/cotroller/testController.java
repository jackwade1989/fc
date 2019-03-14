package jackwade.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("hello man fianlly!!!!!!!!!!!!!!!");
        return "index";
    }
}

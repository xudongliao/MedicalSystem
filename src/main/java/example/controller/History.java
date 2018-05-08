package example.controller;
import org.apache.commons.logging.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/history")
public class History {
    private static final Log logger = LogFactory.getLog(History.class);
    @RequestMapping(value = "/history1")
    public String history(){
        return "history";
    }

}

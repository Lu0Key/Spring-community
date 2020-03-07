package community.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LuoKey
 * @version 1.0
 * @date 2020/3/7 20:34
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){return "index";}
}

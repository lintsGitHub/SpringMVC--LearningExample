package org.lint.cros;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin

@Controller
@RequestMapping
public class CROSController{

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/hello")
    public String seyHello(Exception e){
        return "成功返回数据";
    }

    @ResponseBody
    @RequestMapping("/hi")
    public String seyHi(){
        return "成功返回Hi";
    }
}

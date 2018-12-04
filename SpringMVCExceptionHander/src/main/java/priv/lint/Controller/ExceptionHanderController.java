package priv.lint.Controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import priv.lint.Exceptions.FromID;
import priv.lint.Exceptions.PersonMsg;

import java.util.Date;


@RestController
@CrossOrigin
public class ExceptionHanderController {

    @RequestMapping(value = "/a")
    @ResponseBody
    public PersonMsg aa(@RequestParam(value = "id" , required = false) @FromID PersonMsg personMsg){
        return personMsg;
    }
}

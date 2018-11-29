package priv.lint.Controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.lint.Exceptions.FromID;
import priv.lint.Exceptions.PersonMsg;

import java.util.Date;


@Controller
@CrossOrigin
public class ExceptionHanderController {

    @RequestMapping("/a")
    public void aa(@FromID PersonMsg personMsg){
        personMsg.getBirthday();
    }

    @RequestMapping("/a2")
    public void a(@DateTimeFormat Date personMsg){

        personMsg.toString();
    }
}

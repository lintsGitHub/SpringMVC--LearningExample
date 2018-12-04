package priv.lint.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Consumer;

@RestController
public class CodeContoller {
//    这里面涉及到一个(Producer/Consumer)生产/消费者模式
//    就是从字面上了解这个模式的意思就可以了
//    设置请求内容必须是text/html
//    @RequestMapping(value = "/hello",consumes = "text/html")
//    设置客户端接收的数据是json，并且编码是UTF-8
//    @RequestMapping(value = "/hello", produces = "application/json; charset=UTF-8")
    public String seyHello(){
        return "你好";
    }
}

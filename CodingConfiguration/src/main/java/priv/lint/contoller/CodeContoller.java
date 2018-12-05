package priv.lint.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.lint.entity.Student;

import java.util.Date;

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


//    我们还可以这样去写，因为RequestMappingHandlerAdapter 包含了很多东西，刚好也包含了一个HttpMessageConverter的属性
//    它是一个List<HttpMessageConverter<?>> 集合，我们就可以在这个集合中添加我们的规则也就是转换器
//    SpringMVC在使用转换器时是通过集合一个个拿出来使用的
//    所以我们的转换器要往上移一移
//    这里引申出一个问题，对集合的一些基本操作要熟悉
//    @Autowired
//    RequestMappingHandlerAdapter adapter;
//
//    @RequestMapping("/aa")
//    public String test(){
//        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
//        stringHttpMessageConverter.setDefaultCharset(Charset.forName("utf-8"));
//        List<HttpMessageConverter<?>> messageConverters = adapter.getMessageConverters();
////        使用list的一些方法来挪动位置
//        HttpMessageConverter<?> httpMessageConverter = messageConverters.get(0);
//        messageConverters.set(0,stringHttpMessageConverter);
//        messageConverters.add(httpMessageConverter);
////        它本身也提供了一个方法来进行该操作
////        messageConverters.add(0,stringHttpMessageConverter);
//        return "aa";
//    }

    @Autowired
    Student student;

    @RequestMapping("/student")
    public Student getStudent(){
        student.setAge(12);
        student.setName("HelloWord");
        student.setBirthday(new Date());
        student.setHobby("吃饭啊");
        return student;
    }

}

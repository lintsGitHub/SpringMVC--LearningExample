package org.lint.cros;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component  //指示注释的类是“组件”。当使用基于注释的配置和类路径扫描时，此类类被认为是自动检测的候选类。也就是当配置时就要将这个类跑一遍
@ControllerAdvice //方法，注解等等全局应用于所有控制器
@Controller
public class AOPCROS  {
    public void seyHello(){
        System.out.println("seyHello");
    }
}

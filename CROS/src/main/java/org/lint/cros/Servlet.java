package org.lint.cros;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        如果是简单的一个servlet还好，如果多个都要跨域那就很麻烦了，
//        但是我们有过滤器啊（可以使用过滤器进行过滤）
//        网址多，写在代码中也是一个问题，我们可以把它写在配置文件里，或者写在外部文件中
//        这些都可以实现
//
        //        定义一个数组来存放我想它跨域访问资源的网址
        String[] allowList = new String[]{
          "http://192.168.2.73:8081"
        };
//        获取请求头origin的值
        String origin = request.getHeader("Origin");
//        定义一个boolean类型来判断是否要设置跨域
        boolean isAllow = false;

//        进行逻辑判断请求的URL是否是在范围中
        if(origin != null && !origin.isEmpty()){

            for (String s : allowList) {
                if(origin.equals(s)) {
                    isAllow = true;
                    break;
                }
            }
        }
        if(isAllow){
            response.setHeader("Access-Control-Allow-Origin",origin);
        }
//        返回数据啦
        PrintWriter writer = response.getWriter();
        writer.print("This is servlet Data");
    }
}

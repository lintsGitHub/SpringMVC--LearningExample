package org.lint.cros;



import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


public class SpringMVCMyCrosFilter extends CorsFilter {
    public SpringMVCMyCrosFilter() {
        super(configSourceSource());
    }
    private static UrlBasedCorsConfigurationSource configSourceSource(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration对象是可以进行对跨域参数配置
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("http://192.168.2.135:8081");
         configuration.addAllowedHeader("Access-Control-Allow-Origin");
//        我们可以添加多个CorsConfiguration对象到UrlBasedCorsConfigurationSource里
//        传俩个参数1.http://192.168.2.135:8081/cros.html 的 /cros.html, 这个参数可以使用通配符
//        第二个参数就是配置了
        source.registerCorsConfiguration("/*",configuration);
//        例如我们有一个configuration1对象也配好了
//        source.registerCorsConfiguration("/*",configuration1);
        return source;
    }
}

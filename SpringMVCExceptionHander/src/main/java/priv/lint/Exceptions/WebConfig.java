package priv.lint.Exceptions;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        FromIDFactory fromIDAnnotationFormatter = new FromIDFactory();
        registry.addFormatterForFieldAnnotation(fromIDAnnotationFormatter);
    }
}

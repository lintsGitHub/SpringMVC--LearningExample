package priv.lint.Exceptions;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.util.StringUtils;

import java.util.*;

public class FromIDAnnotationFormatter implements AnnotationFormatterFactory<FromID> {
    private static final Set<Class<?>> FIELD_TYPES;

    static {
        Set<Class<?>> fieldTypes = new HashSet<>(4);
        fieldTypes.add(Date.class);
        fieldTypes.add(Calendar.class);
        fieldTypes.add(Long.class);
        FIELD_TYPES = Collections.unmodifiableSet(fieldTypes);
    }


    @Override
    public Set<Class<?>> getFieldTypes() {
        return FIELD_TYPES;
    }



    @Override
    public Printer<?> getPrinter(FromID annotation, Class<?> fieldType) {
        return getFormatter(annotation, fieldType);
    }

    @Override
    public Parser<?> getParser(FromID annotation, Class<?> fieldType) {
        return getFormatter(annotation, fieldType);
    }

    protected Formatter<PersonMsg> getFormatter(FromID annotation, Class<?> fieldType) {
        PersonMsgService formatter = new PersonMsgService();
//        String style = resolveEmbeddedValue(annotation.style());
//        if (StringUtils.hasLength(style)) {
//            formatter.setStylePattern(style);
//        }
//        formatter.setIso(annotation.iso());
//        String pattern = resolveEmbeddedValue(annotation.pattern());
//        if (StringUtils.hasLength(pattern)) {
//            formatter.setPattern(pattern);
//        }
        return formatter;
    }
}

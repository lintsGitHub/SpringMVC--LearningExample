package priv.lint.Exceptions;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.*;

public class FromIDFactory implements AnnotationFormatterFactory<FromID> {

    private static final Set<Class<?>> FIELD_TYPES;

    static {
        Set<Class<?>> fieldTypes = new HashSet<>(4);
        fieldTypes.add(PersonMsg.class);
        FIELD_TYPES = fieldTypes;
    }

    @Override
    public Set<Class<?>> getFieldTypes() {
        return FIELD_TYPES;
    }

    @Override
    public Printer<?> getPrinter(FromID annotation, Class<?> fieldType) {
        return configureFormatterFrom(annotation);
    }

    @Override
    public Parser<?> getParser(FromID annotation, Class<?> fieldType) {
        return configureFormatterFrom(annotation);
    }

    private Formatter configureFormatterFrom(FromID a){
        return  new FromIDFormatter();
    }
}

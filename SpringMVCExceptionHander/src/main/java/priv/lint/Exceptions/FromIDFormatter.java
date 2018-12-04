package priv.lint.Exceptions;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class FromIDFormatter implements Formatter<PersonMsg> {
    private static Map<String,String> map = new HashMap<>();
    static {
        map.put("44","广东");
    }

    @Override
    public PersonMsg parse(String text, Locale locale) throws ParseException {
        return new PersonMsg(map.get(text.substring(0,2)),new SimpleDateFormat().parse(text.substring(6,14)),text.charAt(16)%2==0?"男":"女");
    }

    @Override
    public String print(PersonMsg object, Locale locale) {
        return null;
    }
}

package priv.lint.Exceptions;

import org.springframework.format.Formatter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.method.HandlerMethod;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class PersonMsgService implements Formatter<PersonMsg> {
    Map<Integer,String> map = new HashMap<>();
    {
        map.put(123456,"广东");
    }

    @Override
    public PersonMsg parse(String s, Locale locale) throws ParseException {
        String province = s.substring(0, 5);
        String birthday = s.substring(6, 13);
        String gender = s.substring(16,17);
        System.out.println(province);
        return null;
    }

    @Override
    public String print(PersonMsg personMsg, Locale locale) {
        return null;
    }
}

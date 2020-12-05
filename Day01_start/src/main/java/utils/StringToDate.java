package utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author
 * @create 2020-10-15 15:32
 */
public class StringToDate implements Converter<String, Date>{

    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("空值");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("转换错误");
        }
    }
}

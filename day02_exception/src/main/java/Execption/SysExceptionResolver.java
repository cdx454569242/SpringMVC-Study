package Execption;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author
 * @create 2020-10-18 9:06
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysException exception = null;
        if(e instanceof SysException){
            exception = (SysException)e;
        }else{
            exception = new SysException("系统正在维护");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",exception.getMessage());
        mv.setViewName("error");
        return mv;
    }
}

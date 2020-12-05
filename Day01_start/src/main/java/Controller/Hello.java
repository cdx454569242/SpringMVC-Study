package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author
 * @create 2020-10-14 20:27
 */
@Controller
@RequestMapping(path = "/user")
public class Hello {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello springMVC");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping",method = {RequestMethod.GET,RequestMethod.POST})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping");
        return "success";
    }
}

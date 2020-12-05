package Controller;

import domian.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author
 * @create 2020-10-17 9:06
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testStringOK....");
        User user = new User();
        user.setUsername("abc");
        user.setPassword("123");
        user.setAge(18);

        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoidOK....");
//        request.getRequestDispatcher("WEB-INF/pages/success.jsp").forward(request,response);

//        response.sendRedirect(request.getContextPath()+"/index.jsp");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().write("hello");
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();

        System.out.println("testModelAndView....");
        User user = new User();
        user.setUsername("abc");
        user.setPassword("123");
        user.setAge(18);

        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect....");

//        return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/index.jsp";
    }

    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax....");
        user.setUsername("abc");
        user.setAge(18);

        System.out.println(user);
        return user;
    }



}

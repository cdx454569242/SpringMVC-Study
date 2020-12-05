package Controller;

import com.sun.net.httpserver.HttpsServer;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @author
 * @create 2020-10-17 14:46
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/fileUpLoad1")
    public String fileUpLoad1(HttpServletRequest request) throws Exception {
        System.out.println("upload......");
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdir();
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> items = upload.parseRequest(request);
        for(FileItem item : items){
            if(item.isFormField()){

            }else{
                String filename = item.getName();
                item.write(new File(realPath,filename));
                item.delete();
            }
        }
        return "success";
    }

    @RequestMapping("/fileUpLoad2")
    public String fileUpLoad2(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("upload......");
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdir();
        }
        String filename = upload.getOriginalFilename();
        upload.transferTo(new File(realPath,filename));
        return "success";
    }
}

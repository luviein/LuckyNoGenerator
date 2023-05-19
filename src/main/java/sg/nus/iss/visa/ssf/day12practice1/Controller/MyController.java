package sg.nus.iss.visa.ssf.day12practice1.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import sg.nus.iss.visa.ssf.day12practice1.Image.Image;
import sg.nus.iss.visa.ssf.day12practice1.Service.RandNumService;

@Controller
@RequestMapping
public class MyController {
    
    @Autowired
    RandNumService service;

    @GetMapping
    public String getHome(){
        return "home";
    }

    @GetMapping("/get")
    public String getRandom(Model model, @RequestParam("name") String name){
        
        //String userName = request.getParameter("name").trim();
        System.out.println("name is: " + name);
        List<Integer> intList = service.generateRandNumbers(1);

        List<Image> imageList = new ArrayList<>();

        for(int randomNo : intList){
            imageList.add(new Image(Integer.toString(randomNo), "/images/" + randomNo + ".png"));
        }

        System.out.println("image list" + imageList);

        model.addAttribute(imageList);
        
        return "display";
    }
    
    
}

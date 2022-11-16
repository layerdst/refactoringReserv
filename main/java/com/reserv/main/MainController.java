package com.reserv.main;

import com.reserv.main.dto.CategoryList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(){
        return "page/mainpage";
    }

    @GetMapping("/main/category")
    public String main(Model model){
        return null;
    }


}

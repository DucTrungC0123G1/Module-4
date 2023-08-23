package com.example.ss8_user.controller;

import com.example.ss8_user.dto.UserDto;
import com.example.ss8_user.model.User;
import com.example.ss8_user.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("user/index")
    public String showFormRegister(Model model){
        UserDto userDto = new UserDto();
        model.addAttribute("userDto",userDto);
        return "index";
    }

    @PostMapping("/index")
    public String save(@Validated @ModelAttribute UserDto userDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes){
        new UserDto().validate(userDto,bindingResult);
        if (bindingResult.hasErrors()){
            return "index";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        userService.add(user);
        redirectAttributes.addFlashAttribute("mess","ADD Success");
        return "result";
    }
}

package com.example.thuc_hanh_ss3.controller;

import com.example.thuc_hanh_ss3.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(ModelMap modelMap) {
        modelMap.addAttribute("employee", new Employee());
        return "/create";
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("contactNumber", employee.getContactNumber());
        modelMap.addAttribute("id", employee.getId());
        return "/info";

    }
}

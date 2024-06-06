package com.example.asm2.Bailam.controller;

import com.example.asm2.Bailam.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Sanpham")
public class SanPhamController {
    @Autowired
    SanPhamService sanPhamService;

    @GetMapping("/lost")
    public String showform(Model model){
        model.addAttribute("list",sanPhamService.getAll());
        return "Sanpham/index";
    }
}

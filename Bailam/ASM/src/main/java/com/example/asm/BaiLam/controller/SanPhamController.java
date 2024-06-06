package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {
    @Autowired
    SanphamService sanphamService;

    @GetMapping("/list")
    public String show(Model model){
        model.addAttribute("list",sanphamService.getAll());
        return "sanpham/index";
    }
}

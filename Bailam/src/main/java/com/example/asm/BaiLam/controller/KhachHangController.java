package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.entity.KhachHang;
import com.example.asm.BaiLam.entity.SanPham;
import com.example.asm.BaiLam.service.KhachhangService;
import com.example.asm.BaiLam.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
    @Autowired
    KhachhangService service;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", service.getAllCategory(p));
        return "khachhang/index";
    }
    @GetMapping("/showadd")
    public String showadd(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "khachhang/create";
    }
    @PostMapping("create")
    public String add(KhachHang khachHang){
        service.add(khachHang);
        return "redirect:/khachhang/list";
    }
    @GetMapping("/detail")
    public String showdetail(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "khachhang/detail";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
        service.delete(id);
        return "redirect:/khachhang/list";
    }
    @GetMapping("showupdate")
    public String showup(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "khachhang/update";
    }
    @PostMapping("/update")
    public String update(KhachHang khachHang){
       service.update(khachHang);
        return "redirect:/khachhang/list";
    }
}

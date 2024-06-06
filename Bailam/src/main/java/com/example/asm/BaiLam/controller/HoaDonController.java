package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.entity.HoaDon;
import com.example.asm.BaiLam.entity.KhachHang;
import com.example.asm.BaiLam.service.HoadonService;
import com.example.asm.BaiLam.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hoadon")
public class HoaDonController {
    @Autowired
    HoadonService service;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", service.getAllCategory(p));
        return "hoadon/index";
    }
    @GetMapping("/showadd")
    public String showadd(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "hoadon/create";
    }
    @PostMapping("create")
    public String add(HoaDon hoaDon){
        service.add(hoaDon);
        return "redirect:/hoadon/list";
    }
    @GetMapping("/detail")
    public String showdetail(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "hoadon/detail";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
        service.delete(id);
        return "redirect:/hoadon/list";
    }
    @GetMapping("showupdate")
    public String showup(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "hoadon/update";
    }
    @PostMapping("/update")
    public String update(HoaDon hoaDon){
        service.update(hoaDon);
        return "redirect:/hoadon/list";
    }
}

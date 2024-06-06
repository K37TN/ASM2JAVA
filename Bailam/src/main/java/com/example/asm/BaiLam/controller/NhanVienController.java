package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.entity.NhanVien;
import com.example.asm.BaiLam.entity.SanPham;
import com.example.asm.BaiLam.service.NhanvienService;
import com.example.asm.BaiLam.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
    @Autowired
    NhanvienService service;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", service.getAllCategory(p));
        return "nhanvien/index";
    }
    @GetMapping("/showadd")
    public String showadd(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "nhanvien/create";
    }
    @PostMapping("create")
    public String add(NhanVien nhanVien){
        service.add(nhanVien);
        return "redirect:/nhanvien/list";
    }
    @GetMapping("/detail")
    public String showdetail(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "nhanvien/detail";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
        service.delete(id);
        return "redirect:/nhanvien/list";
    }
    @GetMapping("showupdate")
    public String showup(Model model,Integer id){
        model.addAttribute("list",service.detail(id));
        return "nhanvien/update";
    }
    @PostMapping("/update")
    public String update(NhanVien nhanVien){
        service.update(nhanVien);
        return "redirect:/nhanvien/list";
    }
}

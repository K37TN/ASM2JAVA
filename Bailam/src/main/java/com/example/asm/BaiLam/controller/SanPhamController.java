package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.entity.SanPham;
import com.example.asm.BaiLam.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {
    @Autowired
    SanphamService sanphamService;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", sanphamService.getAllCategory(p));
        return "sanpham/index";
    }
    @GetMapping("/showadd")
    public String showadd(Model model,Integer id){
        model.addAttribute("list",sanphamService.detail(id));
        return "sanpham/create";
    }
    @PostMapping("create")
    public String add(SanPham sanPham){
        sanphamService.add(sanPham);
        return "redirect:/sanpham/list";
    }
    @GetMapping("/detail")
    public String showdetail(Model model,Integer id){
        model.addAttribute("list",sanphamService.detail(id));
        return "sanpham/detail";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
        sanphamService.delete(id);
        return "redirect:/sanpham/list";
    }
    @GetMapping("showupdate")
    public String showup(Model model,Integer id){
        model.addAttribute("list",sanphamService.detail(id));
        return "sanpham/update";
    }
    @PostMapping("/update")
    public String update(SanPham sanPham){
        sanphamService.update(sanPham);
        return "redirect:/sanpham/list";
    }
}

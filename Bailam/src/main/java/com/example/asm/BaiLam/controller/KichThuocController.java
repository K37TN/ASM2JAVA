package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.entity.KhachHang;
import com.example.asm.BaiLam.entity.KichThuoc;
import com.example.asm.BaiLam.service.KhachhangService;
import com.example.asm.BaiLam.service.KichThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/kichthuoc")
public class KichThuocController {
    @Autowired
    KichThuocService kichThuocService;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", kichThuocService.getAllCategory(p));
        return "kichthuoc/index";
    }
    @GetMapping("/showadd")
    public String showadd(Model model,Integer id){
        model.addAttribute("list",kichThuocService.detail(id));
        return "kichthuoc/create";
    }
    @PostMapping("create")
    public String add(KichThuoc kichThuoc){
        kichThuocService.add(kichThuoc);
        return "redirect:/kichthuoc/list";
    }
    @GetMapping("/detail")
    public String showdetail(Model model,Integer id){
        model.addAttribute("list",kichThuocService.detail(id));
        return "kichthuoc/detail";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
        kichThuocService.delete(id);
        return "redirect:/kichthuoc/list";
    }
    @GetMapping("showupdate")
    public String showup(Model model,Integer id){
        model.addAttribute("list",kichThuocService.detail(id));
        return "kichthuoc/update";
    }
    @PostMapping("/update")
    public String update(KichThuoc kichThuoc){
        kichThuocService.update(kichThuoc);
        return "redirect:/kichthuoc/list";
    }
}

package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.entity.HoaDon;
import com.example.asm.BaiLam.entity.MauSac;
import com.example.asm.BaiLam.service.HoadonService;
import com.example.asm.BaiLam.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mausac")
public class MauSacController {
    @Autowired
    MauSacService mauSacService;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", mauSacService.getAllCategory(p));
        return "mausac/index";
    }
    @GetMapping("/showadd")
    public String showadd(Model model,Integer id){
        model.addAttribute("list",mauSacService.detail(id));
        return "mausac/create";
    }
    @PostMapping("create")
    public String add(MauSac mauSac){
        mauSacService.add(mauSac);
        return "redirect:/mausac/list";
    }
    @GetMapping("/detail")
    public String showdetail(Model model,Integer id){
        model.addAttribute("list",mauSacService.detail(id));
        return "mausac/detail";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
        mauSacService.delete(id);
        return "redirect:/mausac/list";
    }
    @GetMapping("showupdate")
    public String showup(Model model,Integer id){
        model.addAttribute("list",mauSacService.detail(id));
        return "mausac/update";
    }
    @PostMapping("/update")
    public String update(MauSac mauSac){
        mauSacService.update(mauSac);
        return "redirect:/mausac/list";
    }
}

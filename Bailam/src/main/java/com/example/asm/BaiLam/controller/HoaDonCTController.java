package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.entity.HoaDon;
import com.example.asm.BaiLam.entity.HoaDonCT;
import com.example.asm.BaiLam.service.HoaDonCTService;
import com.example.asm.BaiLam.service.HoadonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hoadonct")
public class HoaDonCTController {
    @Autowired
    HoaDonCTService hoaDonCTService;

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", hoaDonCTService.getAllCategory(p));
        return "hoadonct/index";
    }
    @GetMapping("/showadd")
    public String showadd(Model model,Integer id){
        model.addAttribute("list",hoaDonCTService.detail(id));
        return "hoadonct/create";
    }
    @PostMapping("create")
    public String add(HoaDonCT hoaDonCT){
        hoaDonCTService.add(hoaDonCT);
        return "redirect:/hoadonct/list";
    }
    @GetMapping("/detail")
    public String showdetail(Model model,Integer id){
        model.addAttribute("list",hoaDonCTService.detail(id));
        return "hoadonct/detail";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
        hoaDonCTService.delete(id);
        return "redirect:/hoadonct/list";
    }
    @GetMapping("showupdate")
    public String showup(Model model,Integer id){
        model.addAttribute("list",hoaDonCTService.detail(id));
        return "hoadonct/update";
    }
    @PostMapping("/update")
    public String update(HoaDonCT hoaDonCT){
        hoaDonCTService.update(hoaDonCT);
        return "redirect:/hoadonct/list";
    }
}

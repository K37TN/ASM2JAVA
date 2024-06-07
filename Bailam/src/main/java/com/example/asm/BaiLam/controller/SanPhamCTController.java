package com.example.asm.BaiLam.controller;

import com.example.asm.BaiLam.entity.SanPham;
import com.example.asm.BaiLam.entity.SanPhamCT;
import com.example.asm.BaiLam.service.SanPhamCTServie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sanphamct")
public class SanPhamCTController {
 @Autowired
    SanPhamCTServie sanPhamCTServie;
    @GetMapping("/list")
    public String showList(Model model, @RequestParam(name = "p", defaultValue = "0") int p) {
        model.addAttribute("page", sanPhamCTServie.getAllCategory(p));
        return "sanphamct/index";
    }
    @GetMapping("/showadd")
    public String showadd(Model model,Integer id){
        model.addAttribute("list",sanPhamCTServie.detail(id));
        return "sanphamct/create";
    }
    @PostMapping("create")
    public String add(SanPhamCT sanPhamCT){
        sanPhamCTServie.add(sanPhamCT);
        return "redirect:/sanphamct/list";
    }
    @GetMapping("/detail")
    public String showdetail(Model model,Integer id){
        model.addAttribute("list",sanPhamCTServie.detail(id));
        return "sanphamct/detail";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
        sanPhamCTServie.delete(id);
        return "redirect:/sanphamct/list";
    }
    @GetMapping("showupdate")
    public String showup(Model model,Integer id){
        model.addAttribute("list",sanPhamCTServie.detail(id));
        return "sanphamct/update";
    }
    @PostMapping("/update")
    public String update(SanPhamCT sanPhamCT){
        sanPhamCTServie.update(sanPhamCT);
        return "redirect:/sanphamct/list";
    }
}

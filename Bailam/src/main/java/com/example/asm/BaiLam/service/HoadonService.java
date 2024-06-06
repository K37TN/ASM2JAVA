package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.HoaDon;
import com.example.asm.BaiLam.entity.KhachHang;
import org.springframework.data.domain.Page;

public interface HoadonService {
    public Page<HoaDon> getAllCategory(int p);
    public void add(HoaDon hoaDon);
    public void delete(Integer id);
    public HoaDon detail(Integer id);
    public void update(HoaDon hoaDon);

}

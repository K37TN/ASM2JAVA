package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.KhachHang;
import com.example.asm.BaiLam.entity.SanPham;
import org.springframework.data.domain.Page;

public interface KhachhangService {
    public Page<KhachHang> getAllCategory(int p);
    public void add(KhachHang khachHang);
    public void delete(Integer id);
    public KhachHang detail(Integer id);
    public void update(KhachHang khachHang);
}

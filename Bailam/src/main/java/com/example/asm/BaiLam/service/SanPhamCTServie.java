package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.HoaDonCT;
import com.example.asm.BaiLam.entity.SanPhamCT;
import org.springframework.data.domain.Page;

public interface SanPhamCTServie {
    public Page<SanPhamCT> getAllCategory(int p);
    public void add(SanPhamCT sanPhamCT);
    public void delete(Integer id);
    public SanPhamCT detail(Integer id);
    public void update(SanPhamCT sanPhamCT);
}

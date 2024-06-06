package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.SanPham;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SanphamService {
    public Page<SanPham> getAllCategory(int p);
    public void add(SanPham sanPham);
    public void delete(Integer id);
    public SanPham detail(Integer id);
    public void update(SanPham sanPham);
}

package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.SanPham;

import java.util.List;

public interface SanphamService {
    public List<SanPham> getAll();
    public void add(SanPham sanPham);
    public void delete(Integer id);
    public SanPham detail(Integer id);
    public void update(SanPham sanPham);
}

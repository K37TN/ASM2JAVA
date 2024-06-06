package com.example.asm2.Bailam.service;

import com.example.asm2.Bailam.entity.SanPham;

import java.util.List;

public interface SanPhamService {
    public List<SanPham> getAll();
    public void addSanPham(SanPham sanPham);
    public void delete(Integer id);
    public SanPham detailSanPham(Integer id);
    public void updateSanPham(SanPham sanPham);
}

package com.example.asm2.Bailam.service;

import com.example.asm2.Bailam.entity.sanpham;

import java.util.List;

public interface SanPhamService {
    public List<sanpham> getAll();
    public void addSanPham(sanpham sanpham);
    public void delete(Integer id);
    public sanpham detailSanPham(Integer id);
    public void updateSanPham(sanpham sanpham);
}

package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.NhanVien;
import com.example.asm.BaiLam.entity.SanPham;
import org.springframework.data.domain.Page;

public interface NhanvienService {
    public Page<NhanVien> getAllCategory(int p);
    public void add(NhanVien nhanVien);
    public void delete(Integer id);
    public NhanVien detail(Integer id);
    public void update(NhanVien nhanVien);
}

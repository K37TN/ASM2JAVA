package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.MauSac;
import com.example.asm.BaiLam.entity.NhanVien;
import org.springframework.data.domain.Page;

public interface MauSacService {
    public Page<MauSac> getAllCategory(int p);
    public void add(MauSac mauSac);
    public void delete(Integer id);
    public MauSac detail(Integer id);
    public void update(MauSac mauSac);
}

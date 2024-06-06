package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.KichThuoc;
import com.example.asm.BaiLam.entity.MauSac;
import org.springframework.data.domain.Page;

public interface KichThuocService {
    public Page<KichThuoc> getAllCategory(int p);
    public void add(KichThuoc kichThuoc);
    public void delete(Integer id);
    public KichThuoc detail(Integer id);
    public void update(KichThuoc kichThuoc);
}

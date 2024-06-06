package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.SanPham;
import com.example.asm.BaiLam.repository.SanphamRepository;
import com.example.asm.BaiLam.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanphamService {
    @Autowired
    SanphamRepository sanphamRepository;
    @Override
    public List<SanPham> getAll() {
        return sanphamRepository.findAll();
    }

    @Override
    public void add(SanPham sanPham) {
        sanphamRepository.save(sanPham);
    }

    @Override
    public void delete(Integer id) {
        sanphamRepository.deleteById(id);
    }

    @Override
    public SanPham detail(Integer id) {
        return sanphamRepository.findById(id).get();
    }

    @Override
    public void update(SanPham sanPham) {
        sanphamRepository.save(sanPham);
    }
}

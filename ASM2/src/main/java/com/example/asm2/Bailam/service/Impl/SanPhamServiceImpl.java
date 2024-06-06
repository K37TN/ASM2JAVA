package com.example.asm2.Bailam.service.Impl;

import com.example.asm2.Bailam.entity.SanPham;
import com.example.asm2.Bailam.repository.SanPhamRepository;
import com.example.asm2.Bailam.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;
    @Override
    public List<SanPham> getAll() {
        return sanPhamRepository.findAll();
    }

    @Override
    public void addSanPham(SanPham sanPham) {
sanPhamRepository.save(sanPham);
    }

    @Override
    public void delete(Integer id) {
sanPhamRepository.deleteById(id);
    }

    @Override
    public SanPham detailSanPham(Integer id) {
        return sanPhamRepository.findById(id).get();
    }

    @Override
    public void updateSanPham(SanPham sanPham) {
sanPhamRepository.save(sanPham);
    }
}

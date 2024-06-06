package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.KhachHang;
import com.example.asm.BaiLam.entity.SanPham;
import com.example.asm.BaiLam.repository.KhachangRepository;
import com.example.asm.BaiLam.repository.SanphamRepository;
import com.example.asm.BaiLam.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class KhachHangServiceImpl implements KhachhangService {

    @Autowired
    KhachangRepository khachangRepository;
    private static final int PAGE_SIZE = 5;
    @Override
    public Page<KhachHang> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return khachangRepository.findAll(pageable);
    }

    @Override
    public void add(KhachHang khachHang) {
khachangRepository.save(khachHang);
    }

    @Override
    public void delete(Integer id) {
khachangRepository.deleteById(id);
    }

    @Override
    public KhachHang detail(Integer id) {
        return khachangRepository.findById(id).get();
    }

    @Override
    public void update(KhachHang khachHang) {
khachangRepository.save(khachHang);
    }
}

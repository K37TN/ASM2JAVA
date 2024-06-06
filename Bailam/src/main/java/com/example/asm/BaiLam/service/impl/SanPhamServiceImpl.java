package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.SanPham;
import com.example.asm.BaiLam.repository.SanphamRepository;
import com.example.asm.BaiLam.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamServiceImpl implements SanphamService {
    @Autowired
    SanphamRepository sanphamRepository;
    private static final int PAGE_SIZE = 5;

//    @Override
//    public List<SanPham> getAll() {
//        return sanphamRepository.findAll();
//    }

    @Override
    public Page<SanPham> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return sanphamRepository.findAll(pageable);
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

package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.SanPhamCT;
import com.example.asm.BaiLam.repository.SanPhamCTRepository;
import com.example.asm.BaiLam.service.SanPhamCTServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class SanPhamCTServiceImpl implements SanPhamCTServie {
    @Autowired
    SanPhamCTRepository sanPhamCTRepository;
    private static final int PAGE_SIZE = 5;
    @Override
    public Page<SanPhamCT> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return sanPhamCTRepository.findAll(pageable);
    }

    @Override
    public void add(SanPhamCT sanPhamCT) {
sanPhamCTRepository.save(sanPhamCT);
    }

    @Override
    public void delete(Integer id) {
sanPhamCTRepository.deleteById(id);
    }

    @Override
    public SanPhamCT detail(Integer id) {
        return sanPhamCTRepository.findById(id).get();
    }

    @Override
    public void update(SanPhamCT sanPhamCT) {
sanPhamCTRepository.save(sanPhamCT);
    }
}

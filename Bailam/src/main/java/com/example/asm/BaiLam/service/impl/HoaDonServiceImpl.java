package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.HoaDon;
import com.example.asm.BaiLam.repository.HoadonRepository;
import com.example.asm.BaiLam.service.HoadonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class HoaDonServiceImpl implements HoadonService {
    @Autowired
    HoadonRepository hoadonRepository;
    private static final int PAGE_SIZE = 5;
    @Override
    public Page<HoaDon> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return hoadonRepository.findAll(pageable);
    }

    @Override
    public void add(HoaDon hoaDon) {
hoadonRepository.save(hoaDon);
    }

    @Override
    public void delete(Integer id) {
hoadonRepository.deleteById(id);
    }

    @Override
    public HoaDon detail(Integer id) {
        return hoadonRepository.findById(id).get();
    }

    @Override
    public void update(HoaDon hoaDon) {
hoadonRepository.save(hoaDon);
    }
}

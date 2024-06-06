package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.HoaDonCT;
import com.example.asm.BaiLam.repository.HoaDonCTRepository;
import com.example.asm.BaiLam.service.HoaDonCTService;
import com.example.asm.BaiLam.service.HoadonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class HoaDonCTServiceImpl implements HoaDonCTService {
    @Autowired
    HoaDonCTRepository hoaDonCTRepository;
    private static final int PAGE_SIZE = 5;
    @Override
    public Page<HoaDonCT> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return hoaDonCTRepository.findAll(pageable);
    }

    @Override
    public void add(HoaDonCT hoaDonCT) {
hoaDonCTRepository.save(hoaDonCT);
    }

    @Override
    public void delete(Integer id) {
hoaDonCTRepository.deleteById(id);
    }

    @Override
    public HoaDonCT detail(Integer id) {
        return hoaDonCTRepository.findById(id).get();
    }

    @Override
    public void update(HoaDonCT hoaDonCT) {
hoaDonCTRepository.save(hoaDonCT);
    }
}

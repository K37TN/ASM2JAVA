package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.KichThuoc;
import com.example.asm.BaiLam.repository.KichThuocRepository;
import com.example.asm.BaiLam.repository.MauSacRepository;
import com.example.asm.BaiLam.service.KichThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class KichThuocServiceImpl implements KichThuocService {
    @Autowired
    KichThuocRepository kichThuocRepository;
    private static final int PAGE_SIZE = 5;
    @Override
    public Page<KichThuoc> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return kichThuocRepository.findAll(pageable);
    }

    @Override
    public void add(KichThuoc kichThuoc) {
kichThuocRepository.save(kichThuoc);
    }

    @Override
    public void delete(Integer id) {
kichThuocRepository.deleteById(id);
    }

    @Override
    public KichThuoc detail(Integer id) {
        return kichThuocRepository.findById(id).get();
    }

    @Override
    public void update(KichThuoc kichThuoc) {
kichThuocRepository.save(kichThuoc);
    }
}

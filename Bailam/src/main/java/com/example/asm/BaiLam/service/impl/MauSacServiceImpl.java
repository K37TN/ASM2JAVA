package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.MauSac;
import com.example.asm.BaiLam.repository.MauSacRepository;
import com.example.asm.BaiLam.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MauSacServiceImpl implements MauSacService {
    @Autowired
    MauSacRepository mauSacRepository;
    private static final int PAGE_SIZE = 5;
    @Override
    public Page<MauSac> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return mauSacRepository.findAll(pageable);
    }

    @Override
    public void add(MauSac mauSac) {
mauSacRepository.save(mauSac);
    }

    @Override
    public void delete(Integer id) {
mauSacRepository.deleteById(id);
    }

    @Override
    public MauSac detail(Integer id) {
        return mauSacRepository.findById(id).get();
    }

    @Override
    public void update(MauSac mauSac) {
mauSacRepository.save(mauSac);
    }
}

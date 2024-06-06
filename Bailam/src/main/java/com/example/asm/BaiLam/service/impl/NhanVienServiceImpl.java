package com.example.asm.BaiLam.service.impl;

import com.example.asm.BaiLam.entity.KhachHang;
import com.example.asm.BaiLam.entity.NhanVien;
import com.example.asm.BaiLam.entity.SanPham;
import com.example.asm.BaiLam.repository.KhachangRepository;
import com.example.asm.BaiLam.repository.NhanvienRepository;
import com.example.asm.BaiLam.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class NhanVienServiceImpl implements NhanvienService {
    @Autowired
    NhanvienRepository nhanvienRepository;
    private static final int PAGE_SIZE = 5;
    @Override
    public Page<NhanVien> getAllCategory(int p) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(p, PAGE_SIZE, sort);
        return nhanvienRepository.findAll(pageable);
    }

    @Override
    public void add(NhanVien nhanVien) {
        nhanvienRepository.save(nhanVien);
    }

    @Override
    public void delete(Integer id) {
nhanvienRepository.deleteById(id);
    }

    @Override
    public NhanVien detail(Integer id) {
        return nhanvienRepository.findById(id).get();
    }

    @Override
    public void update(NhanVien nhanVien) {
nhanvienRepository.save(nhanVien);
    }


}

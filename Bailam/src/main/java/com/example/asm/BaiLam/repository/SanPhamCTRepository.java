package com.example.asm.BaiLam.repository;

import com.example.asm.BaiLam.entity.SanPhamCT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamCTRepository extends JpaRepository<SanPhamCT,Integer> {
}

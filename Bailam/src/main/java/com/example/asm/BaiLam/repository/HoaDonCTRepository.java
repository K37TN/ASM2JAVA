package com.example.asm.BaiLam.repository;

import com.example.asm.BaiLam.entity.HoaDonCT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonCTRepository extends JpaRepository<HoaDonCT,Integer> {
}

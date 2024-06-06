package com.example.asm.BaiLam.repository;

import com.example.asm.BaiLam.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanvienRepository extends JpaRepository<NhanVien,Integer> {
}

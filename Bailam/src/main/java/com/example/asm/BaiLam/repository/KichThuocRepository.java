package com.example.asm.BaiLam.repository;

import com.example.asm.BaiLam.entity.KichThuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KichThuocRepository extends JpaRepository<KichThuoc,Integer> {
}

package com.example.asm2.Bailam.repository;

import com.example.asm2.Bailam.entity.sanpham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository extends JpaRepository<sanpham,Integer> {

}

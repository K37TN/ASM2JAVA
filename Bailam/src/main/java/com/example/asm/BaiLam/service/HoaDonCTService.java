package com.example.asm.BaiLam.service;

import com.example.asm.BaiLam.entity.HoaDon;
import com.example.asm.BaiLam.entity.HoaDonCT;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;


public interface HoaDonCTService {
    public Page<HoaDonCT> getAllCategory(int p);
    public void add(HoaDonCT hoaDonCT);
    public void delete(Integer id);
    public HoaDonCT detail(Integer id);
    public void update(HoaDonCT hoaDonCT);
}

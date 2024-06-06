package com.example.asm.BaiLam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SanPhamChiTiet")
public class SanPhamCT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IdMauSac")
    private Integer idms;
    @Column(name = "IdKichThuoc")
    private Integer idkt;
    @Column(name = "IdSanPham")
    private Integer idsp;
    @Column(name = "MaSPCT")
    private Integer maspct;
    @Column(name = "SoLuong")
    private Integer soLuong;
    @Column(name = "DonGia")
    private Double donGia;
    @Column(name = "TrangThai")
    private Boolean trangThai;
}

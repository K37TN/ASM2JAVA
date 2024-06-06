package com.example.asm.BaiLam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonCT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Idhoadon")
    private Integer idhd;

    @Column(name = "Idspct")
    private Integer idspct;
    @Column(name = "Soluong")
    private Integer soLuong;
    @Column(name = "DonGia")
    private float donGia;
    @Column(name = "Thoigian")
    private LocalDate thoiGian;
    @Column(name = "Trangthai")
    private Boolean trangThai;
}

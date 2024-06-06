package com.example.asm.BaiLam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Hoadon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IdKH")
    private Integer idkh;
    @Column(name = "Idnv")
    private Integer idnv;
    @Column(name = "Ngaymuahang")
    private Date ngayMua;
    @Column(name = "Trangthai")
    private Boolean trangThai;
}

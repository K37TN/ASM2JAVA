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
@Table(name = "Nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Ma")
    private Integer ma;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "Tendangnhap")

    private String tendn;
    @Column(name = "Matkhau")
    private String matKhau;
    @Column(name = "Trangthai")
    private Boolean trangThai;
}

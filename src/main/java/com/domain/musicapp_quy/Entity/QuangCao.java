package com.domain.musicapp_quy.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class QuangCao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuangCao;
    private String hinhAnh;
    private String noiDung;
    @ManyToOne
    @JoinColumn(name = "idBaiHat")
    private BaiHat baiHat;
}

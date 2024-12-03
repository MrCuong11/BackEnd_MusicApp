package com.domain.musicapp_quy.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TheLoai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTheLoai;
    @ManyToOne
    @JoinColumn(name = "idChuDe")
    private ChuDe chuDe;
    private String tenTheLoai;
    private String hinhTheLoai;
}

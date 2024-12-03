package com.domain.musicapp_quy.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ChuDe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChuDe;
    private String tenChuDe;
    private String hinhChuDe;
}

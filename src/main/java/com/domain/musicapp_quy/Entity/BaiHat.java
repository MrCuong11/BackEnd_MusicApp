package com.domain.musicapp_quy.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BaiHat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBaiHat;
    @ManyToOne
    @JoinColumn(name = "idAlbum")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "idPlaylist")
    private Playlist playlist;

    private String tenBaiHat;
    private String hinhBaiHat;
    private String caSi;
    private String linkBaiHat;
}

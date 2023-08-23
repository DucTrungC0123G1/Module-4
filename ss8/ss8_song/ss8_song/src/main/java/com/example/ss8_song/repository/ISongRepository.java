package com.example.ss8_song.repository;

import com.example.ss8_song.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song,Integer> {

}

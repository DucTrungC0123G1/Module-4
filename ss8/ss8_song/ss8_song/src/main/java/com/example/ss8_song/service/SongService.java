package com.example.ss8_song.service;

import com.example.ss8_song.model.Song;
import com.example.ss8_song.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository songRepository;
    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public void add(Song song) {
        songRepository.save(song);
    }
}

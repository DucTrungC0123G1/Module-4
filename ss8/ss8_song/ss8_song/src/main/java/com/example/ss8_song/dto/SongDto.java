package com.example.ss8_song.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SongDto implements Validator {
    private int id;
    private String name;
    private String artist;
    private String typeSong;

    public SongDto() {
    }

    public SongDto(int id, String name, String artist, String typeSong) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.typeSong = typeSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTypeSong() {
        return typeSong;
    }

    public void setTypeSong(String typeSong) {
        this.typeSong = typeSong;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
    SongDto songDto = (SongDto) target;
    if (songDto.getName().equals("")){
        errors.rejectValue("name",null,"Không Được Để Trống");
    } else if (songDto.getName().length()>800) {
        errors.rejectValue("name",null,"Không Quá 800 Kí Tự");
    } else if (!songDto.getName().matches("^[a-zA-Z]*$")) {
        errors.rejectValue("name",null,"Không chứa các kí tự đặc biệt @!*$...");
        
    }
    if (songDto.getArtist().equals("")){
        errors.rejectValue("artist",null,"Không được để trống");
    } else if (songDto.getArtist().length()>800) {
        errors.rejectValue("artist",null,"Không quá 800 kí tự");
    } else if (!songDto.getArtist().matches("^[a-zA-Z]*$")) {
        errors.rejectValue("artist",null,"Không chứa các kí tự đặc biệt @!$%^...");
    }
    if (songDto.getTypeSong().equals("")){
        errors.rejectValue("typeSong",null,"không được để trống");
    } else if (songDto.getTypeSong().length()>1000) {
        errors.rejectValue("typeSong",null,"Không quá 1000 kí tự");
    } else if (!songDto.getTypeSong().matches("^[a-zA-Z]*$")) {
        errors.rejectValue("typeSong",null,"Không chứa các kí tự đặc biêt !@#$%...");
    }
    }
}

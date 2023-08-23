package com.example.ss8_song.controller;

import com.example.ss8_song.dto.SongDto;
import com.example.ss8_song.model.Song;
import com.example.ss8_song.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("/list")
    public String showFormList(Model model) {
        List<Song> songList = songService.findAll();
        model.addAttribute("songList", songList);
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        SongDto songDto = new SongDto();
        model.addAttribute("songDto", songDto);
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute SongDto songDto,
                         BindingResult bindingResult,
                         Model model,
                         RedirectAttributes redirectAttributes) {
        Song song = new Song();
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasErrors()){
            return "create";
        }
        BeanUtils.copyProperties(songDto,song);
        songService.add(song);
        redirectAttributes.addFlashAttribute("mess","Thêm Mới Thành Công");
        return "redirect:/list";
    }
    @GetMapping("song/edit")
    public String showFormEdit(Model model){
        SongDto songDto = new SongDto();
        model.addAttribute("songDto",songDto);
        return "/edit";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute SongDto songDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes){
    Song song = new Song();
    new SongDto().validate(songDto,bindingResult);
    if (bindingResult.hasErrors()){
        return "/edit";
    }
    BeanUtils.copyProperties(songDto,song);
    songService.add(song);
    redirectAttributes.addFlashAttribute("mess","Chỉnh Sửa Thành Công");
    return "redirect:/song/list";
    }
}

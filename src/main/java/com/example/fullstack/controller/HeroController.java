package com.example.fullstack.controller;


import com.example.fullstack.domain.HeroVO;
import com.example.fullstack.domain.ResultVO;
import com.example.fullstack.persistence.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/api")


public class HeroController implements HeroMapper {

    @Autowired
    private HeroMapper heroMapper;

    @CrossOrigin
    @PostMapping("/hero")
    public ResultVO addHero(@RequestBody HeroVO hero) {
        int result = heroMapper.insertHero(hero);
        if ( result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }


    @Override
    public int insertHero(HeroVO hero) {
        return 0;
    }

    @Override
    public List<HeroVO> findHero() {
        return null;
    }

    @CrossOrigin("*")
    @GetMapping("/hero/{hero_id}")
    public HeroVO findOneHero(@PathVariable int hero_id) {
        return heroMapper.findOneHero(hero_id);
    }

    @Override
    public int updateHero(HeroVO hero) {
        return 0;
    }

    @Override
    public int deleteHero(int hero_id) {
        return 0;
    }

    @CrossOrigin("*")
    @GetMapping("/heroes")
    public List<HeroVO> findOneHero() {
        return heroMapper.findHero();
    }

    @PutMapping("/hero")
    public ResultVO modifyHero(@RequestBody HeroVO hero) {
        int result = heroMapper.updateHero(hero);
        if ( result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }

    @DeleteMapping("hero")
    public ResultVO removeHero(@RequestParam int hero_id) {
        int result = heroMapper.deleteHero(hero_id);
        if ( result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }


}

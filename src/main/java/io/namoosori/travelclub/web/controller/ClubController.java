package io.namoosori.travelclub.web.controller;

import io.namoosori.travelclub.web.aggregate.club.TravelClub;
import io.namoosori.travelclub.web.service.ClubService;
import io.namoosori.travelclub.web.service.sdo.TravelClubCdo;
import io.namoosori.travelclub.web.shared.NameValueList;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubController {

    private ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

//    @PostMapping("/club") // localhost:8090/club
    @PostMapping // localhost:8090/club
    public String register(@RequestBody TravelClubCdo travelClubCdo){
        return clubService.registerClub(travelClubCdo);
    }

//    @GetMapping("/club/all")
    @GetMapping("/all")
    public List<TravelClub> findAll(){
        return clubService.findAll();
    }

//    @GetMapping("/club/{clubId}")
    @GetMapping("/{clubId}")
    public TravelClub find(@PathVariable String clubId){
        return clubService.findClubById(clubId);
    }

//    @GetMapping("/club") // localhost:8090/club?name=test
    @GetMapping // localhost:8090/club?name=test
    public List<TravelClub> findByName(@RequestParam String name){
        return clubService.findClubsByName(name);
    }

//    @PutMapping("/club/{clubId}")
    @PutMapping("/{clubId}")
    public void modify(@PathVariable String clubId,
                       @RequestBody NameValueList nameValueList){
        clubService.modify(clubId, nameValueList);
    }

//    @DeleteMapping("/club/{clubId}")
    @DeleteMapping("/{clubId}")
    public void delete(@PathVariable String clubId){
        clubService.remove(clubId);
    }
}

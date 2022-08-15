package com.test.board.controller;

import com.test.board.domain.Posting;
import com.test.board.service.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostingController {

    @Autowired
    private PostingService postingService;

    @GetMapping("/getAll")
    public List<Posting> getPostingList(){
        return postingService.getAllPosting();
    }

    @PostMapping("/write")
    public Posting writePosting(@RequestBody Posting posting){
        Posting temp = posting;
        return postingService.savePosting(posting);
    }
}

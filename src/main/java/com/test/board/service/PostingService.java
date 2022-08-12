package com.test.board.service;

import com.test.board.domain.Posting;
import com.test.board.repository.PostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingService {

    @Autowired
    private PostingRepository postingRepository;

    public List<Posting> getAllPosting(){
        return (List<Posting>) postingRepository.findAll();
    }

    public Posting savePosting(Posting posting){
        return postingRepository.save(posting);
    }
}

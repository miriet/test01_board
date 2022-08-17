package com.test.board.service;

import com.test.board.domain.Posting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostingServiceTest {

    @Autowired
    private PostingService postingService;


    @Test
    void getAllPosting() {
        List<Posting> postingList = postingService.getAllPosting();
        Assertions.assertNotNull(postingList);
    }

    @Test
    void savePosting() {
    }
}
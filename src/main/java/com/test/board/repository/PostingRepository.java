package com.test.board.repository;

import com.test.board.domain.Posting;
import org.springframework.data.repository.CrudRepository;

public interface PostingRepository extends CrudRepository<Posting, Long> {
}

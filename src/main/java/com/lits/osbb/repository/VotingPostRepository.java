package com.lits.osbb.repository;

import com.lits.osbb.model.VotingPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VotingPostRepository extends CrudRepository<VotingPost, Long> {

    Optional<VotingPost> findById(Long id);

    VotingPost findByTitleContains(String title);

    VotingPost findByAuthor(String title);

}

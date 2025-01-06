package org.example.domain.testPost.testPost.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.testPost.testPost.repository.TestPostRepository;
import org.example.freamwork.annotations.Service;

@Service
@RequiredArgsConstructor
public class TestPostService {
    private final TestPostRepository testPostRepository;
}

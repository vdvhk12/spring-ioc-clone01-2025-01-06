package org.example.domain.testPost.testPost.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.testPost.testPost.repository.TestPostRepository;
import org.example.framework.annotations.Service;

@Service
@RequiredArgsConstructor
public class TestFacadePostService {
    private final TestPostService testPostService;
    private final TestPostRepository testPostRepository;
}

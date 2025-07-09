package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDirection);

    PostDto getPostById(Long postId);

    PostDto updatePost(Long postId, PostDto postDto);

    void deletePost(Long postId);
}

package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy);

    PostDto getPostById(Long postId);

    PostDto updatePost(Long postId, PostDto postDto);

    void deletePost(Long postId);
}

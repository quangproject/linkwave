package com.example.demo.service.postlike;

import com.example.demo.dto.postlike.PostLikeDTO;

import java.util.List;
import java.util.UUID;

public interface PostLikeService {
    PostLikeDTO likePost(UUID postId);
    UUID unlikePost(UUID postLikeId);
    List<PostLikeDTO> getPostLikes(UUID postId);
}

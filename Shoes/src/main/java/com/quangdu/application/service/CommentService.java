package com.quangdu.application.service;

import com.quangdu.application.entity.Comment;
import com.quangdu.application.model.request.CreateCommentPostRequest;
import com.quangdu.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}

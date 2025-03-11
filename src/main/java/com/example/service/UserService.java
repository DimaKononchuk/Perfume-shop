package com.example.service;

import com.example.domain.Order;
import com.example.domain.User;
import com.example.dto.request.ChangePasswordRequest;
import com.example.dto.request.EditUserRequest;
import com.example.dto.request.SearchRequest;
import com.example.dto.response.MessageResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User getAuthenticatedUser();

    Page<Order> searchUserOrders(SearchRequest request, Pageable pageable);

    MessageResponse editUserInfo(EditUserRequest request);

    MessageResponse changePassword(ChangePasswordRequest request);
}

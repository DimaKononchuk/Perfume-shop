package com.example.service;

import com.example.domain.Order;
import com.example.domain.Perfume;
import com.example.domain.User;
import com.example.dto.request.PerfumeRequest;
import com.example.dto.request.SearchRequest;
import com.example.dto.response.MessageResponse;
import com.example.dto.response.UserInfoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

public interface AdminService {

    Page<Perfume> getPerfumes(Pageable pageable);

    Page<Perfume> searchPerfumes(SearchRequest request, Pageable pageable);

    Page<User> getUsers(Pageable pageable);

    Page<User> searchUsers(SearchRequest request, Pageable pageable);

    Order getOrder(Long orderId);

    Page<Order> getOrders(Pageable pageable);

    Page<Order> searchOrders(SearchRequest request, Pageable pageable);

    Perfume getPerfumeById(Long perfumeId);

    MessageResponse editPerfume(PerfumeRequest perfumeRequest, MultipartFile file);

    MessageResponse addPerfume(PerfumeRequest perfumeRequest, MultipartFile file);

    UserInfoResponse getUserById(Long userId, Pageable pageable);
}

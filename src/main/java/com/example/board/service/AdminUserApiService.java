package com.example.board.service;

import com.example.board.model.entity.AdminUser;
import com.example.board.model.network.Header;
import com.example.board.model.network.request.AdminUserApiRequest;
import com.example.board.model.network.response.AdminUserApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AdminUserApiService extends BaseService<AdminUserApiResponse, AdminUserApiRequest, AdminUser>{

    @Override
    public Header<AdminUserApiResponse> create(Header<AdminUserApiRequest> request){
        AdminUserApiRequest body = request.getData();
        AdminUser adminUser = AdminUser.builder()
                .account(body.getAccount())
                .password(body.getPassword())
                .status(body.getStatus())
                .role(body.getRole())
                .lastLoginAt(body.getLastLoginAt())
                .registeredAt(body.getRegisteredAt())
                .loginFailCount(body.getLoginFailCount())
                .passwordUpdatedAt(body.getPasswordUpdatedAt())
                .unregisteredAt(body.getUnregisteredAt())
                .build();

        AdminUser newAdminUser = baseRepository.save(adminUser);
        Assertions.assertNotNull(newAdminUser);

        return Header.OK(response(newAdminUser));
    }

    @Override
    public Header<AdminUserApiResponse> read(Long id){
        return baseRepository.findById(id)
                .map(this::response)
                .map(Header::OK)
                .orElseGet(Header::ERROR);
    }

    @Override
    public Header<AdminUserApiResponse> update(Header<AdminUserApiRequest> request){

        AdminUserApiRequest body = request.getData();
        return baseRepository.findById(body.getId())
                .map(adminUser -> {
                    adminUser
                            .setAccount("dudxks11")
                            .setPassword(body.getPassword())
                            .setStatus(body.getStatus())
                            .setRole(body.getRole())
                            .setLastLoginAt(body.getLastLoginAt())
                            .setLoginFailCount(body.getLoginFailCount())
                            .setPasswordUpdatedAt(body.getPasswordUpdatedAt())
                            .setRegisteredAt(body.getRegisteredAt())
                            .setUnregisteredAt(body.getUnregisteredAt());
                    return baseRepository.save(adminUser);
                })
                .map(this::response)
                .map(Header::OK)
                .orElseGet(Header::ERROR);


     }

     @Override
     public Header<AdminUserApiResponse> delete(Long id){
        return baseRepository.findById(id)
                .map(adminUser -> {
                    baseRepository.delete(adminUser);
                    return response(adminUser);
                })
                .map(Header::OK)
                .orElseGet(Header::ERROR);
     }

    private AdminUserApiResponse response(AdminUser adminUser){
        return AdminUserApiResponse.builder()
                .id(adminUser.getId())
                .account(adminUser.getAccount())
                .password(adminUser.getPassword())
                .status(adminUser.getStatus())
                .role(adminUser.getRole())
                .passwordUpdatedAt(adminUser.getPasswordUpdatedAt())
                .lastLoginAt(adminUser.getLastLoginAt())
                .loginFailCount(adminUser.getLoginFailCount())
                .registeredAt(adminUser.getRegisteredAt())
                .unregisteredAt(adminUser.getUnregisteredAt())
                .build();
    }
}

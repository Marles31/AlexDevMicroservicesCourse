package auth_service.services;


import auth_service.common.dto.TokenResponse;
import auth_service.common.dto.UserRequest;

public interface AuthService {
    TokenResponse createUser(UserRequest userRequest);
}

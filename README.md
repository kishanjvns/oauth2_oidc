# Authorization Code Grant Flow Implementation

This project is a sample implementation of the **Authorization Code Grant Flow** using **Spring Security and Spring Cloud Gateway**.

## Overview

The system consists of three microservices:

1. **User Service** (Resource Server) - Runs on **port 8091**
2. **UAA Service** (Authorization Server) - Runs on **port 8080**
3. **App Gateway** (OAuth2 Client and API Gateway) - Runs on **port 8090**

## Flow Description

1. A client requests `http://localhost:8091/userservice/user`.
2. The **App Gateway** intercepts the request and triggers the **Authorization Code Grant Flow**.
3. The user is redirected to the **UAA Service's login screen**.
4. Upon successful authentication, the **UAA Service** issues an **authorization code**.
5. The **App Gateway** exchanges the authorization code for an **access token**.
6. The **TokenRelay filter** in the **App Gateway** appends the access token as a **Bearer Token** when forwarding requests to downstream services.
7. The **User Service** (Resource Server) validates the token by calling the **User Info** and **JWKS endpoints** of the **UAA Service**.
8. If the token is valid, the **User Service** processes the request and returns the response.

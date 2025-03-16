### Authorization Request (Step 1)
[Click to Authorize](http://localhost:8080/oauth2/authorize?response_type=code&client_id=client&redirect_uri=https://www.manning.com/authorized&scope=openid)

#### 🔹 Parameters:
- `response_type=code` → Request an authorization code.
- `client_id=client` → The registered client ID.
- `redirect_uri=https://www.manning.com/authorized` → Where the user will be redirected after authorization.
- `scope=openid` → Request OpenID Connect (OIDC) authentication.


## OAuth2 Token Request

This request is used to exchange an **authorization code** for an **access token**.

### **📌 Endpoint**
`POST http://localhost:8080/oauth2/token`

### **🔧 Headers**
```http
Content-Type: application/x-www-form-urlencoded
Authorization: Basic Y2xpZW50OnNlY3JldA==


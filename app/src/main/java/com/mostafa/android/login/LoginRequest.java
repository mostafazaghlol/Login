package com.mostafa.android.login;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL = "http://raihana-eg.com/site_api/api/login_api";
    private Map<String, String> params;

    public LoginRequest(String username, String pass, String lang, Response.Listener<String> listener) {
        super(Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("pass", pass);
        params.put("lang", lang);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

package com.ahmaddudayef.learndaggerhilt.data.api

import com.ahmaddudayef.learndaggerhilt.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}
package com.ahmaddudayef.learndaggerhilt.data.api

import com.ahmaddudayef.learndaggerhilt.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}
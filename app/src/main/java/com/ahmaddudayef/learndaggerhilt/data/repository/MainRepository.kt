package com.ahmaddudayef.learndaggerhilt.data.repository

import com.ahmaddudayef.learndaggerhilt.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}
package business

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import entity.FullParameters
import entity.HttpReponse
import entity.PostEntity
import infra.EndPointConstants
import infra.OperationMethod
import repository.PostRepository

class PostBusiness(){
    fun getAllPosts() : List<PostEntity> {
        val url : String = EndPointConstants.BASE.URL + EndPointConstants.POST.ALL_POSTS
        val fullParameters : FullParameters = FullParameters(url, OperationMethod.GET)
        val response : HttpReponse = PostRepository.getAllPosts(fullParameters)

        return Gson().fromJson<List<PostEntity>>(response.jsonResponse, object : TypeToken<List<PostEntity>>() {}.type)

    }

    fun getSinglePost(id : Int) : PostEntity {
        val url : String = EndPointConstants.BASE.URL + EndPointConstants.POST.SINGLE_POSTS
        val fullParameters : FullParameters = FullParameters(url, OperationMethod.GET, mapOf(Pair("id", id.toString())))
        val response : HttpReponse = PostRepository.getSinglePost(fullParameters)

        return Gson().fromJson<List<PostEntity>>(response.jsonResponse, object : TypeToken<List<PostEntity>>() {}.type)[0]
    }
}
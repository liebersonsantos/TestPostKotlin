package repository

import entity.FullParameters
import entity.HttpReponse

class PostRepository private constructor(){

    companion object : BaseRepository(){

        fun getAllPosts(fullParameters: FullParameters) : HttpReponse{
            return super.execute(fullParameters)
        }

        fun getSinglePost(fullParameters: FullParameters) : HttpReponse{
            return super.execute(fullParameters)
        }

    }
}
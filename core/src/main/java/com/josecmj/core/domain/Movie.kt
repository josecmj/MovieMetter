package com.josecmj.core.domain

import java.io.Serializable

data class Movie(val id:Int, val name:String) : Serializable {
    companion object {
        val EMPTY = Rating("",0);
    }
}
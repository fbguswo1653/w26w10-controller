package kr.ac.kumoh.s20230400.w26w10_controller.repository

import kr.ac.kumoh.s20230400.w26w10_controller.model.Song

interface SongRepository {
    fun findAll(): List<Song>
}
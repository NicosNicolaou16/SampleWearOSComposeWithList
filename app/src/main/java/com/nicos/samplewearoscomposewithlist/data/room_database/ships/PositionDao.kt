package com.nicos.samplewearoscomposewithlist.data.room_database.ships

import androidx.room.Dao
import androidx.room.Query
import com.nicos.samplewearoscomposewithlist.data.room_database.init_database.BaseDao

@Dao
interface PositionDao: BaseDao<PositionModel, MutableList<PositionModel>> {

    @Query("SELECT * FROM PositionModel WHERE position_id=:id")
    suspend fun getPositionById(id: Long): PositionModel?

    @Query("DELETE FROM PositionModel")
    suspend fun deleteAll()
}
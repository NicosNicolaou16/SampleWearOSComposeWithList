package com.nicos.samplewearoscomposewithlist.data.repositories.ship_repository

import com.nicos.samplewearoscomposewithlist.data.room_database.init_database.MyRoomDatabase
import com.nicos.samplewearoscomposewithlist.data.room_database.ships.ShipsModel
import javax.inject.Inject

class ShipRepository  @Inject constructor(
    var myRoomDatabase: MyRoomDatabase
) {

    suspend fun queryShipById(id: String): ShipsModel? {
        return myRoomDatabase.shipDao().getShipById(id)
    }
}
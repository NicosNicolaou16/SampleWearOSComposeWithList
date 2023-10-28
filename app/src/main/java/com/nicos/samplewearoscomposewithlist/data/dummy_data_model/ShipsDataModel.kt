package com.nicos.samplewearoscomposewithlist.data.dummy_data_model

import com.nicos.samplewearoscomposewithlist.data.room_database.ships.ShipsModel

data class ShipsDataModel(var shipsModel: ShipsModel) {

    companion object {
        fun createShipDataModel(shipsModelList: MutableList<ShipsModel>): MutableList<ShipsDataModel> {
            return mutableListOf<ShipsDataModel>().apply {
                shipsModelList.forEach {
                    add(ShipsDataModel(shipsModel = it))
                }
            }
        }
    }
}

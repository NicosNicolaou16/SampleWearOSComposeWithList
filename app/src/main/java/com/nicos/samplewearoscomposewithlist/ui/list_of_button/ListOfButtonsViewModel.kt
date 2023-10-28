package com.nicos.samplewearoscomposewithlist.ui.list_of_button

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicos.samplewearoscomposewithlist.data.dummy_data_model.ShipsDataModel
import com.nicos.samplewearoscomposewithlist.data.remote.repositories.ships_repository.ShipsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListOfButtonsViewModel @Inject constructor() : ViewModel() {

    var shipsDataModelList = MutableStateFlow<MutableList<ShipsDataModel>>(mutableListOf())

    @Inject
    lateinit var shipsRepository: ShipsRepository

    fun requestToGetDataFromRemote() = viewModelScope.launch {
        flow {
            val shipsModelList = shipsRepository.fetchShipsData()
            emit(ShipsDataModel.createShipDataModel(shipsModelList))
        }.flowOn(Dispatchers.Default)
            .collect {
                shipsDataModelList.emit(it)
            }
    }

    fun offline() = viewModelScope.launch {
        flow {
            val shipsModelList = shipsRepository.queryToGetAllShips()
            emit(ShipsDataModel.createShipDataModel(shipsModelList))
        }.flowOn(Dispatchers.Default)
            .collect {
                shipsDataModelList.emit(it)
            }
    }

}
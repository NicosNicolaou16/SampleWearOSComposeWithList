package com.nicos.samplewearoscomposewithlist.compose.ship_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicos.samplewearoscomposewithlist.data.repositories.ship_repository.ShipRepository
import com.nicos.samplewearoscomposewithlist.data.room_database.ships.ShipsModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ShipViewModel @Inject constructor() : ViewModel() {

    val ship = MutableStateFlow<ShipsModel>(ShipsModel())

    @Inject
    protected lateinit var shipDetailsRepository: ShipRepository

    fun queryShipById(id: String) = viewModelScope.launch {
        flow {
            val shipsModel: ShipsModel? = shipDetailsRepository.queryShipById(id)
            emit(shipsModel)
        }.flowOn(Dispatchers.Default)
            .collect {
                if (it != null) {
                    ship.value = it
                }
            }
    }
}
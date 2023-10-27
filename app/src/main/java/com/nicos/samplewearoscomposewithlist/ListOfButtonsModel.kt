package com.nicos.samplewearoscomposewithlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicos.samplewearoscomposewithlist.data.dummy_data_model.DummyDataModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListOfButtonsModel @Inject constructor() : ViewModel() {

    var dummyDataModelList = MutableStateFlow<MutableList<DummyDataModel>>(mutableListOf())

    fun createDummyData() = viewModelScope.launch {
        flow {
            emit(DummyDataModel.createDummyData())
        }.flowOn(Dispatchers.Default)
            .collect {
                dummyDataModelList.emit(it)
            }
    }

}
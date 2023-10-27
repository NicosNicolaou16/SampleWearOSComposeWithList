package com.nicos.samplewearoscomposewithlist.ui.list_of_button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.wear.compose.foundation.lazy.AutoCenteringParams
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import com.nicos.samplewearoscomposewithlist.utils.screens.Screens
import kotlinx.coroutines.flow.asSharedFlow

@Composable
fun ListOfDummyData(
    listOfButtonsViewModel: ListOfButtonsViewModel = hiltViewModel(), navController: NavController,
    modifier: Modifier = Modifier
) {
    listOfButtonsViewModel.createDummyData()
    val dummyDataModelList = listOfButtonsViewModel.dummyDataModelList.asSharedFlow()
        .collectAsState(initial = mutableListOf()).value
    Box(contentAlignment = Alignment.Center, modifier = modifier) {
        val listState = rememberScalingLazyListState()
        ScalingLazyColumn(
            modifier = Modifier.fillMaxSize(),
            autoCentering = AutoCenteringParams(itemIndex = 0),
            state = listState
        ) {
            items(dummyDataModelList) { dummyDataModel ->
                TextItem(modifier = modifier, dummyDataModel.text) { text ->
                    navController.navigate(Screens.BUTTON_SCREEN + "/$text")
                }
            }
        }
    }

}

@Composable
fun TextItem(modifier: Modifier = Modifier, text: String, listener: (String) -> Unit) {
    Box(
        modifier = modifier
            .padding(bottom = 5.dp)
            .background(color = Color.Red, shape = RoundedCornerShape(30.dp))
            .size(width = 150.dp, height = 50.dp)
            .clickable {
                listener(text)
            },
        contentAlignment = Alignment.Center,
    ) {
        Text(
            modifier = modifier,
            textAlign = TextAlign.Center,
            text = text,
            color = Color.Black
        )
    }
}
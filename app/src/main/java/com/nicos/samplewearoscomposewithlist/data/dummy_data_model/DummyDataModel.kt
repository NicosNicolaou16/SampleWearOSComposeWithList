package com.nicos.samplewearoscomposewithlist.data.dummy_data_model

data class DummyDataModel(var text: String) {

    companion object {
        fun createDummyData(): MutableList<DummyDataModel> {
            return mutableListOf<DummyDataModel>().apply {
                (0 until 10).forEachIndexed { index, i ->
                    add(DummyDataModel("BUTTON $index"))
                }
            }
        }
    }
}

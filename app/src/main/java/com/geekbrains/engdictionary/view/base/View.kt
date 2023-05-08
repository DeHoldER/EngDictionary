package com.geekbrains.engdictionary.view.base

import com.geekbrains.engdictionary.model.data.AppState

interface View {

    fun renderData(appState: AppState)

}

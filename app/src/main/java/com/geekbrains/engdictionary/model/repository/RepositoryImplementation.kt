package com.geekbrains.engdictionary.model.repository

import com.geekbrains.engdictionary.model.data.DataModel
import com.geekbrains.engdictionary.model.datasource.DataSource
import io.reactivex.Observable

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}

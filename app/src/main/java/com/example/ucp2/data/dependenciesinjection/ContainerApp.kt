package com.example.p9_database.data.dependenciesinjection

import android.content.Context


interface InterfaceContainerApp{
    val repositoryDosen : RepositoryDosen
}

class ContainerApp(private val context: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryDosen by lazy {
        LocalRepositoryDosen(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}
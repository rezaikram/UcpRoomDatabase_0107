package com.example.ucp2.data.repository

import com.example.ucp2.data.dao.DosenDao


class LocalRepositoryMhs(
    private val dosenDao: DosenDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}
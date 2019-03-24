package com.valerasetrakov.media

abstract class Recorder {
    protected val records = mutableListOf<Record>()
    abstract fun start()
    abstract fun stop()

    fun read(): List<Record> {
        val list = records.toList()
        records.clear()
        return list
    }
}
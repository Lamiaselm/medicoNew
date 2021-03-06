package com.example.medico.StockageLocal.Entity

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName ="doctoremploi",foreignKeys =
arrayOf(
    ForeignKey(entity = Doctors::class,
        parentColumns = arrayOf("idDoc"),
        childColumns = arrayOf("idDoc"),
        onDelete = ForeignKey.CASCADE)

) )

data class DoctorEmplois (

    var idDoc:Int,
    var jourlibre:String,
    var moislibre:String,
    var heurelibre: String
){
    @PrimaryKey(autoGenerate = true)
    var idEmploi:Int?=null
}
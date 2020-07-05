package de.novatec.studentservice.student

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "student")
data class StudentEntity(
        val id: String = UUID.randomUUID().toString(),
        val firstName: String,
        val lastName: String,
        val userName: String,
        val salary: Int,
        val age: Int
)

fun StudentEntity.toStudent(): Student {
    return Student(id, firstName, lastName, userName, salary, age)
}
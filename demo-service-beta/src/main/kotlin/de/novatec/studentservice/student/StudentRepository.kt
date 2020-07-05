package de.novatec.studentservice.student

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface StudentRepository : MongoRepository<StudentEntity, String> {

    @Query("{'userName' : ?0}")
    fun findStudentEntityByName(userName: String): StudentEntity?

}
package de.novatec.studentservice.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/v1/student")
@CrossOrigin(origins = [], allowCredentials = "false", allowedHeaders = ["*"], methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.DELETE])
class StudentController(private val studentRepository: StudentRepository) {

    @GetMapping("/{name}")
    fun getStudentByName(@PathVariable("name") userName: String): ResponseEntity<Student> {
        val result = studentRepository.findStudentEntityByName(userName)?.toStudent()
        return if (result == null) {
            ResponseEntity.notFound().build()
        } else {
            ResponseEntity.ok(result)
        }
    }

    @DeleteMapping("/{userName}")
    fun deleteStudentByName(@PathVariable("userName") userName: String): ResponseEntity<String> {
        val result = studentRepository.findStudentEntityByName(userName)
        if (result != null) {
            studentRepository.delete(result)
        }
        return ResponseEntity.ok(userName)
    }

    @PostMapping
    fun postStudentByName(@RequestBody student: Student): ResponseEntity<Student> {
        val result = studentRepository.findStudentEntityByName(student.firstName)
        val temp = if (result == null) {
            studentRepository.save(StudentEntity(UUID.randomUUID().toString(), student.firstName, student.lastName, student.userName, student.salary, student.age))
        } else {
            studentRepository.save(StudentEntity(result.id, student.firstName, student.lastName, student.userName, student.salary, student.age))
        }
        
        return ResponseEntity.ok(temp.toStudent())
    }

    @GetMapping
    fun getAllCocktailIngredients(): ResponseEntity<List<Student>> {
        println("Get All")
        return ResponseEntity.ok(studentRepository.findAll().map { it.toStudent() })
    }
}

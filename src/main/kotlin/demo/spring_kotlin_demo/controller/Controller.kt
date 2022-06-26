package demo.spring_kotlin_demo.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/something")
class Controller {

    @PostMapping("/new")
    fun postFunction() {
         println("New post")
    }

    @GetMapping("/all")
    fun getFunction(): String {
        return "New get"
    }

}
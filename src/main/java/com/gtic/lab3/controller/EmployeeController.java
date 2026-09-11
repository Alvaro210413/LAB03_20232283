package com.gtic.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.gtic.lab3.entity.Employee;
import com.gtic.lab3.repository.EmployeeRepository;

import java.util.Optional;

@Controller
@RequestMapping("/templates")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/lista")
    public String listaEmployee(Model model) {
        model.addAttribute("listaEmployee", employeeRepository.findAllByOrderByNombreAsc());
        return "templates/lista";
    }

    @GetMapping("/nuevo")
    public String nuevaEmployee(@ModelAttribute("employee") Employee employee) {
        return "templates/nuevo";
    }

    @GetMapping("/editar")
    public String editarEmployee(@RequestParam("id") Integer id, Model model) {
        Optional<Employee> opt = employeeRepository.findById(id);
        if (opt.isPresent()) {
            model.addAttribute("employee", opt.get());
            return "templates/editar";
        }
        return "redirect:/employee/lista";
    }

    @PostMapping("/guardar")
    public String guardarEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/employee/lista";
    }

    @GetMapping("/eliminar")
    public String eliminarEmployee(Employee employee) {

        employeeRepository.delete(employee);

        return "redirect:/usuarios";
    }
}
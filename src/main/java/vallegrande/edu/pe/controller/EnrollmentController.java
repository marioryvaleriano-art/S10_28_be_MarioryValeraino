package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.entity.Enrollment;
import vallegrande.edu.pe.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin(origins = "*") // 🚀 Acepta peticiones del puerto 56474 y cualquier otro
public class EnrollmentController { // 👈 AQUÍ ABRE LA CLASE PRINCIPAL

    @Autowired
    private EnrollmentRepository repository;

    // GET: http://localhost:8080/api/enrollments
    @GetMapping
    public List<Enrollment> listar() {
        return repository.findAll();
    }

    // POST: http://localhost:8080/api/enrollments
    @PostMapping
    public Enrollment guardar(@RequestBody Enrollment enrollment) {
        return repository.save(enrollment);
    }

    // PUT: http://localhost:8080/api/enrollments/{id}
    @PutMapping("/{id}")
    public Enrollment editar(@PathVariable Long id, @RequestBody Enrollment enrollment) {
        enrollment.setId(id);
        return repository.save(enrollment);
    }

    // DELETE: http://localhost:8080/api/enrollments/{id}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }

} // 👈 AQUÍ DEBE CERRAR LA CLASE (Al final de todo el archivo)
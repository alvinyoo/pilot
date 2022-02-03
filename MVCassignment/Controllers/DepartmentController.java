@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department/{id}")
    public Department get(@PathVariable int id) {
        return departmentService.getDepartment(int id);
    }

    @PostMapping("/department")
    public void save(@RequestBody Department d) {
        departmentService.save(d);
    }

    @PutMapping("/department/{id}")
    public void put(@PathVariable int id, @RequestBody Department d) {
        departmentService.updateDepartment(id, d);
    }

    @DeleteMapping("/department/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        departmentService.deleteDepartment(id);
    }
}

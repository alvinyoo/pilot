@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id) {
        return employeeService.getEmployee(int id);
    }

    @PostMapping("/employee")
    public void save(@RequestBody Employee e) {
        employeeService.save(e);
    }

    @PutMapping("/employee/{id}")
    public void put(@PathVariable int id, @RequestBody Employee e) {
        employeeService.updateEmployee(id, e);
    }

    @DeleteMapping("/employee/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}

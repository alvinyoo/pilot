public class EmployeeDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Employee e) {
        String sql = "INSERT INTO Employee(id, name) VALUES('" + e.getId() + "', '" + e.getName()"')";
        return template.update(sql);
    }

    public int update(Employee e) {
        String sql = "UPDATE Employee SET name = '" + e.getName() + "'WHERE id = " + e.getId();
        return template.update(sql);
    }

    public int delete(int id) {
        String sql = "DELETE FROM Employee WHERE id = " + id;
        return template.update(sql);
    }

    public Employee getEmployee(int id) {
        String sql = "SELECT id, name FROM Employee WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    public List<Employee> getEmployees() {
        return template.query("SELECT * FROM Employee", new RowMapper<Employee>() {
            public Employee mapRow(ResultSet res, int row) throws SQLException {
                Employee e = new Employee();
                e.setId(res.getInt(1));
                e.setName(res.getString(2));

                return e;
            }
        });
    }
}

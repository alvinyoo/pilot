public class DepartmentDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Department d) {
        String sql = "INSERT INTO Department(id, name) VALUES('" + d.getId() + "', '" + d.getName()"')";
        return template.update(sql);
    }

    public int update(Department d) {
        String sql = "UPDATE Department SET name = '" + d.getName() + "'WHERE id = " + d.getId();
        return template.update(sql);
    }

    public int delete(int id) {
        String sql = "DELETE FROM Department WHERE id = " + id;
        return template.update(sql);
    }

    public Employee getEmployee(int id) {
        String sql = "SELECT id, name FROM Department WHERE id=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Department>(Department.class));
    }

    public List<Department> getEmployees() {
        return template.query("SELECT * FROM Department", new RowMapper<Department>() {
            public Department mapRow(ResultSet res, int row) throws SQLException {
                Department d = new Department();
                d.setId(res.getInt(1));
                d.setName(res.getString(2));

                return d;
            }
        });
    }
}

/**
 * EmployeeRole class implements Role interface and represents the role of an employee.
 */
public class EmployeeRole implements Role {
    @Override
    public String getName() {
        return "Employee";
    }

    @Override
    public String getDescription() {
        return "Employee role with limited access";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        EmployeeRole employeeRole = (EmployeeRole) obj;
        return getName().equals(employeeRole.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
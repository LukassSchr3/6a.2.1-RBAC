/**
 * AdminRole class that implements the Role interface
 * This class represents the Admin role with full access
 */

public class AdminRole implements Role {
    @Override
    public String getName() {
        return "Admin";
    }

    @Override
    public String getDescription() {
        return "Administrator role with full access";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AdminRole adminRole = (AdminRole) obj;
        return getName().equals(adminRole.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
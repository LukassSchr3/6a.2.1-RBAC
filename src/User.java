import java.util.HashSet;
import java.util.Set;

/**
 * A user from the system.
 */
public class User {
    private Set<Role> roles = new HashSet<>();

    public void addRole(Role role) {
        roles.add(role);
    }

    public void removeRole(Role role) {
        roles.remove(role);
    }

    public Set<Role> getRoles() {
        return roles;
    }
}
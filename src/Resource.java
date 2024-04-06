import java.util.HashSet;
import java.util.Set;
/**
 * Which user has access to the resource.
 */
public class Resource {
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

    public boolean checkAccess(User user) {
        for (Role role : user.getRoles()) {
            if (roles.contains(role)) {
                return true;
            }
        }
        return false;
    }
}
/**
 *  GuestRole class that implements Role interface
 */
public class GuestRole implements Role {
    @Override
    public String getName() {
        return "Guest";
    }

    @Override
    public String getDescription() {
        return "Guest role with minimal access";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GuestRole guestRole = (GuestRole) obj;
        return getName().equals(guestRole.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
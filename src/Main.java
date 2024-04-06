public class Main {
    public static void main(String[] args) {
        // Create roles
        Role adminRole = new AdminRole();
        Role employeeRole = new EmployeeRole();
        Role guestRole = new GuestRole();

        // Create users and assign roles
        User adminUser = new User();
        adminUser.addRole(adminRole);

        User employeeUser = new User();
        employeeUser.addRole(employeeRole);

        User guestUser = new User();
        guestUser.addRole(guestRole);

        // Create resource and assign roles
        Resource resource = new Resource();
        resource.addRole(adminRole);
        resource.addRole(employeeRole);

        // Check access
        System.out.println("Admin user has access: " + resource.checkAccess(adminUser));
        System.out.println("Employee user has access: " + resource.checkAccess(employeeUser));
        System.out.println("Guest user has access: " + resource.checkAccess(guestUser));
    }
}
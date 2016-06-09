package demo;

public class UserService {

    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    void createUser(String nombre, String apellido) {
        Person person = new Person(nombre, apellido);

        // Comprobaciones
        // Lógica de negocio
        // Almacenar el usuario en base de datos

        notificationService.sendNotification(person, "Usuario creado correctamente");
    }
}

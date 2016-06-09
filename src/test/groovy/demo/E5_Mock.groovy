package demo

import spock.lang.Specification

class E5_Mock extends Specification {

    void 'notificacion enviada cuando se crea un usuario'() {
        given:
            def mockedNotificationService = Mock(NotificationService)
            def userService = new UserService(mockedNotificationService)

        when:
            userService.createUser('Iván', 'López')

        then:
            1 * mockedNotificationService.sendNotification(_, 'Usuario creado correctamente')
    }

}

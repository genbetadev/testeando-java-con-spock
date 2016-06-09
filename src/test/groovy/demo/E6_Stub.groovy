package demo

import spock.lang.Specification

class E6_Stub extends Specification {

    void 'obtenemos un valor predeterminado'() {
        given:
            def stubbedRepository = Stub(PersonRepository) {
                findById(_) >> new Person('Iván', 'López')
            }

        when:
            def person = stubbedRepository.findById(1)

        then:
            person.name == 'Iván'
            person.lastName == 'López'
    }

}
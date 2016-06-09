package demo

import spock.lang.Specification

class E1_MiPrimerTest extends Specification {

    void 'invertir una cadena de texto'() {
        given: 'una cadena de text'
            def miCadena = 'Hola Genbetadev'

        when: 'la invertimos'
            def cadenaInvertida = miCadena.reverse()

        then: 'se invierte correctamente'
            cadenaInvertida == 'vedatebneG aloH'
    }

    void 'invertir una cadena de texto.'() {
        expect:
            'Hola Genbetadev'.reverse() == 'vedatebneG aloH'
    }

}

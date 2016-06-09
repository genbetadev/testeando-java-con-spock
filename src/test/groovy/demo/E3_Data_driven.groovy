package demo

import spock.lang.Specification
import spock.lang.Unroll

class E3_Data_driven extends Specification {

    void 'comprobando el máximo entre dos números'() {
        expect:
            Math.max(a, b) == resultado

        where:
            a  | b | resultado
            1  | 4 | 4
            5  | 2 | 5
            -1 | 3 | 3
    }

    @Unroll
    void 'El máximo entre dos números #a y #b es #resultado'() {
        expect:
            Math.max(a, b) == resultado

        where:
            a  | b | resultado
            1  | 4 | 4
            5  | 2 | 5
            -1 | 3 | 3
    }

}
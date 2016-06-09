package demo

import spock.lang.Specification

import java.util.stream.Collectors

class E4_Groovy extends Specification {

    void 'testeando una lista de personas'() {
        when:
            def personList = DataHelper.makePersonList()

        then:
            personList.size() == 4
            personList.name == ['Sheldon', 'Leonard', 'Raj', 'Howard']
            personList.name.sort() == ['Howard', 'Leonard', 'Raj', 'Sheldon']
            personList.lastName.collect { it.size() } == [6, 10, 12, 8]
            personList.name.min { it.length() } == 'Raj'

            println personList.name
            println personList*.name
            println personList.collect { it.name }
            println personList.collect { Person p -> p.name }
            println personList.collect { Person p -> p.getName() }
            println personList.stream().map { it.name }.collect(Collectors.toList())
            println personList.stream().map { p -> p.getName() }.collect(Collectors.toList())
    }
}

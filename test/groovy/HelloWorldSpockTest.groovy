package groovy

import spock.lang.Specification

class HelloWorldSpockTest extends Specification {
    def "GetHello"() {

        when:
        def foo ="123"

        then:
        true
    }
}

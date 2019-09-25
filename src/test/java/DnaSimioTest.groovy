class DnaSimioTest extends spock.lang.Specification {

    def "IsSimian"() {
        expect:
        DnaSimio.isSimian(dna) == expected

        where:
        dna                                                                     || expected
       ["CTGAGA", "CTGAGC", "TATTGT", "AGAGGG", "CCCCTA", "TCACTG"] as String[] || true
    }
}

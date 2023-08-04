package section14._165_search_under_maps;

import java.util.Objects;

public class Code implements Comparable<Code> {
    private String sectionNr;
    private String lectureNr;

    public Code(String sectionNr, String lectureNr) {
        this.sectionNr = sectionNr;
        this.lectureNr = lectureNr;
    }

    public String getSectionNr() {
        return sectionNr;
    }

    public String getLectureNr() {
        return lectureNr;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNr='" + sectionNr + '\'' +
                ", lectureNr='" + lectureNr + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNr.concat(lectureNr);
        String code2 = o.getSectionNr()+o.getLectureNr();
        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Code code)) return false;
        return Objects.equals(sectionNr, code.sectionNr) && Objects.equals(lectureNr, code.lectureNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNr, lectureNr);
    }
}

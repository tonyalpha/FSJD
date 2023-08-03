package section14.treemap;

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
}

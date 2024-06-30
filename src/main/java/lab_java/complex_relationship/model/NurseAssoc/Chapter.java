package lab_java.complex_relationship.model.NurseAssoc;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chapter {
    @Id
    private String name;
    private String district;
    @OneToOne
    private Member president;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Member> memberList;

    public Chapter() {
    }

    public Chapter(String name, String district, Member president, List<Member> memberList) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.memberList = memberList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", president=" + president +
                ", memberList=" + memberList +
                '}';
    }
}

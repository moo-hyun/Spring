package kr.co.sboard.entity;

import jakarta.persistence.*;
import kr.co.sboard.entity.dto.TermsDTO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Terms")
public class TermsEntity {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int no;
    private String terms;
    private String privacy;

    public TermsDTO toDTO() {
        return TermsDTO.builder()
                .no(no)
                .terms(terms)
                .privacy(privacy)
                .build();
    }
}

package models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Audit {
    @Column(name = "created_at")
    private LocalDate createAT;
    @Column(name = "uptade_at")
    private LocalDate uptadateAt;

    @PrePersist
    public void prePersist(){
        this.createAT = LocalDate.now();
    }
}

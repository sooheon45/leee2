package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BoundedContext376Application;

@Entity
@Table(name = "Aaa_table")
@Data
//<<< DDD / Aggregate Root
public class Aaa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static AaaRepository repository() {
        AaaRepository aaaRepository = BoundedContext376Application.applicationContext.getBean(
            AaaRepository.class
        );
        return aaaRepository;
    }
}
//>>> DDD / Aggregate Root
